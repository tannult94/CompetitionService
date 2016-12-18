
package com.competitionservice._135045.competition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for competitionAthleteListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="competitionAthleteListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="competitionAthlete" type="{http://www.competitionservice.com/135045/competition}competitionAthleteType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "competitionAthleteListType", propOrder = {
    "competitionAthlete"
})
public class CompetitionAthleteListType {

    protected List<CompetitionAthleteType> competitionAthlete;

    /**
     * Gets the value of the competitionAthlete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competitionAthlete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetitionAthlete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetitionAthleteType }
     * 
     * 
     */
    public List<CompetitionAthleteType> getCompetitionAthlete() {
        if (competitionAthlete == null) {
            competitionAthlete = new ArrayList<CompetitionAthleteType>();
        }
        return this.competitionAthlete;
    }

}
