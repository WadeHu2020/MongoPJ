package com.example.mongopj.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "OwnerPet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Owner {

    @Id
    //@ApiModelProperty(notes = "owner id")
    private String id;

    //@ApiModelProperty(notes = "owner's name")
    private String name;

    //@ApiModelProperty(notes = "owner's pets")
    private List<Pet> pets;
}
