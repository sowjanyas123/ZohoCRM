package com.zohocrmapp.Service;

import java.util.List;

import com.zohocrmapp.Entity.Lead;

public interface LeadService {

	public	void SaveOneLead(Lead lead);

	public	Lead getById(long id);

	public	void deleteById(long id);

public	List<Lead> getAllLeads();


	

}
