package packmachine.http.request_response;

public class PackResponse {

    private String id;

    private String receptionCode;

    private String weight;

    private String description;

    private Person sender;

    private Person receiver;

    public PackResponse() {
    }

    public PackResponse(String id, String receptionCode, String weight, String description, Person sender, Person receiver) {
        this.id = id;
        this.receptionCode = receptionCode;
        this.weight = weight;
        this.description = description;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getId() {
        return id;
    }

    public Person getSender() {
        return sender;
    }

    public Person getReceiver() {
        return receiver;
    }
}
