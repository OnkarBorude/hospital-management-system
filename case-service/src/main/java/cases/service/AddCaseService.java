package cases.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cases.dao.CasesDao;
import cases.dto.AddCaseRequest;
import cases.dto.AddCaseResponse;
import cases.entity.Cases;

@Service
public class AddCaseService {
	
	@Autowired
	CasesDao casesDao;
	
	public AddCaseResponse addCase(AddCaseRequest addCaseRequest) {
		AddCaseResponse addCaseResponse=new AddCaseResponse();
		Cases cases=new Cases();
		
		cases.setPatientNameEng(addCaseRequest.getPatientNameEng());
		cases.setPatientId(addCaseRequest.getPatientId());
		cases.setCaseNumber(addCaseRequest.getCaseNumber());
		cases.setExaminationDate(addCaseRequest.getExaminationDate());
		cases.setPrescription(addCaseRequest.getPrescription());
		cases.setSymptoms(addCaseRequest.getSymptoms());
		Cases casea=casesDao.save(cases);
		addCaseRequest.setCaseId(casea.getCaseId());
		
		addCaseResponse.setResponseCode("0000");
		addCaseResponse.setMessege("Case Added Successfully");
		addCaseResponse.setAddCaseRequest(addCaseRequest);
		return addCaseResponse;
	}

}
