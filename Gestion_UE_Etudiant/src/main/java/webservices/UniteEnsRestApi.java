package webservices;

import metiers.UniteEnseignementBusiness;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class UniteEnsRestapi f
public Response getlistue() {
    Status(2UU)
}
entityhelper.getListeE())
    UniteEnsRest
    @Path(®v*/add ») new *
    @POST
    @Consunes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response addue(UniteEnseignement ue) {
        if (helper,addUniteEnseignement(ue)) \
        return Response.status(201). entity(« Success »).build):
    }
else (
    return Response.status(400),entity(« Erreur »).bufld();}
}

    @GET new *