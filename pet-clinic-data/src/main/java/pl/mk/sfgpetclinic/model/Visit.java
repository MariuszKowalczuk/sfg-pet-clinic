package pl.mk.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


/**
 * @author Mariusz Kowalczuk
 */
@Getter
@Setter
public class Visit {
    private LocalDate date;
    private String description;
    private Pet pet;
}
