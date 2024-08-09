package patient.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import patient.dao.PatientsDao;
import patient.dto.SearchPatientResponse;
import patient.entity.Patients;

@Component
public class SearchPatientService {
	
	@Autowired
	PatientsDao patientsDao;
	
	public SearchPatientResponse getPatient(Integer patientId) {
		SearchPatientResponse searchPatientResponse=new SearchPatientResponse();
		Optional<Patients> patients=patientsDao.findById(patientId);
		if(patients.isPresent()) {
			searchPatientResponse.setResponseCode("0000");
			searchPatientResponse.setMessege("Patient Found successfully");
			searchPatientResponse.setPatientNameEng(patients.get().getPatientNameEng());
			searchPatientResponse.setPatientNameMar(patients.get().getPatientNameMar());
			searchPatientResponse.setGender(patients.get().getGender());
			searchPatientResponse.setMobileNumber(patients.get().getMobileNumber());
			searchPatientResponse.setBirthDate(patients.get().getBirthDate());
			searchPatientResponse.setFirstExaminationDate(patients.get().getFirstExaminationDate());
			searchPatientResponse.setAddress(patients.get().getAddress());
			searchPatientResponse.setPatientId(patients.get().getPatientId());
			return searchPatientResponse;
		}
		else {
			searchPatientResponse.setResponseCode("911");
			searchPatientResponse.setMessege("Patient Not Found");
			return searchPatientResponse;
		}
		
	}

}
