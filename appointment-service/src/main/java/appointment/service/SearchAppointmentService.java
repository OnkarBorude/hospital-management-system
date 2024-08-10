package appointment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import appointment.dao.AppointmentDao;
import appointment.dto.SearchAppointmentRequest;
import appointment.dto.SearchAppointmentResponse;
import appointment.entity.Appointments;

@Service
public class SearchAppointmentService {
	
	@Autowired
	AppointmentDao appointmentDao;
	
	public SearchAppointmentResponse searchAppointment(Integer appointmentId) {
		
		SearchAppointmentResponse searchAppointmentResponse=new SearchAppointmentResponse();
		
		Optional<Appointments> appointment=appointmentDao.findById(appointmentId);
		if(appointment.isPresent()) {
			searchAppointmentResponse.setAppointmentId(appointmentId);
			searchAppointmentResponse.setPatientId(appointment.get().getPatientId());
			searchAppointmentResponse.setPatientNameEng(appointment.get().getPatientNameEng());
			searchAppointmentResponse.setAppointmentTime(appointment.get().getAppointmentTime());
			searchAppointmentResponse.setExaminationDate(appointment.get().getExaminationDate());
			searchAppointmentResponse.setResponseCode("0000");
			searchAppointmentResponse.setMessege("Appointment search Successfully");
			return searchAppointmentResponse;
		}
		else {
			searchAppointmentResponse.setResponseCode("911");
			searchAppointmentResponse.setMessege("Appointment Not found");
			return searchAppointmentResponse;
		}
	}

}
