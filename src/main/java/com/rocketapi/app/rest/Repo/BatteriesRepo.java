package com.rocketapi.app.rest.Repo;

import com.rocketapi.app.rest.Models.Batteries;
import com.rocketapi.app.rest.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatteriesRepo extends JpaRepository<Batteries, Long> {
}