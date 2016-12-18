/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competition;

import com.competitionservice._135045.competition.AddAthleteRequest;
import com.competitionservice._135045.competition.AddCompetitionAthleteRequest;
import com.competitionservice._135045.competition.AddCompetitionRequest;
import com.competitionservice._135045.competition.AthleteType;
import com.competitionservice._135045.competition.CompetitionType;
import com.competitionservice._135045.competition.GetAthleteListResponse;
import com.competitionservice._135045.competition.CompetitionAthleteListType;
import com.competitionservice._135045.competition.CompetitionAthleteType;
import com.competitionservice._135045.competition.GetAthleteListRequest;
import com.competitionservice._135045.competition.GetAthleteRequest;
import com.competitionservice._135045.competition.GetCompetitionAthleteListRequest;
import com.competitionservice._135045.competition.GetCompetitionListRequest;
import com.competitionservice._135045.competition.GetCompetitionListResponse;
import com.competitionservice._135045.competition.GetCompetitionRequest;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.jws.WebService;

/**
 *
 * @author taaniel
 */
@WebService(serviceName = "CompetitionService", portName = "CompetitionPort", endpointInterface = "com.competitionservice._135045.competition.CompetitionPortType", targetNamespace = "http://www.competitionservice.com/135045/competition", wsdlLocation = "WEB-INF/wsdl/CompetitionWebService/CompetitionService.wsdl")
public class CompetitionWebService {
    
    static int nextAthleteId = 1;
    static int nextAthleteNumber = 1;
    static int nextCompetitionId = 1;
    static List<CompetitionAthleteType> competitionAthleteList = new ArrayList<>();
    static List<AthleteType> athleteList = new ArrayList<AthleteType>();
    static List<CompetitionType> competitionList = new ArrayList<CompetitionType>();
    
    
    public CompetitionType getCompetition(GetCompetitionRequest parameter) {
        return parameter.getToken().equalsIgnoreCase("salajane") ? getCompetition(parameter.getId()) : null;
    }
    
    public AthleteType getAthlete(GetAthleteRequest parameter) {
    return parameter.getToken().equalsIgnoreCase("salajane") ? getAthlete(parameter.getId()) : null;
    }

    public AthleteType addAthlete(AddAthleteRequest parameter) {
        //TODO implement this method
        AthleteType pt = new AthleteType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            pt.setName(parameter.getName());
            pt.setNumber(BigInteger.valueOf(nextAthleteNumber++));
            pt.setGender(parameter.getGender());
            pt.setId(BigInteger.valueOf(nextAthleteId++));
            athleteList.add(pt);
        }
        return pt;
    }

    public GetAthleteListResponse getAthleteList(GetAthleteListRequest parameter) {
        //TODO implement this method
        GetAthleteListResponse response = new GetAthleteListResponse();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            if (parameter.getGender() != null) {
                    System.out.println(parameter.getGender());
                    List<AthleteType> temp = athleteList
                       .stream()
                       .filter(s -> s.getGender()
                               .equals(parameter.getGender()))
                       .collect(Collectors.toList());
                      response.getAthlete().clear();
                      response.getAthlete().addAll(temp);
                
            } else {
              for (AthleteType productType : athleteList) {
                response.getAthlete().add(productType);
                }
            }
        }
        return response;
    }
    

    public CompetitionType getCompetition(BigInteger id) {
        CompetitionType competitionType = null;
        for (CompetitionType  competition : competitionList) {
            if (competition.getId().equals(id)) {
                competitionType = competition;
            }
         }
         return competitionType;
    }
    
    public AthleteType getAthlete(BigInteger id) {
        AthleteType athleteType = null;
        for (AthleteType  athlete : athleteList) {
            if (athlete.getId().equals(id)) {
                athleteType = athlete;
            }
         }
        return athleteType;
    }

    public CompetitionType addCompetition(AddCompetitionRequest parameter) {
        //TODO implement this method
        CompetitionType it = new CompetitionType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            it.setId(BigInteger.valueOf(nextCompetitionId++));
            it.setCompetitionNo(parameter.getCompetitionNo());
            it.setName(parameter.getName());
            it.setCompetitionDate(parameter.getCompetitionDate());
            it.setCompetitionLocation(parameter.getCompetitionLocation());
            it.setDueDate(parameter.getDueDate());
            it.setCompetitionAthleteList(new CompetitionAthleteListType());
            competitionList.add(it);
        }
        return it;
    }

    public GetCompetitionListResponse getCompetitionList(GetCompetitionListRequest parameter) {
       GetCompetitionListResponse response = new GetCompetitionListResponse();
       if (parameter.getToken().equalsIgnoreCase("salajane")) {
           response.getCompetition().addAll(competitionList);
           if (parameter.getCompetitionLocation()!= null) {
               List<CompetitionType> temp = competitionList
                       .stream()
                       .filter(s -> s.getCompetitionLocation()
                               .equals(parameter.getCompetitionLocation()))
                       .collect(Collectors.toList());
                      response.getCompetition().clear();
                      response.getCompetition().addAll(temp);
           }
      
        }
        return response;
    }
    
    
 

    public CompetitionAthleteListType getCompetitionAthleteList(GetCompetitionAthleteListRequest parameter) {
       CompetitionAthleteListType list = new CompetitionAthleteListType();
         if (parameter.getToken().equalsIgnoreCase("salajane")) {
              CompetitionType competition = getCompetition(parameter.getCompetitionId());
              list = competition.getCompetitionAthleteList();
         }
        return list;
    }

    public CompetitionAthleteType addCompetitionAthlete(AddCompetitionAthleteRequest parameter) {
        //TODO implement this method
        CompetitionAthleteType competitionAthleteType = new CompetitionAthleteType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            competitionAthleteType.setAthlete(getAthlete(parameter.getAthleteId()));
            if (competitionAthleteType.getAthlete() != null) {
               CompetitionType competitionType = getCompetition(parameter.getCompetitionId());
                if (competitionType != null) {
                    if (competitionType.getCompetitionAthleteList() == null) {
                        competitionType.setCompetitionAthleteList(new CompetitionAthleteListType());
                    }
                     competitionType.getCompetitionAthleteList().getCompetitionAthlete().add(competitionAthleteType);
                    competitionAthleteList.add(competitionAthleteType);
                }
               

            }
        }
        return competitionAthleteType;
    }
    
}
