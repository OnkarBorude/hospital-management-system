package dto;

public class AddUserResponse {
	
	private String responseCode;
	private String messege;
	private AddUserRequest addUserRequest;
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
	public AddUserRequest getAddUserRequest() {
		return addUserRequest;
	}
	public void setAddUserRequest(AddUserRequest addUserRequest) {
		this.addUserRequest = addUserRequest;
	}
	

}
