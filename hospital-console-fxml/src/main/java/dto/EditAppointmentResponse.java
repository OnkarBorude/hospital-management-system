package dto;

public class EditAppointmentResponse {
	
	private String responseCode;
	private String messege;
	private EditAppointmentRequest editAppointmentRequest;
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
	public EditAppointmentRequest getEditAppointmentRequest() {
		return editAppointmentRequest;
	}
	public void setEditAppointmentRequest(EditAppointmentRequest editAppointmentRequest) {
		this.editAppointmentRequest = editAppointmentRequest;
	}
	

}
