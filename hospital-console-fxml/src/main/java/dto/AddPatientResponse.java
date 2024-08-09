package dto;

public class AddPatientResponse {
	
	private String resposeCode;
	private String messege;
	private AddPatientRequest addPatientRequest;
	public String getResposeCode() {
		return resposeCode;
	}
	public void setResposeCode(String resposeCode) {
		this.resposeCode = resposeCode;
	}
	public String getMessege() {
		return messege;
	}
	public void setMessege(String messege) {
		this.messege = messege;
	}
	public AddPatientRequest getAddPatientRequest() {
		return addPatientRequest;
	}
	public void setAddPatientRequest(AddPatientRequest addPatientRequest) {
		this.addPatientRequest = addPatientRequest;
	}
	

}
