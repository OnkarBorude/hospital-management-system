package appointment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import appointment.dao.AppointmentDao;
import appointment.dto.DeleteAppointmentResponse;
import appointment.entity.Appointments;

@Service
public class DeleteAppointmentService {
	
	@Autowired
	AppointmentDao appointmentDao;
	
	public DeleteAppointmentResponse deleteAppointment(Integer appointmentId) {
		
		DeleteAppointmentResponse deleteAppointmentResponse=new DeleteAppointmentResponse();
		Optional<Appointments> appointments=appointmentDao.findById(appointmentId);
		
		if(appointments.isPresent()) {
			appointmentDao.deleteById(appointmentId);
			deleteAppointmentResponse.setMessege("Delete Appointment Successfully");
			deleteAppointmentResponse.setResponseCode("0000");
			return deleteAppointmentResponse;
		}
		else {
			deleteAppointmentResponse.setMessege("Appointment Deletion Failed");
			deleteAppointmentResponse.setResponseCode("0000");
			return deleteAppointmentResponse;
		}
	}

}
