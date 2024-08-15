package appointment.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import appointment.entity.Appointments;

public interface AppointmentDao extends JpaRepository<Appointments, Integer>{
	Optional<Appointments> findByAppointmentIdAndPatientId(Integer appointmentId, Integer patientId);
}
