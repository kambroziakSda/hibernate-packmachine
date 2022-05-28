package packmachine.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {

    @GeneratedValue
    @Id
    private Integer id;

    private String street;

    @OneToOne
    private City city;

}
