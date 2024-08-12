package common;

public class EndPoints {
	
	public static final String DIRECTORY_BASE_URL="http://localhost:8081/";
	public static final String PATIENT_BASE_URL="http://localhost:8082/";
	public static final String CASE_BASE_URL="http://localhost:8083/";
	public static final String APPOINTMENT_BASE_URL="http://localhost:8084/";
	
	public static final String ADD_PATIENT=PATIENT_BASE_URL+"patient/add";
	public static final String EDIT_PATIENT=PATIENT_BASE_URL+"patient/edit";
	public static final String DELETE_PATIENT=PATIENT_BASE_URL+"patient/delete/";
	public static final String SEARCH_PATIENT=PATIENT_BASE_URL+"patient/search/";
	
	public static final String ADD_APPOINTMENT=APPOINTMENT_BASE_URL+"appointment/add";
	public static final String EDIT_APPOINTMENT=APPOINTMENT_BASE_URL+"appointment/edit";
	public static final String DELETE_APPOINTMENT=APPOINTMENT_BASE_URL+"appointment/delete/";
	public static final String SEARCH_APPOINTMENT=APPOINTMENT_BASE_URL+"appointment/search/";
	
	public static final String ADD_CASE=CASE_BASE_URL+"case/add";
	public static final String EDIT_CASE=CASE_BASE_URL+"case/edit";
	public static final String DELETE_CASE=CASE_BASE_URL+"case/delete/";
	public static final String SEARCH_CASE=CASE_BASE_URL+"case/search/";
	
	public static final String ADD_DIRECTORY=DIRECTORY_BASE_URL+"directory/add";
	public static final String EDIT_DIRECTORY=DIRECTORY_BASE_URL+"directory/edit";
	public static final String DELETE_DIRECTORY=DIRECTORY_BASE_URL+"directory/delete/";
	public static final String SEARCH_DIRECTORY=DIRECTORY_BASE_URL+"directory/search/";
	public static final String LOGIN=DIRECTORY_BASE_URL+"directory/login";

}
