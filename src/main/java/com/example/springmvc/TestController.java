package com.example.springmvc;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	private static final List<String> MICROPHONES = List.of("condenser", "dynamic", "ribbon", "shotgun");
	
	@GetMapping
	public String test(Model model)
	{
		model.addAttribute("zeitstempel", LocalDateTime.now());
		model.addAttribute("mikrofone", MICROPHONES);
		return "test";
	}
}
