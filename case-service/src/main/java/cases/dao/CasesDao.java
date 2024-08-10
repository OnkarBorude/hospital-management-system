package cases.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cases.entity.Cases;

public interface CasesDao extends JpaRepository<Cases, Integer>{

}
