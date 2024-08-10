package cases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cases.dto.SearchCaseRequest;
import cases.dto.SearchCaseResponse;
import cases.service.SearchCaseService;

@RestController
@RequestMapping("/case")
public class SearchCaseController {
	
	@Autowired
	SearchCaseService searchCaseService;
	
	@GetMapping("/search/{caseId}")
	public SearchCaseResponse searchCase(@PathVariable Integer caseId) {
		return searchCaseService.searchCase(caseId);
	}
}
