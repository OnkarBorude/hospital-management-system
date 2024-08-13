package user_edit;

import java.io.IOException;

import appointment_management.AppointmentManagement;
import case_management.CaseManagement;
import common.EndPoints;
import common.RestUtil;
import dashboard_page.Dashboard;
import dto.EditUserRequest;
import dto.EditUserResponse;
import dto.SearchUserResponse;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import login_screen.LoginScreen;
import patient_management.PatientManagement;
import user_management.UserManagement;

public class EditUserController {
	
	@FXML
	TextField uNameEng;
	
	@FXML
	TextField email;
	
	@FXML
	TextField mNum;
	
	@FXML
	TextField role;
	
	@FXML
	TextField password;
	
	@FXML
	TextField uId;
	
	@FXML
	Label responseMsg;
	
	public void dashboardButtonClicked() {
		new Dashboard().show();
	}
	
	public void patientButtonClicked() {
		new PatientManagement().show();
	}
	
	public void userButtonClicked() {
		new UserManagement().show();
	}
	
	public void caseButtonClicked() {
		new CaseManagement().show();
	}
	
	public void appointmentButtonClicked() {
		new AppointmentManagement().show();
	}
	
	public void logOutButtonClicked() {
		new LoginScreen().show();
	}
	
	public void searchButtonClicked() throws IOException, InterruptedException {
		String url=EndPoints.SEARCH_DIRECTORY+uId.getText();
		SearchUserResponse searchUserResponse=RestUtil.getRequest(url, SearchUserResponse.class);
		if(searchUserResponse.getResponseCode().equals("0000")) {
			uNameEng.setText(searchUserResponse.getUserName());
			email.setText(searchUserResponse.getEmail());
			mNum.setText(searchUserResponse.getMobileNumber());
			role.setText(searchUserResponse.getRole());
			password.setText(searchUserResponse.getPassword());
			responseMsg.setText("User Found");
			responseMsg.setTextFill(Color.GREEN);
		}
		else {
			responseMsg.setText("User Not Found");
			responseMsg.setTextFill(Color.RED);
		}
	}
	
	public void saveButtonClicked() throws IOException, InterruptedException {
		EditUserRequest editUserRequest=new EditUserRequest();
		String url=EndPoints.EDIT_DIRECTORY;
		editUserRequest.setUserId(uId.getText());
		editUserRequest.setUserName(uNameEng.getText());
		editUserRequest.setEmail(email.getText());
		editUserRequest.setMobileNumber(mNum.getText());
		editUserRequest.setRole(role.getText());
		editUserRequest.setPassword(password.getText());
		EditUserResponse editUserResponse=RestUtil.postRequest(url, editUserRequest, EditUserResponse.class);
		if(editUserResponse.getResponseCode().equals("0000")) {
			responseMsg.setText("User Update Successfully");
			responseMsg.setTextFill(Color.GREEN);
		}
		else {
			responseMsg.setText("User Update Failed");
			responseMsg.setTextFill(Color.RED);
		}
	}
	
	public void cancleButtonClicked() {
		new UserManagement().show();
	}

}
