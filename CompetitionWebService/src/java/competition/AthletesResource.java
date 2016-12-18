/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competition;

import com.competitionservice._135045.competition.AddAthleteRequest;
import com.competitionservice._135045.competition.AthleteType;
import com.competitionservice._135045.competition.GetAthleteListRequest;
import com.competitionservice._135045.competition.GetAthleteListResponse;
import com.competitionservice._135045.competition.GetAthleteRequest;
import java.math.BigInteger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author taaniel
 */
@Path("athletes")
public class AthletesResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AthletesResource
     */
    public AthletesResource() {
    }
    
    @GET
    @Produces("application/json")
    public GetAthleteListResponse getAthleteList(@QueryParam("token") String token, @QueryParam("gender") String gender) {
        CompetitionWebService ws = new CompetitionWebService();
        GetAthleteListRequest request = new GetAthleteListRequest();
        request.setToken(token);
        request.setGender(gender);
        return ws.getAthleteList(request);
    }
    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public AthleteType getAthlete(@PathParam("id") String id, @QueryParam("token") String token) {
        CompetitionWebService ws = new CompetitionWebService();
        GetAthleteRequest request = new GetAthleteRequest();
        return ws.getAthlete(BigInteger.valueOf(Integer.parseInt(id)));
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public AthleteType addAthlete(AthleteType content, @QueryParam("token") String token) {
        CompetitionWebService ws = new CompetitionWebService();
        AddAthleteRequest request = new AddAthleteRequest();
        request.setNumber(content.getNumber());
        request.setGender(content.getGender());
        request.setName(content.getName());
        request.setToken(token);
        return ws.addAthlete(request);
    }
}
