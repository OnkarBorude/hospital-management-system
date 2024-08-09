package patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import patient.dto.AddPatientRequest;
import patient.dto.AddPatientResponse;
import patient.services.AddPatientService;

@RestController
public class AddPatientController {
	
	@Autowired
	AddPatientService addPatientService;
	
	@PostMapping("/addPatient")
	public AddPatientResponse addPatient(@RequestBody AddPatientRequest addPatientRequest) {
		return addPatientService.addPatient(addPatientRequest);
	}

}
