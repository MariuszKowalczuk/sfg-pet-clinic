package pl.mk.sfgpetclinic.bootstrap;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import pl.mk.sfgpetclinic.model.*;
import pl.mk.sfgpetclinic.services.*;

import java.time.LocalDate;

/**
 * @author Mariusz Kowalczuk
 */

@Component
@ComponentScan("pet-clinic-data.pl.mk")
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;


    @Override
    public void run(String... args) throws Exception {
        if(petTypeService.findAll().size()<1){

            loadData();
        }

    }

    private void loadData() {
        PetType dog = new PetType("Dog");
        PetType savedDog = petTypeService.save(dog);

        PetType cat = new PetType("Cat");
        PetType savedCat = petTypeService.save(cat);

        Speciality radiology = new Speciality("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality dentistry = new Speciality("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        Speciality surgery = new Speciality("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);


        Owner owner1 = new Owner();
        owner1.setFirstName("George");
        owner1.setLastName("Washington");
        owner1.setAddress("Baker Street 7");
        owner1.setCity("London");
        owner1.setTelephone("123123123");
        ownerService.save(owner1);

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDog);
        mikesPet.setBirthDate(LocalDate.now().minusYears(1));
        mikesPet.setName("Bruno");
        mikesPet.setOwner(owner1);
        owner1.getPets().add(mikesPet);

        Owner owner2 = new Owner();
        owner2.setFirstName("Michale");
        owner2.setLastName("Watson");
        owner2.setTelephone("32132131");
        owner2.setCity("Los Angeles");
        owner2.setAddress("Rock Blv 123");
        ownerService.save(owner2);

        Pet michalesPet = new Pet();
        michalesPet.setPetType(savedCat);
        michalesPet.setBirthDate(LocalDate.now().minusYears(2));
        michalesPet.setName("Rocko");
        michalesPet.setOwner(owner2);
        owner2.getPets().add(michalesPet);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Lara");
        vet1.setLastName("Croft");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setFirstName("Dominica");
        vet2.setLastName("Proot");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

        System.out.println("Loaded Vets");
    }


}
