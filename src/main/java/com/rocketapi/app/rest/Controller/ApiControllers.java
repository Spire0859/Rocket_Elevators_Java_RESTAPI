package com.rocketapi.app.rest.Controller;
import com.rocketapi.app.rest.Models.*;
import com.rocketapi.app.rest.Repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @GetMapping(value = "/Users/{id}")
    public Users getUserByID(@PathVariable int id){

        return userRepo.findById(id).get();
    }

    @GetMapping(value = "/Addresses")
    public List<Addresses> getAddresses(){

        return addresseRepo.findAll();
    }

    @GetMapping(value = "/Batteries")
    public List<Batteries> getBatteries(){

        return batteriesRepo.findAll();
    }

    @GetMapping(value = "/Batteries/{id}")
    public Batteries getBatterieByID(@PathVariable long id){
        return batteriesRepo.findById(id).get();
    }

    @GetMapping(value = "/Buildings")
    public List<Buildings> getBuildings(){

        return buildingsRepo.findAll();
    }

    @GetMapping(value = "/Buildings/{id}")
    public Buildings getBuildingByID(@PathVariable long id){
        return buildingsRepo.findById(id).get();
    }



    @PutMapping(value = "/InterventionsUpdate/{id}")
    public String updateInterventions(@PathVariable long id,@RequestBody Interventions interventions){
             Interventions UpdatedIn = interventionsRepo.findById(id).get();
             UpdatedIn.setStatus(interventions.getStatus());
             UpdatedIn.setResult(interventions.getResult());
             UpdatedIn.setReport(interventions.getReport());
             UpdatedIn.setInterventionDateStart(interventions.getInterventionDateStart());
             UpdatedIn.setInterventionDateEnd(interventions.getInterventionDateEnd());
             UpdatedIn.setEmployee_id(interventions.getEmployee_id());
             UpdatedIn.setBuilding_id(interventions.getBuilding_id());
             UpdatedIn.setBattery_id(interventions.getBattery_id());
             UpdatedIn.setColumn_id(interventions.getColumn_id());
             UpdatedIn.setElevator_id(interventions.getElevator_id());
             interventionsRepo.save(UpdatedIn);


            return "intervention: " + id + " updated successfully !";

    }

    @GetMapping(value = "/Interventions")
    public List<Interventions> getInterventions(){

        return interventionsRepo.findAll();
    }

    @GetMapping(value = "/Interventions/{id}")
    public Interventions getInterventionsByID(@PathVariable long id){
        return interventionsRepo.findById(id).get();
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

    @PostMapping(value = "/Customers/save")
    public String saveCustomers(@RequestBody Customers customers){

        customersRepo.save(customers);

        return "Successfully saved new interventions!";
    }

    @GetMapping(value = "/Customers/{id}")
    public Customers getCustomerByID(@PathVariable long id){

        return customersRepo.findById(id).get();
    }


    @GetMapping(value = "/Elevators")
    public List<Elevators> getElevators(){
        
        return elevatorsRepo.findAll();
    }
    @GetMapping(value = "/Elevators/{id}")
    public Elevators getElevatorByID(@PathVariable long id){
        return elevatorsRepo.findById(id).get();
    }


    @GetMapping(value = "/Columns")
    public List<Columns> getColumns(){
        
        return columnsRepo.findAll();
    }

    @GetMapping(value = "/Columns/{id}")
    public Columns getColumnByID(@PathVariable long id){
        return columnsRepo.findById(id).get();
    }
}
