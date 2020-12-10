package com.moviebuff.registration.service.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

@Data
@Table
@Entity
public class RegistrationEntity {

    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(name = "sequence-generator", strategy = "org.hibernator.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "user_sequence"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
            })
    @Column(
            unique = true,
            nullable = false
    )
    private Integer userId;
    @Column(
            nullable = false
    )
    private String firstName;
    @Column
    private String middleName;
    @Column(
            nullable = false
    )
    private String lastName;
    @Column(
            nullable = false
    )
    private String password;
    @Column(
            nullable = false
    )
    private String copyPassword;
    @Column(
            nullable = false
    )
    private String emailID;
    @Column(
            nullable = false
    )
    private Date dateOfBirth;
    @Column(
            length = 3,
            nullable = false
    )
    private String age;
    @Column(
            length = 3,
            nullable = false
    )
    @Size(
            max = 3,
            message = "max_size_violation")
    private String countryCode;
    @Column(
            length = 10,
            nullable = false
    )
    @Size(
            max = 10,
            message = "max_size_violation"
    )
    private String phoneNumber;
    @Column(
            nullable = false
    )
    private String sex;
    @Column(
            nullable = false
    )
    private String nationality;

    @Override
    public String toString() {
        return "RegistrationEntity:" +
                "\nUserId: " + userId +
                "\nFirstName: " + firstName +
                "\nMiddleName: " + middleName +
                "\nLastName: " + lastName +
                "\nPassword: " + password +
                "\nCopyPassword: " + copyPassword +
                "\nEmailID: " + emailID +
                "\nDateOfBirth: " + dateOfBirth +
                "\nAge: " + age +
                "\nCountryCode: " + countryCode +
                "\nPhoneNumber: " + phoneNumber +
                "\nSex: " + sex +
                "\nNationality: " + nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegistrationEntity)) return false;
        RegistrationEntity that = (RegistrationEntity) o;
        return getUserId().equals(that.getUserId()) &&
                getFirstName().equals(that.getFirstName()) &&
                Objects.equals(getMiddleName(), that.getMiddleName()) &&
                getLastName().equals(that.getLastName()) &&
                getPassword().equals(that.getPassword()) &&
                getCopyPassword().equals(that.getCopyPassword()) &&
                getEmailID().equals(that.getEmailID()) &&
                getDateOfBirth().equals(that.getDateOfBirth()) &&
                getAge().equals(that.getAge()) &&
                getCountryCode().equals(that.getCountryCode()) &&
                getPhoneNumber().equals(that.getPhoneNumber()) &&
                getSex().equals(that.getSex()) &&
                getNationality().equals(that.getNationality());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getFirstName(), getMiddleName(), getLastName(), getPassword(),
                getCopyPassword(), getEmailID(), getDateOfBirth(), getAge(), getCountryCode(), getPhoneNumber(),
                getSex(), getNationality());
    }
}
