
package com.rocketapi.app.rest.Repo;

        import com.rocketapi.app.rest.Models.Buildings;
        import com.rocketapi.app.rest.Models.Customers;
        import com.rocketapi.app.rest.Models.Elevators;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface ElevatorsRepo extends JpaRepository<Elevators, Long> {
}