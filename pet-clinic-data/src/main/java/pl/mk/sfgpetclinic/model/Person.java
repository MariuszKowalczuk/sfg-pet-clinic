package pl.mk.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Mariusz Kowalczuk
 */
@Getter
@Setter
public class Person extends BaseEntity{

    private String firstName;
    private String lastName;
}
