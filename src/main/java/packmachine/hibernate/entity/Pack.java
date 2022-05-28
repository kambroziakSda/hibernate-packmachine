package packmachine.hibernate.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Pack {

    @GeneratedValue
    @Id
    private UUID id;

    private String description;

    private int receptionCode;

    @OneToOne
    private Person sender;

    @OneToOne
    private Person receiver;

    @ManyToOne
    @JoinColumn(name = "id_sender_machine")
    private PackMachine senderMachine;

    @ManyToOne
    @JoinColumn(name = "id_receiver_machine")
    private PackMachine receiverMachine;


}
