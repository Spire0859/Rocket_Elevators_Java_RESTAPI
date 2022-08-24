package com.rocketapi.app.rest.Repo;

import com.rocketapi.app.rest.Models.Buildings;
import com.rocketapi.app.rest.Models.Columns;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColumnsRepo extends JpaRepository<Columns, Long> {
}