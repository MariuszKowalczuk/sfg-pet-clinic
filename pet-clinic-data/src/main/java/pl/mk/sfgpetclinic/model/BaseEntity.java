package pl.mk.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Mariusz Kowalczuk
 */
@Getter
@Setter
public class BaseEntity implements Serializable {

    private Long id;
}
