package appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import appointment.dto.EditAppointmentRequest;
import appointment.dto.EditAppointmentResponse;
import appointment.service.EditAppointmentService;

@RestController
@RequestMapping("/appointment")
public class EditAppointmentController {
	
	@Autowired
	EditAppointmentService editAppointmentService;
	
	@PostMapping(path="/edit", consumes = {"application/json","application/xml"}, produces = {"application/json","application/xml"})
	public EditAppointmentResponse editAppointment(@RequestBody EditAppointmentRequest editAppointmentRequest) {
		return editAppointmentService.editAppointment(editAppointmentRequest);
	}
}
