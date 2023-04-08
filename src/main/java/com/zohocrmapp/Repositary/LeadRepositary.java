package com.zohocrmapp.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp.Entity.Lead;

public interface LeadRepositary extends JpaRepository<Lead,Long> {

}
