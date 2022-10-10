package com.example.mongopj.controller;


import com.example.mongopj.domain.Owner;
import com.example.mongopj.domain.Pet;
import com.example.mongopj.services.OwnerService;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value = "MongoDemoController RESTful endpoints")
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping(value = "/owners")
    @ApiOperation(value = "find all owners",response = Iterable.class)
    public List<Owner> findAllOwners(){
        System.out.println("I am here");
        System.out.println(ownerService.findAllOwners());
        return ownerService.findAllOwners();
    }

    @GetMapping(value = "/owners/{id}")
    @ApiOperation(value = "find owner by id",response = Iterable.class)
    public Owner findOwnerById(@PathVariable String id){
        return ownerService.findOwnerById(id);
    }

    @PostMapping(value = "/owner")
    @ApiOperation(value = "save new owner",response = Iterable.class)
    public void saveNewOwner(@PathVariable String message){
        Owner theOwner;
        String ori = message;
        Gson gson = new Gson();
        theOwner = gson.fromJson(ori,Owner.class);
        ownerService.saveNewOwner(theOwner);
    }

    @PutMapping(value = "/owner/{id}/pet")
    @ApiOperation(value = "add a pet to existing owner",response = Iterable.class)
    public void addPetToOwner(@PathVariable List<Pet> pets,@PathVariable String id){
        ownerService.updateUserPetsById(pets,id);
    }

    @DeleteMapping(value = "/DELETE /api/owner/{id}")
    @ApiOperation(value = "delete owner",response = Iterable.class)
    public void deleteOwnerById(@PathVariable String id){
        ownerService.deleteOwnerById(id);
    }

}
