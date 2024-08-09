package patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import patient.dto.EditPatientRequest;
import patient.dto.EditPatientResponse;
import patient.services.EditPatientService;

@RestController
public class EditPatientController {
	
	@Autowired
	EditPatientService editPatientService;
	
	@PostMapping("/editPatient")
	public EditPatientResponse editPatient(@RequestBody EditPatientRequest editPatientRequest) {
		return editPatientService.editPatient(editPatientRequest);
	}
}
