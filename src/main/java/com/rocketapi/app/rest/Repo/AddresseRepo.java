package com.rocketapi.app.rest.Repo;

import com.rocketapi.app.rest.Models.Addresses;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rocketapi.app.rest.Models.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddresseRepo extends JpaRepository<Addresses, Long> {
}
