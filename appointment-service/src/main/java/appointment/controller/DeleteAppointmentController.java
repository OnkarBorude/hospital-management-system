package appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import appointment.dto.DeleteAppointmentResponse;
import appointment.service.DeleteAppointmentService;

@RestController
@RequestMapping("/appointment")
public class DeleteAppointmentController {

	@Autowired
	DeleteAppointmentService deleteAppointmentService;
	
	@DeleteMapping(path="/delete/{appointmentId}")
	public DeleteAppointmentResponse deleteAppointment(@PathVariable Integer appointmentId) {
		return deleteAppointmentService.deleteAppointment(appointmentId);
	}
}
