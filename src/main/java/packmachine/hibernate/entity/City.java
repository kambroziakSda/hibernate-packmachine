package packmachine.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class City {

    @Id
    private String name;

}
