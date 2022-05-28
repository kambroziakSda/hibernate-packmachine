package packmachine.http.request_response;

import java.util.List;

public class AddPackMachineRequest {

    private String cityName;

    private List<PackMachineRequest> packMachines;

    public String getCityName() {
        return cityName;
    }

    public List<PackMachineRequest> getPackMachines() {
        return packMachines;
    }
}
