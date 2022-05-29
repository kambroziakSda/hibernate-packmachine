package packmachine.http.request_response;

public class CityCreateResponse {

    private String cityName;

    public CityCreateResponse() {
    }

    public String getCityName() {
        return cityName;
    }

    public CityCreateResponse(String cityName) {
        this.cityName = cityName;
    }
}
