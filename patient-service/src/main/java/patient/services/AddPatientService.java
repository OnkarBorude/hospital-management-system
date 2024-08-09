package patient.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import patient.dao.PatientsDao;
import patient.dto.AddPatientRequest;
import patient.dto.AddPatientResponse;
import patient.entity.Patients;

@Component
public class AddPatientService {
	
	@Autowired
	PatientsDao patientsDao;
	
	public  AddPatientResponse addPatient(AddPatientRequest addPatientRequest) {
		Patients patients=new Patients();
		AddPatientResponse addPatientResponse=new AddPatientResponse();
		
		patients.setPatientNameEng(addPatientRequest.getPatientNameEng());
		patients.setPatientNameMar(addPatientRequest.getPatientNameMar());
		patients.setGender(addPatientRequest.getGender());
		patients.setMobileNumber(addPatientRequest.getMobileNumber());
		patients.setBirthDate(addPatientRequest.getBirthDate());
		patients.setAddress(addPatientRequest.getAddress());
		patients.setFirstExaminationDate(addPatientRequest.getFirstExaminationDate());
		
		patientsDao.save(patients);
		
		addPatientResponse.setResposeCode("0000");
		addPatientResponse.setMessege("Patient added successfully");
		addPatientResponse.setAddPatientRequest(addPatientRequest);
		
		
		return addPatientResponse;
	}
	
	

}
