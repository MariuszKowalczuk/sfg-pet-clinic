package pl.mk.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import pl.mk.sfgpetclinic.model.Vet;
import pl.mk.sfgpetclinic.services.VetService;

import java.util.Set;

/**
 * @author Mariusz Kowalczuk
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }
}
