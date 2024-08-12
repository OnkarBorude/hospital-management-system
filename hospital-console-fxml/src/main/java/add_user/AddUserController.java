package add_user;

import java.io.IOException;

import com.sun.prism.paint.Color;

import appointment_management.AppointmentManagement;
import case_management.CaseManagement;
import common.EndPoints;
import common.RestUtil;
import dashboard_page.Dashboard;
import dto.AddUserRequest;
import dto.AddUserResponse;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import login_screen.LoginScreen;
import patient_management.PatientManagement;
import user_management.UserManagement;

public class AddUserController {
	
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
	TextField cPassword;
	
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
	
	public void saveButtonClicked() throws IOException, InterruptedException {
		
		AddUserRequest addUserRequest=new AddUserRequest();
		String url=EndPoints.ADD_DIRECTORY;
		
		addUserRequest.setUserName(uNameEng.getText());
		addUserRequest.setMobileNumber(mNum.getText());
		addUserRequest.setEmail(email.getText());
		addUserRequest.setRole(role.getText());
		addUserRequest.setPassword(password.getText());
		
		if(cPassword.getText().equals(password.getText())) {
			AddUserResponse addUserResponse=RestUtil.postRequest(url, addUserRequest, AddUserResponse.class);
			if(addUserResponse.getResponseCode().equals("0000")) {
				responseMsg.setText("Add User Successfully");
				
			}
			else {
				responseMsg.setText("User Addition Failed");
				
			}
		}else {
			responseMsg.setText("Miss match password");
		}
		
		
	}
	
	public void cancleButtonClicked() {
		new UserManagement().show();
	}
	

}
