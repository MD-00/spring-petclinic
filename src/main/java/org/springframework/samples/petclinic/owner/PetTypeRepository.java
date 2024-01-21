package org.springframework.samples.petclinic.owner;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends MongoRepository<PetType, ObjectId> {

}
