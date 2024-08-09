package patient.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import patient.entity.Patients;

public interface PatientsDao extends JpaRepository<Patients, Integer>{

}
