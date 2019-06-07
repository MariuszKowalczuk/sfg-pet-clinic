package pl.mk.sfgpetclinic.services;

import pl.mk.sfgpetclinic.model.Owner;
import pl.mk.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * @author Mariusz Kowalczuk
 */
public interface PetService {
    Pet findByID(long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
