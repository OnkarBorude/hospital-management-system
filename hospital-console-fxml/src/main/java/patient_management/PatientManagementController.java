package patient_management;

import appointment_management.AppointmentManagement;
import case_management.CaseManagement;
import dashboard_page.Dashboard;
import login_screen.LoginScreen;
import patient_add.AddPatient;
import patient_delete.DeletePatient;
import patient_edit.EditPatient;
import patient_search.SearchPatient;
import user_management.UserManagement;

public class PatientManagementController {
	
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
		new AddPatient().show();
	}
	
	public void deleteButtonClicked() {
		new DeletePatient().show();
	}
	
	public void editButtonClicked() {
		new EditPatient().show();
	}
	
	public void searchButtonClicked(){
		new SearchPatient().show();
	}
}
