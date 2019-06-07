package pl.mk.sfgpetclinic.services;

import pl.mk.sfgpetclinic.model.Owner;
import pl.mk.sfgpetclinic.model.Pet;
import pl.mk.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * @author Mariusz Kowalczuk
 */
public interface VetService {

    Vet findByID(long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
