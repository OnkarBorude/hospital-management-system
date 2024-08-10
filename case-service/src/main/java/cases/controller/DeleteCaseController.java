package cases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cases.dto.DeleteCaseResponse;
import cases.service.DeleteCaseService;

@RestController
@RequestMapping("/case")
public class DeleteCaseController {
	
	@Autowired
	DeleteCaseService deleteCaseService;
	
	@DeleteMapping("/delete/{caseId}")
	public DeleteCaseResponse deleteCase(@PathVariable Integer caseId) {
		return deleteCaseService.deleteCase(caseId);
	}

}
