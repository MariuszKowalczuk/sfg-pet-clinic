package pl.mk.sfgpetclinic.services.map;

import pl.mk.sfgpetclinic.model.Owner;
import pl.mk.sfgpetclinic.services.OwnerService;

import java.util.Set;

/**
 * @author Mariusz Kowalczuk
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
