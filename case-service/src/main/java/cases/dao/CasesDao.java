package cases.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cases.entity.Cases;

public interface CasesDao extends JpaRepository<Cases, Integer>{
	public Optional<Cases> findByCaseIdAndPatientId(Integer caseId, Integer patientId);
}
