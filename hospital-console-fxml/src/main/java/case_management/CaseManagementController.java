package case_management;

import appointment_management.AppointmentManagement;
import case_add.AddCase;
import case_delete.DeleteCase;
import case_edit.EditCase;
import case_search.SearchCase;
import dashboard_page.Dashboard;
import login_screen.LoginScreen;
import patient_management.PatientManagement;
import user_management.UserManagement;

public class CaseManagementController {
	
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
		new AddCase().show();
	}
	
	public void deleteButtonClicked() {
		new DeleteCase().show();
	}
	
	public void editButtonClicked() {
		new EditCase().show();
	}
	
	public void searchButtonClicked(){
		new SearchCase().show();
	}

}
