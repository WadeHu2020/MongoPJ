package com.example.mongopj.domain;


import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//@Document(collection = "pets")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pet {

    //@Id
    //@ApiModelProperty(notes = "Pet id")
    private String id;

    //@ApiModelProperty(notes = "pet's name")
    private String name;

    //@ApiModelProperty(notes = "pet's specie")
    private String species;


}
