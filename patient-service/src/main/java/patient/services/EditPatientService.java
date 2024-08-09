package patient.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import patient.dao.PatientsDao;
import patient.dto.EditPatientRequest;
import patient.dto.EditPatientResponse;
import patient.entity.Patients;

@Component
public class EditPatientService {
	
	@Autowired
	PatientsDao patientsDao;
	
	public EditPatientResponse editPatient(EditPatientRequest editPatientRequest) {
		
		EditPatientResponse editPatientResponse=new EditPatientResponse();
		
		if(editPatientRequest.getPatientId()==null) {
			editPatientResponse.setResponseCode("0000");
			editPatientResponse.setMessege("Patient id is mandatory to send");
			return editPatientResponse;
		}
		
		Optional<Patients> patient=patientsDao.findById(editPatientRequest.getPatientId());
		
		if(patient.isPresent()) {
			Patients patients=new Patients();
			patients.setPatientId(editPatientRequest.getPatientId());
			patients.setPatientNameEng(editPatientRequest.getPatientNameEng());
			patients.setPatientNameMar(editPatientRequest.getPatientNameMar());
			patients.setGender(editPatientRequest.getGender());
			patients.setMobileNumber(editPatientRequest.getMobileNumber());
			patients.setBirthDate(editPatientRequest.getBirthDate());
			patients.setFirstExaminationDate(editPatientRequest.getFirstExaminationDate());
			patients.setAddress(editPatientRequest.getAddress());
			
			patientsDao.save(patients);
			editPatientResponse.setResponseCode("0000");
			editPatientResponse.setMessege("Patient update successfully");
			editPatientResponse.setEditPatientRequest(editPatientRequest);
			return editPatientResponse;
			
		}
		else {
			editPatientResponse.setResponseCode("911");
			editPatientResponse.setMessege("Patient id is invalid");
			return editPatientResponse;
			
			
		}
	}

}
