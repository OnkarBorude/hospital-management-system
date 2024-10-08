package patient_edit;

import java.io.IOException;

import appointment_management.AppointmentManagement;
import case_management.CaseManagement;
import common.EndPoints;
import common.RestUtil;
import dashboard_page.Dashboard;
import dto.EditPatientRequest;
import dto.EditPatientResponse;
import dto.SearchPatientResponse;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import login_screen.LoginScreen;
import patient_management.PatientManagement;
import user_management.UserManagement;

public class EditPatientController {
	
	@FXML 
	TextField pId;
	
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
	
	public void searchButtonClicked() throws IOException, InterruptedException {
		String url="http://localhost:8082/patient/search/"+pId.getText()+"/"+pNameEng.getText();
		SearchPatientResponse searchPatientResponse=RestUtil.getRequest(url, SearchPatientResponse.class);
		if(searchPatientResponse.getResponseCode().equals("0000")) {
			pNameEng.setText(searchPatientResponse.getPatientNameEng());
			pNameMar.setText(searchPatientResponse.getPatientNameMar());
			mNum.setText(searchPatientResponse.getMobileNumber());
			gender.setText(searchPatientResponse.getGender());
			bDate.setText(searchPatientResponse.getBirthDate());
			ExamDate.setText(searchPatientResponse.getFirstExaminationDate());
			address.setText(searchPatientResponse.getAddress());
			responseMsg.setText("Patient Found Successfully");
			responseMsg.setTextFill(Color.GREEN);
		}
		else {
			responseMsg.setText("Patient Not Found");
			responseMsg.setTextFill(Color.RED);
		}
	}
	
	public void saveButtonClicked() throws IOException, InterruptedException {
		EditPatientRequest editPatientRequest=new EditPatientRequest();
		String url=EndPoints.EDIT_PATIENT;
		
		editPatientRequest.setPatientId(pId.getText());
		editPatientRequest.setPatientNameEng(pNameEng.getText());
		editPatientRequest.setPatientNameMar(pNameMar.getText());
		editPatientRequest.setMobileNumber(mNum.getText());
		editPatientRequest.setGender(gender.getText());
		editPatientRequest.setBirthDate(bDate.getText());
		editPatientRequest.setFirstExaminationDate(ExamDate.getText());
		editPatientRequest.setAddress(address.getText());
		
		EditPatientResponse editPatientResponse=RestUtil.postRequest(url, editPatientRequest, EditPatientResponse.class);
		if(editPatientResponse.getResponseCode().equals("0000")) {
			responseMsg.setText("Patient Update Successfully");
			responseMsg.setTextFill(Color.GREEN);
		}
		else {
			responseMsg.setText("Patient Update Failed");
			responseMsg.setTextFill(Color.RED);
		}
		
		
	}
	
	public void cancleButtonClicked() {
		new PatientManagement().show();
	}

}
