package cases.dto;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class EditCaseResponse {
	
	private String responseCode;
	private String messege;
	private EditCaseRequest editCaseRequest;
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
	public EditCaseRequest getEditCaseRequest() {
		return editCaseRequest;
	}
	public void setEditCaseRequest(EditCaseRequest editCaseRequest) {
		this.editCaseRequest = editCaseRequest;
	}
	

}
