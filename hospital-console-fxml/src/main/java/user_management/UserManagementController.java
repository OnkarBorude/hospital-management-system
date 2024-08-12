package user_management;

import add_user.AddUser;
import appointment_management.AppointmentManagement;
import case_management.CaseManagement;
import dashboard_page.Dashboard;
import login_screen.LoginScreen;
import patient_management.PatientManagement;

public class UserManagementController {
	
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
	
	public void addButtonClicked() {
		new AddUser().show();
	}
	
	public void deleteButtonClicked() {
		
	}
	
	public void searchButtonClicked() {
		
	}
	
	public void editButtonClicked() {
		
	}

}
