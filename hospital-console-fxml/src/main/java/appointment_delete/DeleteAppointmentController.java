package appointment_delete;

import java.io.IOException;

import appointment_management.AppointmentManagement;
import case_management.CaseManagement;
import common.EndPoints;
import common.RestUtil;
import dashboard_page.Dashboard;
import dto.DeleteAppointmentResponse;
import dto.SearchAppointmentResponse;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import login_screen.LoginScreen;
import patient_management.PatientManagement;
import user_management.UserManagement;

public class DeleteAppointmentController {
	
	@FXML
	TextField aId;
	
	@FXML
	TextField pId;
	
	@FXML
	TextField pNameEng;
	
	@FXML
	TextField aId2;
	
	@FXML
	TextField pId2;
	
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
	
	public void searchButtonClicked() throws IOException, InterruptedException {
		String url=EndPoints.SEARCH_APPOINTMENT+aId.getText()+"/"+pId.getText();
		SearchAppointmentResponse searchAppointmentResponse=RestUtil.getRequest(url, SearchAppointmentResponse.class);
		if(searchAppointmentResponse.getResponseCode().equals("0000")) {
			
			pId.setText(searchAppointmentResponse.getPatientId());
			pNameEng.setText(searchAppointmentResponse.getPatientNameEng());
			aId2.setText(searchAppointmentResponse.getAppointmentId());
			pId2.setText(searchAppointmentResponse.getPatientId());
			ExamDate.setText(searchAppointmentResponse.getExaminationDate());
			aptTime.setText(searchAppointmentResponse.getAppointmentTime());
			responseMsg.setText("Appointment Found");
			responseMsg.setTextFill(Color.GREEN);
		}
		else {
			responseMsg.setText("Appointment Not Found");
			responseMsg.setTextFill(Color.RED);
		}
	}
	
	public void deleteButtonClicked() throws IOException, InterruptedException {
		String url=EndPoints.DELETE_APPOINTMENT+aId.getText();
		DeleteAppointmentResponse deleteAppointmentResponse=RestUtil.deleteRequest(url, DeleteAppointmentResponse.class);
		if(deleteAppointmentResponse.getResponseCode().equals("0000")) {
			responseMsg.setText("Appointment Deleted successfully");
			responseMsg.setTextFill(Color.GREEN);
		}
		else {
			responseMsg.setText("Appointment Deletion Failed");
			responseMsg.setTextFill(Color.RED);
		}
	}
	
	public void cancleButtonClicked() {
		new AppointmentManagement().show();
	}
}
