package pl.mk.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
/**
 * @author Mariusz Kowalczuk
 */
public class Vet extends Person {
    private Set<Speciality> specialities = new HashSet<>();
}
