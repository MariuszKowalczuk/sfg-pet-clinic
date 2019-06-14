package pl.mk.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import pl.mk.sfgpetclinic.model.Pet;
import pl.mk.sfgpetclinic.services.PetService;

import java.util.Set;

/**
 * @author Mariusz Kowalczuk
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }
}
