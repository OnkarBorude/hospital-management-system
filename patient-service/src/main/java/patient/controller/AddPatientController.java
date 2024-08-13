package patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patient.dto.AddPatientRequest;
import patient.dto.AddPatientResponse;
import patient.services.AddPatientService;

@RestController
@RequestMapping("/patient")
public class AddPatientController {
	
	@Autowired
	AddPatientService addPatientService;
	
	@PostMapping("/add")
	public AddPatientResponse addPatient(@RequestBody AddPatientRequest addPatientRequest) {
		return addPatientService.addPatient(addPatientRequest);
	}

}
