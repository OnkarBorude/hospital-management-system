package dto;

public class AddAppointmentResponse {
	
	private String responseCode;
	private String messege;
	private AddAppointmentRequest addAppointmentRequest;
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
	public AddAppointmentRequest getAddAppointmentRequest() {
		return addAppointmentRequest;
	}
	public void setAddAppointmentRequest(AddAppointmentRequest addAppointmentRequest) {
		this.addAppointmentRequest = addAppointmentRequest;
	}
	

}
