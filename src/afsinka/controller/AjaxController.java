package afsinka.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import afsinka.datatype.Applicant;

@RestController
public class AjaxController {

	@RequestMapping(value = "/add")
	public String add(@RequestBody Applicant applicant) {

		System.out.println("Applicant= " + applicant);

		return "200";
	}

}
