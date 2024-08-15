package appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import appointment.dto.SearchAppointmentResponse;
import appointment.service.SearchAppointmentService;

@RestController
@RequestMapping("/appointment")
public class SearchAppointmentController {
	
	@Autowired
	SearchAppointmentService searchAppointmentService;
	
	@GetMapping(path="/search/{appointmentId}/{patientId}")
	public SearchAppointmentResponse searchAppointment(@PathVariable Integer appointmentId, @PathVariable Integer patientId) {
		return searchAppointmentService.searchAppointment(appointmentId, patientId);
	}

}
