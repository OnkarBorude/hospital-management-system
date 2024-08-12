package patient_add;

import java.io.IOException;

import appointment_management.AppointmentManagement;
import case_management.CaseManagement;
import common.RestUtil;
import dashboard_page.Dashboard;
import dto.AddPatientRequest;
import dto.AddPatientResponse;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import login_screen.LoginScreen;
import patient_management.PatientManagement;
import user_management.UserManagement;

public class AddPatientController {
	
	@FXML
	TextField pNameEng;
	
	@FXML
	TextField pNameMar;
	
	@FXML
	TextField mNum;
	
	@FXML
	TextField gender;
	
	@FXML
	TextField bDate;
	
	@FXML
	TextField ExamDate;
	
	@FXML
	TextArea address;
	
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
		
		AddPatientRequest addPatientRequest=new AddPatientRequest();
		String url="http://localhost:8082/patient/add";
		
		addPatientRequest.setPatientNameEng(pNameEng.getText());
		addPatientRequest.setPatientNameMar(pNameMar.getText());
		addPatientRequest.setGender(gender.getText());
		addPatientRequest.setMobileNumber(mNum.getText());
		addPatientRequest.setBirthDate(bDate.getText());
		addPatientRequest.setFirstExaminationDate(ExamDate.getText());
		addPatientRequest.setAddress(address.getText());
		
		AddPatientResponse addPatientResponse=RestUtil.postRequest(url, addPatientRequest, AddPatientResponse.class);
		if(addPatientResponse.getResposeCode().equals("0000")) {
			responseMsg.setText("Patient Added Successfully");
			responseMsg.setTextFill(Color.GREEN);
		}
		else {
			responseMsg.setText("Patient Addition failed");
			responseMsg.setTextFill(Color.RED);
		}
		
	}
	
	public void cancleButtonClicked() {
		new PatientManagement().show();
	}

}
