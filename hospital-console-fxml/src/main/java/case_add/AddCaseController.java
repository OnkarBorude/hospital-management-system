package case_add;

import java.io.IOException;

import appointment_management.AppointmentManagement;
import case_management.CaseManagement;
import common.EndPoints;
import common.RestUtil;
import dashboard_page.Dashboard;
import dto.AddCaseRequest;
import dto.AddCaseResponse;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import login_screen.LoginScreen;
import patient_management.PatientManagement;
import user_management.UserManagement;

public class AddCaseController {
	
	@FXML
	TextField pNameEng;
	
	@FXML
	TextField pId;
	
	@FXML
	TextField ExamDate;
	
	@FXML
	TextField cNum;
	
	@FXML
	TextField symptoms;
	
	@FXML
	TextArea prescription;
	
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
		
		AddCaseRequest addCaseRequest=new AddCaseRequest();
		String url=EndPoints.ADD_CASE;
		addCaseRequest.setPatientNameEng(pNameEng.getText());
		addCaseRequest.setPatientId(pId.getText());
		addCaseRequest.setCaseNumber(cNum.getText());
		addCaseRequest.setExaminationDate(ExamDate.getText());
		addCaseRequest.setSymptoms(symptoms.getText());
		addCaseRequest.setPrescription(prescription.getText());
		AddCaseResponse addCaseResponse=RestUtil.postRequest(url, addCaseRequest, AddCaseResponse.class);
		if(addCaseResponse.getResponseCode().equals("0000")) {
			responseMsg.setText("Case Added Successfully");
			responseMsg.setTextFill(Color.GREEN);
		}
		else {
			responseMsg.setText("Case Addition Failed");
			responseMsg.setTextFill(Color.RED);
		}
	}
	
	public void cancleButtonClicked() {
		new CaseManagement().show();
	}
	
	

}
