package com.springguru.sfgpetclinic.repositories;

import com.springguru.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
