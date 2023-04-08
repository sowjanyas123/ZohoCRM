package com.zohocrmapp.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp.Entity.Contact;

public interface ContactRepositary extends JpaRepository<Contact,Long> {

}
