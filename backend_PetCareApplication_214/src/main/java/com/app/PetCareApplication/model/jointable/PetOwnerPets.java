package com.app.PetCareApplication.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.PetCareApplication.model.Manager;
import com.app.PetCareApplication.model.Pet;
import com.app.PetCareApplication.model.PetCareCenter;
import com.app.PetCareApplication.model.PetOwner;
import com.app.PetCareApplication.model.Document;
import com.app.PetCareApplication.model.PetService;
import com.app.PetCareApplication.enums.PetServiceType;
import com.app.PetCareApplication.converter.PetServiceTypeConverter;

@Entity(name = "PetOwnerPets")
@Table(schema = "\"petcareapplication\"", name = "\"PetOwnerPets\"")
@Data
public class PetOwnerPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"OwnerId\"")
	private Integer ownerId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}