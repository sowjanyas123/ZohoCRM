package com.zohocrmapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp.Entity.Billing;
import com.zohocrmapp.Entity.Contact;
import com.zohocrmapp.Service.BillingService;
import com.zohocrmapp.Service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private BillingService billing;

@Autowired
private ContactService contservice;
@RequestMapping("/listcontacts")
public String listContacts(Model model) {
	List<Contact> contacts=contservice.getContacts();
	model.addAttribute("contacts", contacts);
	return "list_contacts";
	
}
@RequestMapping("/createBill")
public String createBill(@RequestParam("id")long id, Model model) {
	Contact contact=contservice.getContactById(id);
	model.addAttribute("contact", contact);
	return "generate_bill";
	
}
@RequestMapping("/SaveBill")
public String SaveBill(Billing bill) {
	billing.generBill(bill);
	return "list_bills";
	
}

}
