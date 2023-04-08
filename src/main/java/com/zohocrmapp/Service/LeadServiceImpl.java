package com.zohocrmapp.Service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp.Entity.Lead;
import com.zohocrmapp.Repositary.LeadRepositary;
@Service
public class LeadServiceImpl implements LeadService {
	@Autowired 
	private LeadRepositary Leadrepo;

	@Override
	public void SaveOneLead(Lead lead) {
          Leadrepo.save(lead);		
	}

	@Override
	public Lead getById(long id) {
	Optional<Lead> findById = Leadrepo.findById(id);
	Lead lead=findById.get();
		return lead;
	}

	@Override
	public void deleteById(long id) {
		Leadrepo.deleteById(id);
	}

	@Override
	public List<Lead> getAllLeads() {
		 List<Lead> leads=Leadrepo.findAll();
		return leads;
	}

	
}
