package com.example.mongopj.services;

import com.example.mongopj.domain.Owner;
import com.example.mongopj.domain.Pet;
import com.example.mongopj.repository.OwnerRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OwnerService {

    private final OwnerRepo repository;

    public OwnerService(OwnerRepo repository) {
        this.repository = repository;
    }

    //using crudRepo
    public List<Owner> findAllOwners(){
        return repository.findAll();
    }

    //using crudRepo
    public Owner findOwnerById(String id){
        return repository.findById(id).orElse(new Owner());
    }

    //using crudRepo
//    public void saveNewOwner(String name, List<Pet> pets){
//        repository.saveNewOwner(name,pets);
//    }
    public void saveNewOwner(Owner s){
        repository.save(s);
    }

    public void updateUserPetsById(List<Pet> pets,String id){
        repository.updateUserPetsById(pets,id);
    }

    public void deleteOwnerById(String id){
        repository.deleteOwnerById(id);
    }

}
