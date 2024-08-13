package dto;


public class EditUserResponse {
	
	private String responseCode;
	private String messege;
	private EditUserRequest editUserRequest;
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
	public EditUserRequest getEditUserRequest() {
		return editUserRequest;
	}
	public void setEditUserRequest(EditUserRequest editUserRequest) {
		this.editUserRequest = editUserRequest;
	}
	

}
