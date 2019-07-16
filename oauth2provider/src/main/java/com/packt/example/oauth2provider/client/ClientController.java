package com.packt.example.oauth2provider.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientRegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientRegistrationService clientRegistrationService;

	@GetMapping("/register")
	public ModelAndView register(ModelAndView mv) {
		mv.setViewName("client/register");
		mv.addObject("registry", new BasicClientInfo());

		return mv;
	}
}
