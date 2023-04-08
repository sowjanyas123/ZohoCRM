package com.zohocrmapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp.util.EmailService;
@Controller
public class EmailController {
	@Autowired
	private EmailService emailservice;
	@RequestMapping("/ComposeEmail")
	//http://localhost:8080/ComposeEmail
	public String CreateEmail(@RequestParam("email")String email,Model model) {
		model.addAttribute("email", email);
		
		return "compose_email";
		
	}
	@RequestMapping("/SendEmail")
public String SendEmail(@RequestParam("to")String to,@RequestParam("sub")String sub,@RequestParam("msg")String msg, Model model) {
		emailservice.SendEmail(to, sub, msg);
		model.addAttribute("msg", "Email Sent!!!");
	return "compose_email";
		
	}

}
