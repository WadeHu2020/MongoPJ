package com.example.mongopj.services;


import com.example.mongopj.domain.Pet;
import com.example.mongopj.repository.PetRepo;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    private final PetRepo repository;


    public PetService(PetRepo repository) {
        this.repository = repository;
    }

    public Pet findPetById(String id){
        return repository.findPetById(id).get(0);
    }

    public Pet findPetByName(String Name){
        return repository.findPetById(Name).get(0);
    }

    public Pet findPetBySpecie(String Specie){
        return repository.findPetById(Specie).get(0);
    }

}
