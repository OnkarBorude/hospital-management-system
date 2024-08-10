package appointment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import appointment.entity.Appointments;

public interface AppointmentDao extends JpaRepository<Appointments, Integer>{

}
