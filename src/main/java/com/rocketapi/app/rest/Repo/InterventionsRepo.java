package com.rocketapi.app.rest.Repo;

import com.rocketapi.app.rest.Models.Buildings;
import com.rocketapi.app.rest.Models.Interventions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterventionsRepo extends JpaRepository<Interventions, Long> {
}