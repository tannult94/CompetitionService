
package com.competitionservice._135045.competition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for competitionAthleteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="competitionAthleteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="athlete" type="{http://www.competitionservice.com/135045/competition}athleteType"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "competitionAthleteType", propOrder = {
    "athlete",
    "quantity"
})
public class CompetitionAthleteType {

    @XmlElement(required = true)
    protected AthleteType athlete;
    protected double quantity;

    /**
     * Gets the value of the athlete property.
     * 
     * @return
     *     possible object is
     *     {@link AthleteType }
     *     
     */
    public AthleteType getAthlete() {
        return athlete;
    }

    /**
     * Sets the value of the athlete property.
     * 
     * @param value
     *     allowed object is
     *     {@link AthleteType }
     *     
     */
    public void setAthlete(AthleteType value) {
        this.athlete = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(double value) {
        this.quantity = value;
    }

}
