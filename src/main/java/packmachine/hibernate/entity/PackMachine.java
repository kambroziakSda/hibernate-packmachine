package packmachine.hibernate.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class PackMachine {

    @GeneratedValue
    @Id
    private UUID id;

    private int capacity;

    @ManyToOne
    @JoinColumn(name = "city_name")
    private City city;

    @OneToMany(mappedBy = "senderMachine")
    private List<Pack> packsToSend;

    @OneToMany(mappedBy = "receiverMachine")
    private List<Pack> receivedPacks;

}
