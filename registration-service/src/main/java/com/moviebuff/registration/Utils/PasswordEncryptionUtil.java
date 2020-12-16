package com.moviebuff.registration.Utils;

import java.security.NoSuchAlgorithmException;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class PasswordEncryptionUtil {

	private static final String SALT = "RaDhA900KiHaN";

	public static void encryptPassword(String password) throws NoSuchAlgorithmException {
		password = BCrypt.hashpw(password, SALT);
	}

	public static boolean checkPassword(String password, String hashedPassword) throws NoSuchAlgorithmException {
		return BCrypt.checkpw(password, hashedPassword);
	}

}
