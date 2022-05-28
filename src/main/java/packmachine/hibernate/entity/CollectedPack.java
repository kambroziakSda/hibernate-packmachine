package packmachine.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CollectedPack {

    @GeneratedValue
    @Id
    private Integer id;

    private String description;

}
