package com.univet.br.pet.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.univet.br.pet.model.Pet;;;

public interface PetRepository extends MongoRepository<Pet, String>{

}
