/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitionwebserviceapplication;

import com.competitionservice._135045.competition.AddAthleteRequest;
import com.competitionservice._135045.competition.AthleteType;
import com.competitionservice._135045.competition.CompetitionPortType;
import com.competitionservice._135045.competition.CompetitionService;
import com.competitionservice._135045.competition.GetAthleteListRequest;
import com.competitionservice._135045.competition.GetAthleteListResponse;
import com.competitionservice._135045.competition.GetAthleteRequest;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author taaniel
 */
public class CompetitionWebServiceApplication {

    /**
     * @param args the command line arguments
     */
    static List<AthleteType> athleteList = new ArrayList<AthleteType>();

    
    
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter token for getting athlete:");
        BigInteger id = obj.nextBigInteger();
        GetAthleteRequest request = new GetAthleteRequest();
        request.setToken("salajane");
        request.setId(id);
        AthleteType response = getAthlete(request);
        System.out.println(response.getName());
 
    }

    private static GetAthleteListResponse getAthleteList(GetAthleteListRequest parameter) {
        CompetitionService service = new CompetitionService();
        CompetitionPortType port = service.getCompetitionPort();
        return port.getAthleteList(parameter);
    }


    private static AthleteType getAthlete(GetAthleteRequest parameter) {
        com.competitionservice._135045.competition.CompetitionService service = new com.competitionservice._135045.competition.CompetitionService();
        com.competitionservice._135045.competition.CompetitionPortType port = service.getCompetitionPort();
        return port.getAthlete(parameter);
    }
}
