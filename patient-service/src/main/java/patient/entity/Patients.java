package patient.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Patients {
	
	@Id
	@GeneratedValue
	@Column
	private Integer patientId;
	
	@Column
	private String patientNameEng;
	
	@Column
	private String patientNameMar;
	
	@Column
	private Long mobileNumber;
	
	@Column
	private String gender;
	
	@Column
	private String birthDate;
	
	@Column
	private String firstExaminationDate;
	
	@Column
	private String address;
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getPatientNameEng() {
		return patientNameEng;
	}
	public void setPatientNameEng(String patientNameEng) {
		this.patientNameEng = patientNameEng;
	}
	public String getPatientNameMar() {
		return patientNameMar;
	}
	public void setPatientNameMar(String patientNameMar) {
		this.patientNameMar = patientNameMar;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getFirstExaminationDate() {
		return firstExaminationDate;
	}
	public void setFirstExaminationDate(String firstExaminationDate) {
		this.firstExaminationDate = firstExaminationDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
