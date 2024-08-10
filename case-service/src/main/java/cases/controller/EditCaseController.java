package cases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cases.dto.EditCaseRequest;
import cases.dto.EditCaseResponse;
import cases.service.EditCaseService;

@RestController
@RequestMapping("/case")
public class EditCaseController {
	
	@Autowired
	EditCaseService editCaseService;
	
	@PostMapping("/edit")
	public EditCaseResponse editCase(@RequestBody EditCaseRequest editCaseRequest) {
		return editCaseService.editCase(editCaseRequest);
	}

}
