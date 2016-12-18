
package com.competitionservice._135045.competition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="competition" type="{http://www.competitionservice.com/135045/competition}competitionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "competition"
})
@XmlRootElement(name = "getCompetitionListResponse")
public class GetCompetitionListResponse {

    protected List<CompetitionType> competition;

    /**
     * Gets the value of the competition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetitionType }
     * 
     * 
     */
    public List<CompetitionType> getCompetition() {
        if (competition == null) {
            competition = new ArrayList<CompetitionType>();
        }
        return this.competition;
    }

}
