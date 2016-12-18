
package com.competitionservice._135045.competition;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for competitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="competitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="competitionNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="competitionLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="competitionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="competitionAthleteList" type="{http://www.competitionservice.com/135045/competition}competitionAthleteListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "competitionType", propOrder = {
    "id",
    "competitionNo",
    "name",
    "competitionLocation",
    "competitionDate",
    "dueDate",
    "competitionAthleteList"
})
public class CompetitionType {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected BigInteger competitionNo;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String competitionLocation;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar competitionDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(required = true)
    protected CompetitionAthleteListType competitionAthleteList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the competitionNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCompetitionNo() {
        return competitionNo;
    }

    /**
     * Sets the value of the competitionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCompetitionNo(BigInteger value) {
        this.competitionNo = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the competitionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompetitionDate() {
        return competitionDate;
    }

    /**
     * Sets the value of the competitionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompetitionDate(XMLGregorianCalendar value) {
        this.competitionDate = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the competitionAthleteList property.
     * 
     * @return
     *     possible object is
     *     {@link CompetitionAthleteListType }
     *     
     */
    public CompetitionAthleteListType getCompetitionAthleteList() {
        return competitionAthleteList;
    }

    /**
     * Sets the value of the competitionAthleteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompetitionAthleteListType }
     *     
     */
    public void setCompetitionAthleteList(CompetitionAthleteListType value) {
        this.competitionAthleteList = value;
    }

}
