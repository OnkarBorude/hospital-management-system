package appointment_management;

import add_user.AddUser;
import appointment_add.AddAppointment;
import appointment_delete.DeleteAppointment;
import appointment_edit.EditAppointment;
import appointment_search.SearchAppointment;
import case_management.CaseManagement;
import dashboard_page.Dashboard;
import login_screen.LoginScreen;
import patient_management.PatientManagement;
import user_management.UserManagement;

public class AppointmentManagementController {
	
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
		new AddAppointment().show();
	}
	
	public void deleteButtonClicked() {
		new DeleteAppointment().show();
	}
	
	public void searchButtonClicked() {
		new SearchAppointment().show();
	}
	
	public void editButtonClicked() {
		new EditAppointment().show();
	}

}
