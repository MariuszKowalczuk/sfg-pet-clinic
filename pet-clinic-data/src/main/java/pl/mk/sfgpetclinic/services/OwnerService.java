package pl.mk.sfgpetclinic.services;

import pl.mk.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * @author Mariusz Kowalczuk
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findByID(long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
