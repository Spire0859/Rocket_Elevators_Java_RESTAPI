package com.rocketapi.app.rest.Controller;
import com.rocketapi.app.rest.Models.*;
import com.rocketapi.app.rest.Repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
public class ApiControllers {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private AddresseRepo addresseRepo;
    @Autowired
    private BatteriesRepo batteriesRepo;
    @Autowired
    private BuildingsRepo buildingsRepo;
    @Autowired
    private InterventionsRepo interventionsRepo;
    @Autowired
    private CustomersRepo customersRepo;
    @Autowired
    private ElevatorsRepo elevatorsRepo;
    @Autowired
    private ColumnsRepo columnsRepo;



    @GetMapping(value = "/")
    public String getPage(){

        return "welcome";
    }

    @GetMapping(value = "/Users")
    public List<Users> getUsers(){

        return userRepo.findAll();
    }


    @GetMapping(value = "/Addresses")
    public List<Addresses> getAddresses(){

        return addresseRepo.findAll();
    }

    @GetMapping(value = "/Batteries")
    public List<Batteries> getBatteries(){

        return batteriesRepo.findAll();
    }

    @GetMapping(value = "/Buildings")
    public List<Buildings> getBuildings(){

        return buildingsRepo.findAll();
    }



    @GetMapping(value = "/InterventionsUpdate/{id}")
    public String updateInterventions(@PathVariable long id,@RequestBody Interventions interventions){
             Interventions UpdatedIn = interventionsRepo.findById(id).get();
             UpdatedIn.setEmployee_id(interventions.getEmployee_id());
             UpdatedIn.setBuilding_id(interventions.getBuilding_id());
             UpdatedIn.setBattery_id(interventions.getBattery_id());
             UpdatedIn.setColumn_id(interventions.getColumn_id());
             UpdatedIn.setElevator_id(interventions.getElevator_id());


            return "intervention: " + id + " updated successfully !";

    }

    @GetMapping(value = "/Interventions")
    public List<Interventions> getInterventions(){

        return interventionsRepo.findAll();
    }

    @GetMapping(value = "/Interventions/{id}")
    public Optional<Interventions> getInterventionsByID(@PathVariable long id){
        return interventionsRepo.findById(id);
    }

    @PostMapping(value = "/Interventions/save")
    public String saveInterventions(@RequestBody Interventions interventions){

        interventionsRepo.save(interventions);

        return "Successfully saved new interventions!";
    }

    @DeleteMapping(value = "/Interventions/delete/{id}")
    public String deleteInterventionsByID(@PathVariable long id){

        Interventions deleteInt =  interventionsRepo.findById(id).get();
        interventionsRepo.delete(deleteInt);

        return "Interventions: " + id + " successfully deleted!";
    }


    @GetMapping(value = "/Customers")
    public List<Customers> getCustomers(){

        return customersRepo.findAll();
    }

    @GetMapping(value = "/Elevators")
    public List<Elevators> getElevators(){
        return elevatorsRepo.findAll();
    }

    @GetMapping(value = "/Columns")
    public List<Columns> getColumns(){
        return columnsRepo.findAll();
    }
}
