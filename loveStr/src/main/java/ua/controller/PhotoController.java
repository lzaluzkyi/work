package ua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.domain.PhotoRequest;
import ua.service.PhotoService;

@Controller
@RequestMapping("/photo")
@SessionAttributes("photo")
public class PhotoController {
	
	private final PhotoService service;
	
	
	public PhotoController(PhotoService service) {
		super();
		this.service = service;
	}
	@ModelAttribute("photo")
	public PhotoRequest getForm(){
		return new PhotoRequest();
	}

	@PostMapping
	public String add(@ModelAttribute("photo")PhotoRequest photo, SessionStatus status){
		service.save(photo);
		status.setComplete();
		return "redirect:/photo";
		
	}
	@GetMapping
	public String show(Model model){
		model.addAttribute("photos", service.findAll());
	
		return "photo";
	}
	

}
