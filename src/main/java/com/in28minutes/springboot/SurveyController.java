package com.in28minutes.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springboot.service.SurveyService;
import com.in28mniutes.springboot.model.Question;

@RestController
class SurveyController {
	
	@Autowired
	private SurveyService surveyService;
	
	@GetMapping("/surveys/{surveyId}/questions")
	public List<Question> retriveQuestions(@PathVariable String surveyId) {
		return surveyService.retrieveQuestions(surveyId);
		
	}
}
