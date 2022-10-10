package com.example.mongopj.repository;

import com.example.mongopj.domain.Owner;
import com.example.mongopj.domain.Pet;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepo extends MongoRepository<Owner, String> {

//    @Query(value = "{id: ?0}")
//    List<Owner> findOwnerById(String id);
//
//    @Query(value = "{name: ?0}")
//    List<Owner> findOwnerByName(String name);

    @Modifying
    @Query("INSERT Owner o o.name= ?0 o.pets= ?1")
    void saveNewOwner(String name, List<Pet> pets);

    @Modifying
    @Query("UPDATE Owner o set o.pets = ?0 WHERE o = ?1")
    void updateUserPetsById(List<Pet> pets,String id);

    @Query(value = "{id: ?0}")
    void deleteOwnerById(String id);


}
