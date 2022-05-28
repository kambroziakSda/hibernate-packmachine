package packmachine.http.boundary;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import packmachine.http.request_response.Person;

@Path("/persons")
public class PersonResource {

    // TODO: 28.05.2022 Dodanie osoby do systemu. Jednoczesny zapis encji person oraz address
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPerson(Person person){
        return Response.ok().build();
    }


}
