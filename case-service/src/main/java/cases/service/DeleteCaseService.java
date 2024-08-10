package cases.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cases.dao.CasesDao;
import cases.dto.DeleteCaseResponse;
import cases.entity.Cases;

@Service
public class DeleteCaseService {
	
	@Autowired
	CasesDao casesDao;
	
	public DeleteCaseResponse deleteCase(Integer caseId) {
		
		DeleteCaseResponse deleteCaseResponse=new DeleteCaseResponse();
		Optional<Cases> cases=casesDao.findById(caseId);
		if(cases.isPresent()) {
			casesDao.deleteById(caseId);
			deleteCaseResponse.setResponseCode("0000");
			deleteCaseResponse.setMessege("Case Delete Successfully");
			return deleteCaseResponse;
		}
		else {
			deleteCaseResponse.setResponseCode("0000");
			deleteCaseResponse.setMessege("Case Deletion Unsuccessful");
			return deleteCaseResponse;
		}
	}

}
