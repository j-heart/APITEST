package com.example.demo.repository;

import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.example.demo.entity.APIdbEntity;


public interface ApiRepository extends JpaRepository<APIdbEntity, Timestamp>{
	
}
