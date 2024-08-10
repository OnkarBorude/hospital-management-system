package cases.dto;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class AddCaseResponse {
	
	private String responseCode;
	private String messege;
	private AddCaseRequest addCaseRequest;
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
	public AddCaseRequest getAddCaseRequest() {
		return addCaseRequest;
	}
	public void setAddCaseRequest(AddCaseRequest addCaseRequest) {
		this.addCaseRequest = addCaseRequest;
	}
	

}
