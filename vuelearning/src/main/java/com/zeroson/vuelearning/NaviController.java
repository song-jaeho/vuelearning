package com.zeroson.vuelearning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class NaviController {
	
	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}
	
	
	@GetMapping("/dododo")
	public String dododo(Model model) {
		return "aaaaa";
	}
	
	/* @RequestParam 사용한 예 localhost:8080/vue?viewName=main
	@GetMapping("/vue")
	public String vue(Model model, @RequestParam("viewName") String viewName) {
		if ( viewName == null ) {
			return "";
		}
		return viewName;
	}
	*/
	// @PathVariable 사용한 예 localhost:8080/vue/main
	// 주로 REST API에 사용되지만... 들어온 대로 view 주는데 지금 쓰기는 적절한 듯? 
	@GetMapping("/vue/{viewName}")
	public String vue(Model model, @PathVariable("viewName") String viewName) {
		if ( viewName == null ) {
			return "";
		}
		return "vue/" + viewName;
	}
	
}
