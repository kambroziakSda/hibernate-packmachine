package packmachine.http.boundary;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import packmachine.http.request_response.PackCreateRequest;
import packmachine.http.request_response.PackResponse;

import java.util.Collections;
import java.util.List;

@Path("/packs")
public class PackResource {

    private static final Logger logger = LoggerFactory.getLogger(PackResource.class);

    // TODO: 28.05.2022 Zwrócenie wszystkich paczek w bazie które nie są w żadnym paczkomacie
    @GET
    public List<PackResponse> getAllPack() {
        return Collections.emptyList();
    }


    // TODO: 28.05.2022 Stworzenie w bazie paczki ktorej nadawca i odbiorca identyfikowani są po adresie email i powinien znajdować się już w bazie
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPack(PackCreateRequest request) {
        logger.info("Received: " + request);
        return Response.ok().build();
    }

    // TODO: 28.05.2022 Dodawanie paczki do niepełnego paczkomatu w miescie sendera
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/send/{packId}")
    public void addPackToSenderMachine(@PathParam("packId") String packId) {

    }

    // TODO: 28.05.2022 Przeniesienie paczki do niepełnego paczkomatu w mieście odbiorcy. Dotyczy tylko paczek ktore znajdują się w paczkomacie nadawczym
    // TODO: 28.05.2022 "Wysłanie" do odbiorcy informacji o id paczki, kodzie odbioru i paczkomacie w którym jest paczka"
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/transport/{packId}")
    public void transport(@PathParam("packId") String packId) {

    }


    // TODO: 28.05.2022 Odebranie paczki czyli usuniecie z paczkomatu ze wskazanego paczkomatu i dodanie do kolekcji paczek odbiorcy
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/reception/{packId}/{packCode}/{packMachineCode}")
    public void reception(@PathParam("packId") String packId, @PathParam("packCode") String packCode, @PathParam("packMachineCode") String packMachineCode) {

    }

}
