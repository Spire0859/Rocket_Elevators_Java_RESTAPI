package com.rocketapi.app.rest.Repo;

import com.rocketapi.app.rest.Models.Buildings;
import com.rocketapi.app.rest.Models.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepo extends JpaRepository<Customers, Long> {
}