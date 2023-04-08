package com.zohocrmapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp.Entity.Contact;
import com.zohocrmapp.Entity.Lead;
import com.zohocrmapp.Service.ContactService;
import com.zohocrmapp.Service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService service;
	
	@Autowired
	private ContactService contservice;

	@RequestMapping("/create")
	//http://localhost:8080/create
public String CreatLead() {
	return "LeadView";
	
}

	@RequestMapping("/SaveLead")
	//http://localhost:8080/SaveLead
public String SaveLead(@ModelAttribute("lead")Lead lead ,Model model ) {
	
	service.SaveOneLead(lead);
	model.addAttribute("lead",lead);
	return "Lead_Info";	

}
	@RequestMapping("/convertLead")
	//http://localhost:8080/convertLead
	public String ConvertLead(@RequestParam("id")long id,Model model) {
		Lead lead=service.getById(id);
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setMobile(lead.getMobile());
		contact.setEmail(lead.getEmail());
		contact.setSource(lead.getSource());
		contservice.SaveContact(contact);
		service.deleteById(id);
		List<Contact>contacts=contservice.getContacts();
		model.addAttribute("contacts", contacts);

		return "list_contacts ";
		
	}
	@RequestMapping("/listLeads")
	public String listLeads(Model model) {
		List<Lead>lead=service.getAllLeads();
		model.addAttribute("lead", lead);
		return "list_leads";
	}

	@RequestMapping("/leadinfo")
	public String leadInfo(@RequestParam("id")long id,Model model) {
		
		Lead lead=service.getById(id);
		model.addAttribute("lead", lead);
		return "Lead_Info";
	}
	}


