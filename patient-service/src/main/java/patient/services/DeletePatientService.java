package patient.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import patient.dao.PatientsDao;
import patient.dto.DeletePatientResponse;
import patient.entity.Patients;

@Component
public class DeletePatientService {
	
	@Autowired
	PatientsDao patientsDao;
	
	public DeletePatientResponse deletePatient(Integer patientId) {
		
		DeletePatientResponse deletePatientResponse=new DeletePatientResponse();
		Optional<Patients> patients=patientsDao.findById(patientId);
		if(patients.isPresent()) {
			patientsDao.deleteById(patientId);
			deletePatientResponse.setMessege("Patient Delete Successfully");
			deletePatientResponse.setResponseCode("0000");
			return deletePatientResponse;
		}else {
			deletePatientResponse.setMessege("Patient Deletion unsuccessfull");
			deletePatientResponse.setResponseCode("911");
			return deletePatientResponse;
			
		}
	}
	

}
