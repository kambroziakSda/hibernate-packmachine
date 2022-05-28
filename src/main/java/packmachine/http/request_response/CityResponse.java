package packmachine.http.request_response;

public class CityResponse {

    private String name;

    public CityResponse(String name) {
        this.name = name;
    }

    CityResponse() {
    }

    public String getName() {
        return name;
    }
}
