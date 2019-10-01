package pl.mk.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Mariusz Kowalczuk
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PetType extends BaseEntity{
    private String name;
}
