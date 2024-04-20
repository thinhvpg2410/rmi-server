package entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "patients")
public class Patient extends Person implements Serializable{

	private static final long serialVersionUID = -5193478249838086857L;
	
	private String gender;
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	private String address;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String gender, String dateOfBirth, String address) {
		super();
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Patient [gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", address=" + address + "]";
	}
	
	

}
