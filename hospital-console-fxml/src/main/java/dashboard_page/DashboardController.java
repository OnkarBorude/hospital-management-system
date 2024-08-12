package dashboard_page;

import appointment_management.AppointmentManagement;
import case_management.CaseManagement;
import login_screen.LoginScreen;
import patient_management.PatientManagement;
import user_management.UserManagement;

public class DashboardController {
	
	public void patientButtonClicked() {
		
		new PatientManagement().show();
		
	}
	
	public void casesButtonClicked() {
		
		new CaseManagement().show();
		
	}
	
	public void appointmentButtonClicked() {
		
		new AppointmentManagement().show();
	}
	
	public void userButtonClicked() {
		new UserManagement().show();
	}
	
	public void logOutButtonClicked() {
		new LoginScreen().show();
		
	}

}
