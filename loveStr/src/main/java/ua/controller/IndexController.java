package ua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ua.service.PhotoService;

@Controller
public class IndexController {

	

	@GetMapping("/")
	public String welcome(){
		return "index";
	}
	

}
