package pl.mk.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import pl.mk.sfgpetclinic.model.Owner;
import pl.mk.sfgpetclinic.model.Vet;
import pl.mk.sfgpetclinic.services.OwnerService;
import pl.mk.sfgpetclinic.services.VetService;

/**
 * @author Mariusz Kowalczuk
 */
@Component
@ComponentScan("pet-clinic-data.pl.mk")
public class DataLoader implements CommandLineRunner {


    private OwnerService ownerService;
    //private final PetService petService;
    private VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("George");
        owner1.setLastName("Washington");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Michale");
        owner2.setLastName("Watson");
        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Lara");
        vet1.setLastName("Croft");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Dominica");
        vet2.setLastName("Proot");
        vetService.save(vet2);

        System.out.println("Loaded Vets");
    }
}
