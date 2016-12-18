/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competition;

import com.competitionservice._135045.competition.AddCompetitionAthleteRequest;
import com.competitionservice._135045.competition.AddCompetitionRequest;
import com.competitionservice._135045.competition.CompetitionAthleteListType;
import com.competitionservice._135045.competition.CompetitionAthleteType;
import com.competitionservice._135045.competition.CompetitionType;
import com.competitionservice._135045.competition.GetCompetitionAthleteListRequest;
import com.competitionservice._135045.competition.GetCompetitionListRequest;
import com.competitionservice._135045.competition.GetCompetitionListResponse;
import com.competitionservice._135045.competition.GetCompetitionRequest;
import java.math.BigInteger;
import java.util.Date;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * REST Web Service
 *
 * @author taaniel
 */
@Path("competitions")
public class CompetitionResource {
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AthletesResource
     */
    public CompetitionResource() {
    }
    
    @GET
    @Produces("application/json")
    public GetCompetitionListResponse getCompetitionList(@QueryParam("token") String token, @QueryParam("competitionLocation") String competitionLocation) {
        CompetitionWebService ws = new CompetitionWebService();
        GetCompetitionListRequest request = new GetCompetitionListRequest();
        request.setToken(token);
        request.setCompetitionLocation(competitionLocation);
        return ws.getCompetitionList(request);
    }
    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces(MediaType.APPLICATION_JSON)
    public CompetitionType getCompetition(@PathParam("id") String id, @QueryParam("token") String token) {
        CompetitionWebService ws = new CompetitionWebService();
        GetCompetitionRequest request = new GetCompetitionRequest();
        BigInteger num = BigInteger.valueOf(Integer.parseInt(id));
        return ws.getCompetition(num);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CompetitionType addCompetition(CompetitionType content, @QueryParam("token") String token) {
        CompetitionWebService ws = new CompetitionWebService();
        AddCompetitionRequest request = new AddCompetitionRequest();
        request.setCompetitionNo(content.getCompetitionNo());
        request.setCompetitionLocation(content.getCompetitionLocation());
        request.setCompetitionDate(content.getCompetitionDate());
        request.setName(content.getName());
        request.setDueDate(content.getDueDate());
        request.setToken(token);
        return ws.addCompetition(request);
    }
    @POST
    @Path("{id : \\d+}/athletes")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CompetitionAthleteType addCompetitionAthlete(CompetitionAthleteType content, @QueryParam("token") String token, @PathParam("id") String id) {
        CompetitionWebService ws = new CompetitionWebService();
        AddCompetitionAthleteRequest request = new AddCompetitionAthleteRequest();
        request.setToken(token);
        request.setCompetitionId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setAthleteId(content.getAthlete().getId());
        return ws.addCompetitionAthlete(request);    
    }
    
    @GET
    @Path("{id : \\d+}/athletes")
    @Produces(MediaType.APPLICATION_JSON)    
    public CompetitionAthleteListType getCompetitionAthleteList(@PathParam("id") String id, @QueryParam("token") String token) {
        CompetitionWebService ws = new CompetitionWebService();
        GetCompetitionAthleteListRequest request = new GetCompetitionAthleteListRequest();
        request.setCompetitionId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getCompetitionAthleteList(request);
    }
    
}
