package com.rocketapi.app.rest.Repo;

import com.rocketapi.app.rest.Models.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

    Optional<Users> findByEmail(String email);
}

