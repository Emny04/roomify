package com.roomify.roomify;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RoomifyController {

	@GetMapping("/survey")
	public String showSurvey() {
		return "survey.html"; // your survey HTML page
	}

	@PostMapping("/survey/submit")
	@ResponseBody
	public List<String> processSurvey(@RequestBody SurveyResponse response) {
		List<String> images = new ArrayList<>();

		// Just as an example
		if ("Queen".equals(response.getBedSize()) && response.isHasTV() && (response.getBudget()>1000 && response.getBudget()<5000)) {
			images.add("image1.jpg");
			images.add("image2.jpg");
		}
		// ... other conditions ...

		return images;
	}
}
