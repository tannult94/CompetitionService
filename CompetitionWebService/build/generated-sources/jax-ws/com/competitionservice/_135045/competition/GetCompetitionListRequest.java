
package com.competitionservice._135045.competition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="competitionLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasRelatedAthlete" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="jah|ei"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "token",
    "competitionLocation",
    "hasRelatedAthlete"
})
@XmlRootElement(name = "getCompetitionListRequest")
public class GetCompetitionListRequest {

    @XmlElement(required = true)
    protected String token;
    protected String competitionLocation;
    protected String hasRelatedAthlete;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the competitionLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetitionLocation() {
        return competitionLocation;
    }

    /**
     * Sets the value of the competitionLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetitionLocation(String value) {
        this.competitionLocation = value;
    }

    /**
     * Gets the value of the hasRelatedAthlete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasRelatedAthlete() {
        return hasRelatedAthlete;
    }

    /**
     * Sets the value of the hasRelatedAthlete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasRelatedAthlete(String value) {
        this.hasRelatedAthlete = value;
    }

}
