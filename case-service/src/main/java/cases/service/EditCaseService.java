package cases.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cases.dao.CasesDao;
import cases.dto.EditCaseRequest;
import cases.dto.EditCaseResponse;
import cases.entity.Cases;

@Service
public class EditCaseService {
	
	@Autowired
	CasesDao casesDao;
	
	public EditCaseResponse editCase(EditCaseRequest editCaseRequest) {
		
		EditCaseResponse editCaseResponse=new EditCaseResponse();
		if(editCaseRequest.getCaseId()==null) {
			editCaseResponse.setResponseCode("0000");
			editCaseResponse.setMessege("Case Id Is mandatory");
			return editCaseResponse;
		}
		
		Optional<Cases> cases=casesDao.findById(editCaseRequest.getCaseId());
		
		if(cases.isPresent()) {
			Cases caseTable=new Cases();
			caseTable.setCaseId(editCaseRequest.getCaseId());
			caseTable.setPatientNameEng(editCaseRequest.getPatientNameEng());
			caseTable.setPatientId(editCaseRequest.getPatientId());
			caseTable.setCaseNumber(editCaseRequest.getCaseNumber());
			caseTable.setExaminationDate(editCaseRequest.getExaminationDate());
			caseTable.setSymptoms(editCaseRequest.getSymptoms());
			caseTable.setPrescription(editCaseRequest.getPrescription());
			
			casesDao.save(caseTable);
			editCaseResponse.setResponseCode("0000");
			editCaseResponse.setMessege("Case Edit Successfully");
			editCaseResponse.setEditCaseRequest(editCaseRequest);
			return editCaseResponse;
			
		}
		else {
			editCaseResponse.setResponseCode("911");
			editCaseResponse.setMessege("Case Edit Unsuccessful");
			return editCaseResponse;
		}
	}
	
}
