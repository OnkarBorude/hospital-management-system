package patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patient.dto.DeletePatientResponse;
import patient.services.DeletePatientService;

@RestController
@RequestMapping("/patient")
public class DeletePatientController {
	
	@Autowired
	DeletePatientService deletePatientService;
	
	@DeleteMapping("/delete/{patientId}")
	public DeletePatientResponse deletePatient(@PathVariable Integer patientId) {
		return deletePatientService.deletePatient(patientId);
	}
}
