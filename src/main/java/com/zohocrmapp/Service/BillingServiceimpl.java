package com.zohocrmapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp.Entity.Billing;
import com.zohocrmapp.Repositary.BillingRepositary;

@Service
public class BillingServiceimpl implements BillingService {
	@Autowired
	private BillingRepositary billi;
	@Override
	public void generBill(Billing bill) {
		billi.save(bill);
	}

}
