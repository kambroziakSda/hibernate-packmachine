package packmachine.http.request_response;

public class CityCreateRequest {

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CityCreateRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
