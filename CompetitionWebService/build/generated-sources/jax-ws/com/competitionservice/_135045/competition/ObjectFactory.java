
package com.competitionservice._135045.competition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.competitionservice._135045.competition package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAthleteResponse_QNAME = new QName("http://www.competitionservice.com/135045/competition", "getAthleteResponse");
    private final static QName _GetCompetitionResponse_QNAME = new QName("http://www.competitionservice.com/135045/competition", "getCompetitionResponse");
    private final static QName _AddCompetitionAthleteResponse_QNAME = new QName("http://www.competitionservice.com/135045/competition", "addCompetitionAthleteResponse");
    private final static QName _AddAthleteResponse_QNAME = new QName("http://www.competitionservice.com/135045/competition", "addAthleteResponse");
    private final static QName _GetCompetitionAthleteListResponse_QNAME = new QName("http://www.competitionservice.com/135045/competition", "getCompetitionAthleteListResponse");
    private final static QName _AddCompetitionResponse_QNAME = new QName("http://www.competitionservice.com/135045/competition", "addCompetitionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.competitionservice._135045.competition
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompetitionAthleteListType }
     * 
     */
    public CompetitionAthleteListType createCompetitionAthleteListType() {
        return new CompetitionAthleteListType();
    }

    /**
     * Create an instance of {@link GetAthleteRequest }
     * 
     */
    public GetAthleteRequest createGetAthleteRequest() {
        return new GetAthleteRequest();
    }

    /**
     * Create an instance of {@link GetCompetitionListRequest }
     * 
     */
    public GetCompetitionListRequest createGetCompetitionListRequest() {
        return new GetCompetitionListRequest();
    }

    /**
     * Create an instance of {@link AthleteType }
     * 
     */
    public AthleteType createAthleteType() {
        return new AthleteType();
    }

    /**
     * Create an instance of {@link GetCompetitionAthleteListRequest }
     * 
     */
    public GetCompetitionAthleteListRequest createGetCompetitionAthleteListRequest() {
        return new GetCompetitionAthleteListRequest();
    }

    /**
     * Create an instance of {@link GetAthleteListResponse }
     * 
     */
    public GetAthleteListResponse createGetAthleteListResponse() {
        return new GetAthleteListResponse();
    }

    /**
     * Create an instance of {@link GetCompetitionListResponse }
     * 
     */
    public GetCompetitionListResponse createGetCompetitionListResponse() {
        return new GetCompetitionListResponse();
    }

    /**
     * Create an instance of {@link CompetitionType }
     * 
     */
    public CompetitionType createCompetitionType() {
        return new CompetitionType();
    }

    /**
     * Create an instance of {@link AddAthleteRequest }
     * 
     */
    public AddAthleteRequest createAddAthleteRequest() {
        return new AddAthleteRequest();
    }

    /**
     * Create an instance of {@link AddCompetitionRequest }
     * 
     */
    public AddCompetitionRequest createAddCompetitionRequest() {
        return new AddCompetitionRequest();
    }

    /**
     * Create an instance of {@link CompetitionAthleteType }
     * 
     */
    public CompetitionAthleteType createCompetitionAthleteType() {
        return new CompetitionAthleteType();
    }

    /**
     * Create an instance of {@link AddCompetitionAthleteRequest }
     * 
     */
    public AddCompetitionAthleteRequest createAddCompetitionAthleteRequest() {
        return new AddCompetitionAthleteRequest();
    }

    /**
     * Create an instance of {@link GetAthleteListRequest }
     * 
     */
    public GetAthleteListRequest createGetAthleteListRequest() {
        return new GetAthleteListRequest();
    }

    /**
     * Create an instance of {@link GetCompetitionRequest }
     * 
     */
    public GetCompetitionRequest createGetCompetitionRequest() {
        return new GetCompetitionRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AthleteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.competitionservice.com/135045/competition", name = "getAthleteResponse")
    public JAXBElement<AthleteType> createGetAthleteResponse(AthleteType value) {
        return new JAXBElement<AthleteType>(_GetAthleteResponse_QNAME, AthleteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompetitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.competitionservice.com/135045/competition", name = "getCompetitionResponse")
    public JAXBElement<CompetitionType> createGetCompetitionResponse(CompetitionType value) {
        return new JAXBElement<CompetitionType>(_GetCompetitionResponse_QNAME, CompetitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompetitionAthleteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.competitionservice.com/135045/competition", name = "addCompetitionAthleteResponse")
    public JAXBElement<CompetitionAthleteType> createAddCompetitionAthleteResponse(CompetitionAthleteType value) {
        return new JAXBElement<CompetitionAthleteType>(_AddCompetitionAthleteResponse_QNAME, CompetitionAthleteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AthleteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.competitionservice.com/135045/competition", name = "addAthleteResponse")
    public JAXBElement<AthleteType> createAddAthleteResponse(AthleteType value) {
        return new JAXBElement<AthleteType>(_AddAthleteResponse_QNAME, AthleteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompetitionAthleteListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.competitionservice.com/135045/competition", name = "getCompetitionAthleteListResponse")
    public JAXBElement<CompetitionAthleteListType> createGetCompetitionAthleteListResponse(CompetitionAthleteListType value) {
        return new JAXBElement<CompetitionAthleteListType>(_GetCompetitionAthleteListResponse_QNAME, CompetitionAthleteListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompetitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.competitionservice.com/135045/competition", name = "addCompetitionResponse")
    public JAXBElement<CompetitionType> createAddCompetitionResponse(CompetitionType value) {
        return new JAXBElement<CompetitionType>(_AddCompetitionResponse_QNAME, CompetitionType.class, null, value);
    }

}
