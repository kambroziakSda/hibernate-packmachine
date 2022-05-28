package packmachine.http.boundary;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import packmachine.http.request_response.AddPackMachineRequest;
import packmachine.http.request_response.CityCreateRequest;
import packmachine.http.request_response.CityResponse;

import java.util.Collections;
import java.util.List;

@Path("/cities")
public class CityResource {

    private static final Logger logger = LoggerFactory.getLogger(CityResource.class);

    // TODO: 28.05.2022 Zapisanie miasta w bazie danych. Miasta w bazie nie powinny się powtarzać

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addCity(CityCreateRequest request) {
        logger.info("Received: " + request);
        return Response.ok().build();
    }

    // TODO: 28.05.2022 Pobranie wszystkich miast z bazy. Jeśli pageSize lub pageNo == null wtedy wyciągamy po protu wszystko
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CityResponse> getAllCities(@QueryParam("pageSize") Integer pageSize, @QueryParam("pageNo") Integer pageNo) {
        return Collections.emptyList();
    }

    // TODO: 28.05.2022 Zapisanie paczkomatów w mieście. Miasto powinno być stworzone wcześniej
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/machines")
    public Response addPackMachine(AddPackMachineRequest request) {
        logger.info("Received: " + request);
        return Response.ok().build();
    }

    // TODO: 28.05.2022 Zwrócenie X najbardziej zapakowanych paczkomatów w mieście
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/machines/{city}/{max}")
    public Response getPackMachine(@PathParam("city") String city, @PathParam("max") int max) {
        return Response.ok().build();
    }

}
