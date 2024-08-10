package cases.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cases.dao.CasesDao;
import cases.dto.SearchCaseResponse;
import cases.entity.Cases;

@Service
public class SearchCaseService {
	
	@Autowired
	CasesDao casesDao;
	
	public SearchCaseResponse searchCase(Integer caseId) {
		
		SearchCaseResponse searchCaseResponse=new SearchCaseResponse();
		Optional<Cases> cases=casesDao.findById(caseId);
		
		if(cases.isPresent()) {
			searchCaseResponse.setCaseId(caseId);
			searchCaseResponse.setPatientNameEng(cases.get().getPatientNameEng());
			searchCaseResponse.setCaseNumber(cases.get().getCaseNumber());
			searchCaseResponse.setPatientId(cases.get().getPatientId());
			searchCaseResponse.setExaminationDate(cases.get().getExaminationDate());
			searchCaseResponse.setPrescription(cases.get().getPrescription());
			searchCaseResponse.setSymptoms(cases.get().getSymptoms());
			searchCaseResponse.setResponseCode("0000");
			searchCaseResponse.setMessege("Case search Successfully");
			return searchCaseResponse;
		}
		else {
			searchCaseResponse.setResponseCode("911");
			searchCaseResponse.setMessege("Case cannot found");
			return searchCaseResponse;
		}
	}

}
