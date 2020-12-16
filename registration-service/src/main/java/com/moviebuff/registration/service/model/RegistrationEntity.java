package com.moviebuff.registration.service.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Table
@Entity
public class RegistrationEntity {

	@Id
	@GeneratedValue(generator = "sequence-generator")
	@GenericGenerator(name = "sequence-generator", strategy = "org.hibernator.id.enhanced.SequenceStyleGenerator", parameters = {
			@org.hibernate.annotations.Parameter(name = "sequence_name", value = "user_sequence"),
			@org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
			@org.hibernate.annotations.Parameter(name = "increment_size", value = "1") })
	@Column(unique = true, nullable = false)
	private Integer userId;
	@Column(nullable = false)
	private String firstName;
	@Column
	private String middleName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String accountType;
	@Column(nullable = false)
	private boolean activeStatus;
	@Column(nullable = false)
	private String emailID;
	@Column(nullable = false)
	private Date dateOfBirth;
	@Column(length = 3, nullable = false)
	private String age;
	@Column(length = 3, nullable = false)
	@Size(max = 3, message = "max_size_violation")
	private String countryCode;
	@Column(length = 10, nullable = false)
	@Size(max = 10, message = "max_size_violation")
	private String phoneNumber;
	@Column(nullable = false)
	private String sex;
	@Column(nullable = false)
	private String nationality;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistrationEntity other = (RegistrationEntity) obj;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (activeStatus != other.activeStatus)
			return false;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (emailID == null) {
			if (other.emailID != null)
				return false;
		} else if (!emailID.equals(other.emailID))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (nationality == null) {
			if (other.nationality != null)
				return false;
		} else if (!nationality.equals(other.nationality))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + (activeStatus ? 1231 : 1237);
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((emailID == null) ? 0 : emailID.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "UserId: " + userId + "\nFirstName: " + firstName + "\nMiddleName: " + middleName + "\nLastName: "
				+ lastName + "\nPassword: " + password + "\nAccountType: " + accountType + "\nActiveStatus: "
				+ activeStatus + "\nEmailID: " + emailID + "\nDateOfBirth: " + dateOfBirth + "\nAge: " + age
				+ "\nCountryCode=" + countryCode + "\nPhoneNumber: " + phoneNumber + "\nSex: " + sex + "\nNationality="
				+ nationality;
	}

}
