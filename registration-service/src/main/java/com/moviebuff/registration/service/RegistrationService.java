package com.moviebuff.registration.service;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviebuff.registration.Utils.PasswordEncryptionUtil;
import com.moviebuff.registration.model.RegistrationEntity;
import com.moviebuff.registration.repository.RegistrationRepository;

import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.asm.Advice.This;

@Service
@Slf4j
public class RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;

	public RegistrationEntity saveUserData(RegistrationEntity registrationEntity) {
		try {
			encryptPassword(registrationEntity.getPassword());
		} catch (NoSuchAlgorithmException e) {
			log.info("Error occured during password Encryption {}", e.getMessage());
		}
		return registrationRepository.save(registrationEntity);
	}
	
	public boolean loginUser(Integer userId, String password) throws NoSuchAlgorithmException {
		registrationRepository.findById(userId).ifPresent(registrationEntity -> {
		});
		return false;
	}

	private void encryptPassword(String password) throws NoSuchAlgorithmException {
		PasswordEncryptionUtil.encryptPassword(password);
	}

	private void checkPassword(String password, String hashedPassword) throws NoSuchAlgorithmException {
		PasswordEncryptionUtil.checkPassword(password, hashedPassword);
	}

}
