package packmachine.http.request_response;

public class PackCreateRequest {

    private String packDescription;


    private int receptionCode;

    private String senderEmail;

    private String receiverEmail;

    public String getPackDescription() {
        return packDescription;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public int getReceptionCode() {
        return receptionCode;
    }
}
