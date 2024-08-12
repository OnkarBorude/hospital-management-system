package dto;

public class SearchPatientResponse {
	
	
	private String patientId;
	private String patientNameEng;
	private String patientNameMar;
	private String mobileNumber;
	private String gender;
	private String birthDate;
	private String firstExaminationDate;
	private String address;
	private String responseCode;
	private String messege;
	
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getMessege() {
		return messege;
	}
	public void setMessege(String messege) {
		this.messege = messege;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
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
