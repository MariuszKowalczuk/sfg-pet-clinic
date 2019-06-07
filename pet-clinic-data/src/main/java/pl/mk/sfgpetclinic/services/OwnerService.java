package pl.mk.sfgpetclinic.services;

import pl.mk.sfgpetclinic.model.Owner;

/**
 * @author Mariusz Kowalczuk
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);


}
