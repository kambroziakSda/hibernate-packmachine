package packmachine.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

    @Id
    private String email;

    @OneToOne
    private Address address;

}

