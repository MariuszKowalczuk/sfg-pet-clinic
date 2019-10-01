package pl.mk.sfgpetclinic.services.map;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mk.sfgpetclinic.model.Speciality;
import pl.mk.sfgpetclinic.model.Vet;
import pl.mk.sfgpetclinic.services.SpecialityService;
import pl.mk.sfgpetclinic.services.VetService;

import java.util.Set;

/**
 * @author Mariusz Kowalczuk
 */
@RequiredArgsConstructor
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

    private final SpecialityService specialityService;
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
        if (object.getSpecialities().size()>0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId()==null){
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());

                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }
}
