package appointment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import appointment.dao.AppointmentDao;
import appointment.dto.EditAppointmentRequest;
import appointment.dto.EditAppointmentResponse;
import appointment.entity.Appointments;

@Service
public class EditAppointmentService {
	
	@Autowired
	AppointmentDao appointmentDao;
	
	public EditAppointmentResponse editAppointment(EditAppointmentRequest editAppointmentRequest) {
		EditAppointmentResponse editAppointmentResponse=new EditAppointmentResponse();
		
		if(editAppointmentRequest.getAppointmentId()==null) {
			editAppointmentResponse.setMessege("Appointement id is mandantory");
			editAppointmentResponse.setResponseCode("0000");
			return editAppointmentResponse;
		}
		
		Optional<Appointments> appointments=appointmentDao.findById(editAppointmentRequest.getAppointmentId());
		
		if(appointments.isPresent()) {
			Appointments appointmentsTable=new Appointments();
			appointmentsTable.setAppointmentId(editAppointmentRequest.getAppointmentId());
			appointmentsTable.setPatientId(editAppointmentRequest.getPatientId());
			appointmentsTable.setPatientNameEng(editAppointmentRequest.getPatientNameEng());
			appointmentsTable.setAppointmentTime(editAppointmentRequest.getAppointmentTime());
			appointmentsTable.setExaminationDate(editAppointmentRequest.getExaminationDate());
			appointmentDao.save(appointmentsTable);
			editAppointmentResponse.setMessege("Appointement edit Successfully");
			editAppointmentResponse.setResponseCode("0000");
			editAppointmentResponse.setEditAppointmentRequest(editAppointmentRequest);
			return editAppointmentResponse;
		}
		else {
			editAppointmentResponse.setMessege("Appointement edit failed");
			editAppointmentResponse.setResponseCode("911");
			return editAppointmentResponse;
		}
	}

}
