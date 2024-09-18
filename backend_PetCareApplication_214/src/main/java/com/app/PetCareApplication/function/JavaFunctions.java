package com.app.PetCareApplication.function;

import com.app.PetCareApplication.model.Manager;
import com.app.PetCareApplication.model.Pet;
import com.app.PetCareApplication.model.PetCareCenter;
import com.app.PetCareApplication.model.PetOwner;
import com.app.PetCareApplication.model.Document;
import com.app.PetCareApplication.model.PetService;
import com.app.PetCareApplication.enums.PetServiceType;
import com.app.PetCareApplication.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.PetCareApplication.repository.PetServiceRepository;
import com.app.PetCareApplication.repository.PetOwnerRepository;
import com.app.PetCareApplication.repository.PetCareCenterRepository;
import com.app.PetCareApplication.repository.ManagerRepository;
import com.app.PetCareApplication.repository.DocumentRepository;
import com.app.PetCareApplication.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
