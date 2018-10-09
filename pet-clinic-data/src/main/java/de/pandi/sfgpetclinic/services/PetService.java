package de.pandi.sfgpetclinic.services;

import de.pandi.sfgpetclinic.model.Owner;
import de.pandi.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Owner owner);

    Set<Pet> findAll();
}
