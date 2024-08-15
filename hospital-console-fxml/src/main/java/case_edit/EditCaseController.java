package case_edit;

import java.io.IOException;

import appointment_management.AppointmentManagement;
import case_management.CaseManagement;
import common.EndPoints;
import common.RestUtil;
import dashboard_page.Dashboard;
import dto.EditCaseRequest;
import dto.EditCaseResponse;
import dto.SearchCaseResponse;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import login_screen.LoginScreen;
import patient_management.PatientManagement;
import user_management.UserManagement;

public class EditCaseController {
	
	@FXML
	TextField cId;
	
	@FXML
	TextField pId;
	
	@FXML
	TextField pNameEng;
	
	@FXML
	TextField pId2;
	
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
	
	public void searchButtonClicked() throws IOException, InterruptedException {
		String url=EndPoints.SEARCH_CASE+cId.getText()+"/"+pId.getText();
		SearchCaseResponse searchCaseResponse=RestUtil.getRequest(url, SearchCaseResponse.class);
		if(searchCaseResponse.getResponseCode().equals("0000")) {
			responseMsg.setText("Case Found");
			responseMsg.setTextFill(Color.GREEN);
			pId.setText(searchCaseResponse.getPatientId());
			pNameEng.setText(searchCaseResponse.getPatientNameEng());
			pId2.setText(searchCaseResponse.getPatientId());
			ExamDate.setText(searchCaseResponse.getExaminationDate());
			cNum.setText(searchCaseResponse.getCaseNumber());
			symptoms.setText(searchCaseResponse.getSymptoms());
			prescription.setText(searchCaseResponse.getPrescription());
		}else {
			responseMsg.setText("Case Not Found");
			responseMsg.setTextFill(Color.RED);
		}
	}
	
	public void saveButtonClicked() throws IOException, InterruptedException {
		String url=EndPoints.EDIT_CASE;
		EditCaseRequest editCaseRequest=new EditCaseRequest();
		editCaseRequest.setCaseId(cId.getText());
		editCaseRequest.setPatientNameEng(pNameEng.getText());
		editCaseRequest.setPatientId(pId.getText());
		editCaseRequest.setCaseNumber(cNum.getText());
		editCaseRequest.setExaminationDate(ExamDate.getText());
		editCaseRequest.setSymptoms(symptoms.getText());
		editCaseRequest.setPrescription(prescription.getText());
		
		EditCaseResponse editCaseResponse=RestUtil.postRequest(url, editCaseRequest, EditCaseResponse.class);
		if(editCaseResponse.getResponseCode().equals("0000")) {
			responseMsg.setText("Case Edit Successfully");
			responseMsg.setTextFill(Color.GREEN);
		}
		else {
			responseMsg.setText("Case Edition Failed");
			responseMsg.setTextFill(Color.RED);
		}
	}
	
	public void cancleButtonClicked() {
		new CaseManagement().show();
	}
	

}
