package patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patient.dto.SearchPatientResponse;
import patient.services.SearchPatientService;

@RestController
@RequestMapping("/patient")
public class SearchPatientController {
	
	@Autowired
	SearchPatientService searchPatientService;
	
	@GetMapping("/search/{patientId}/{patientName}")
	public SearchPatientResponse getPatient(@PathVariable Integer patientId, @PathVariable String patientName) {
		return searchPatientService.getPatient(patientId,patientName);
	}

}
