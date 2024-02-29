package com.springboot.h2dbrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.h2dbrestapi.entity.Customer;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Long> {

}
