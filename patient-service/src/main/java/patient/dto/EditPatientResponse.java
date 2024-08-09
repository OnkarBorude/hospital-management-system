package patient.dto;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class EditPatientResponse {
	
	private String responseCode;
	private String messege;
	private EditPatientRequest editPatientRequest;
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
	public EditPatientRequest getEditPatientRequest() {
		return editPatientRequest;
	}
	public void setEditPatientRequest(EditPatientRequest editPatientRequest) {
		this.editPatientRequest = editPatientRequest;
	}
	

}
