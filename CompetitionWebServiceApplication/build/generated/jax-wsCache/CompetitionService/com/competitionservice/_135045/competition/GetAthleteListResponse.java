
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
 *         &lt;element name="athlete" type="{http://www.competitionservice.com/135045/competition}athleteType" maxOccurs="unbounded" minOccurs="0"/>
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
    "athlete"
})
@XmlRootElement(name = "getAthleteListResponse")
public class GetAthleteListResponse {

    protected List<AthleteType> athlete;

    /**
     * Gets the value of the athlete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the athlete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAthlete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AthleteType }
     * 
     * 
     */
    public List<AthleteType> getAthlete() {
        if (athlete == null) {
            athlete = new ArrayList<AthleteType>();
        }
        return this.athlete;
    }

}
