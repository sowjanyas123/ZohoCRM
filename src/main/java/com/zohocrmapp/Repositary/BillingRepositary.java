package com.zohocrmapp.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp.Entity.Billing;

public interface BillingRepositary extends JpaRepository<Billing,Long> {

}
