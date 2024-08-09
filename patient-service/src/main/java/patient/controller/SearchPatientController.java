package patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import patient.dto.SearchPatientResponse;
import patient.services.SearchPatientService;

@RestController
public class SearchPatientController {
	
	@Autowired
	SearchPatientService searchPatientService;
	
	@GetMapping("/getPatient/{patientId}")
	public SearchPatientResponse getPatient(@PathVariable Integer patientId) {
		return searchPatientService.getPatient(patientId);
	}

}
