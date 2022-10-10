package com.example.mongopj.repository;

import com.example.mongopj.domain.Pet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepo extends MongoRepository<Pet, String> {

    @Query(value = "{id: ?0}")
    List<Pet> findPetById(String id);

    List<Pet> findPetByIdIgnoreCase(String id);

    @Query(value = "{name: ?0}")
    List<Pet> findPetByName(String name);

    @Query(value = "{specie: ?0}")
    List<Pet> findPetBySpecies(String specie);


}
