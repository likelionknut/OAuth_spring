package com.packt.example.socialauthcode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller @RequestMapping("/")
public class FriendsController {
	
	@GetMapping
	public String friends(Model model) { return "friends"; }
	
}
