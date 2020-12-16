package com.moviebuff.registration.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviebuff.registration.model.RegistrationEntity;

@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Integer> {

	public Optional<RegistrationEntity> findByEmailID(String emailID);
}
