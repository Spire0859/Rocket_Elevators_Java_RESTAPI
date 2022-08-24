
package com.rocketapi.app.rest.Repo;

        import com.rocketapi.app.rest.Models.Buildings;
        import com.rocketapi.app.rest.Models.Users;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingsRepo extends JpaRepository<Buildings, Long> {
}