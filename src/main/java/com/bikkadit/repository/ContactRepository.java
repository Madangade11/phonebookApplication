package com.bikkadit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadit.model.contact;


@Repository
public interface ContactRepository extends JpaRepository<contact, Integer> {


}
