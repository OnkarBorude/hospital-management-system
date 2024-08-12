package appointment_add;

import java.io.IOException;

import appointment_management.AppointmentManagement;
import case_management.CaseManagement;
import common.EndPoints;
import common.RestUtil;
import dashboard_page.Dashboard;
import dto.AddAppointmentRequest;
import dto.AddAppointmentResponse;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import login_screen.LoginScreen;
import patient_management.PatientManagement;
import user_management.UserManagement;

public class AddAppointmentController {
	
	@FXML
	TextField pNameEng;
	
	@FXML
	TextField pId;
	
	@FXML
	TextField aId;
	
	@FXML
	TextField ExamDate;
	
	@FXML
	TextField aptTime;
	
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
		AddAppointmentRequest addAppointmentRequest=new AddAppointmentRequest();
		String url=EndPoints.ADD_APPOINTMENT;
		addAppointmentRequest.setPatientNameEng(pNameEng.getText());
		addAppointmentRequest.setPatientId(pId.getText());
		addAppointmentRequest.setAppointmentTime(aptTime.getText());
		addAppointmentRequest.setExaminationDate(ExamDate.getText());
		AddAppointmentResponse addAppointmentResponse=RestUtil.postRequest(url, addAppointmentRequest, AddAppointmentResponse.class);
		if(addAppointmentResponse.getResponseCode().equals("0000")) {
			responseMsg.setText("Appointment Added Successfully");
			responseMsg.setTextFill(Color.GREEN);
		}
		else {
			responseMsg.setText("Appointment Addition Failed");
			responseMsg.setTextFill(Color.RED);
		}
	}
	
	public void cancleButtonClicked() {
		new AppointmentManagement().show();
	}
	

}
