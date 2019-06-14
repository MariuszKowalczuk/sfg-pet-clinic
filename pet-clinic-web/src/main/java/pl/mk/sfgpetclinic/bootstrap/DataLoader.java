package pl.mk.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import pl.mk.sfgpetclinic.model.Owner;
import pl.mk.sfgpetclinic.model.Vet;
import pl.mk.sfgpetclinic.services.OwnerService;
import pl.mk.sfgpetclinic.services.VetService;
import pl.mk.sfgpetclinic.services.map.OwnerServiceMap;
import pl.mk.sfgpetclinic.services.map.VetServiceMap;

/**
 * @author Mariusz Kowalczuk
 */
@Component
@ComponentScan("pet-clinic-data.pl.mk")
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    //private final PetService petService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        //petService = new PetServiceMap();
        vetService = new VetServiceMap();

    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("George");
        owner1.setLastName("Washington");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Michale");
        owner2.setLastName("Watson");
        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Lara");
        vet1.setLastName("Croft");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Dominica");
        vet2.setLastName("Proot");
        vetService.save(vet2);

        System.out.println("Loaded Vets");
    }
}
