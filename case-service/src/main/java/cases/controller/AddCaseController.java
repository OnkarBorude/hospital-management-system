package cases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cases.dto.AddCaseRequest;
import cases.dto.AddCaseResponse;
import cases.service.AddCaseService;

@RestController
@RequestMapping("/case")
public class AddCaseController {
	
	@Autowired
	AddCaseService addCaseService;
	
	@PostMapping("/add")
	public AddCaseResponse addCase(@RequestBody AddCaseRequest addCaseRequest) {
		return addCaseService.addCase(addCaseRequest);
	}

}
