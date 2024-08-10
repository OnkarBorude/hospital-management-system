package appointment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import appointment.dao.AppointmentDao;
import appointment.dto.AddAppointmentRequest;
import appointment.dto.AddAppointmentResponse;
import appointment.entity.Appointments;

@Service
public class AddAppointmentService {
	
	@Autowired
	AppointmentDao appointmentDao;
	
	public AddAppointmentResponse addAppointment(AddAppointmentRequest addAppointmentRequest) {
		
		AddAppointmentResponse addAppointmentResponse=new AddAppointmentResponse();
		Appointments appointments=new Appointments();
		
		appointments.setPatientId(addAppointmentRequest.getPatientId());
		appointments.setPatientNameEng(addAppointmentRequest.getPatientNameEng());
		appointments.setAppointmentTime(addAppointmentRequest.getAppointmentTime());
		appointments.setExaminationDate(addAppointmentRequest.getExaminationDate());
		appointmentDao.save(appointments);
		
		addAppointmentResponse.setResponseCode("0000");
		addAppointmentResponse.setMessege("Appointment added successfully");
		addAppointmentResponse.setAddAppointmentRequest(addAppointmentRequest);
		
		return addAppointmentResponse;
	}

}
