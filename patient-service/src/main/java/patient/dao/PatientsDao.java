package patient.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import patient.entity.Patients;

public interface PatientsDao extends JpaRepository<Patients, Integer>{
	public Optional<Patients> findByPatientIdAndPatientNameEng(Integer patientId, String patientNameEng);
}
