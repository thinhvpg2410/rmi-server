package entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor extends Person implements Serializable {

	private static final long serialVersionUID = -6067501781791775003L;
	
	private String speciality;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "departmant_id")
	private Department department;
	public Doctor() {
		// TODO Auto-generated constructor stub
	}
	public Doctor(String speciality, Department department) {
		super();
		this.speciality = speciality;
		this.department = department;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Doctor [speciality=" + speciality + ", department=" + department + "]";
	}
	
	
	

}
