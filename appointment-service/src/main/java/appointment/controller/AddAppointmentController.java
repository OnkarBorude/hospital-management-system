package appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import appointment.dto.AddAppointmentRequest;
import appointment.dto.AddAppointmentResponse;
import appointment.service.AddAppointmentService;

@RestController
@RequestMapping("/appointment")
public class AddAppointmentController {
	
	@Autowired
	AddAppointmentService addAppointmentService;
	
	@PostMapping(path="/add", consumes = {"application/json","application/xml"}, produces = {"application/json","application/xml"})
	public AddAppointmentResponse addAppointment(@RequestBody AddAppointmentRequest addAppointmentRequest) {
		return addAppointmentService.addAppointment(addAppointmentRequest);
	}

}
