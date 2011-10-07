
package com.habuma.spitter.remoting.jaxws.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.habuma.spitter.remoting.jaxws.server package. 
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

    private final static QName _DeleteSpittle_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "deleteSpittle");
    private final static QName _DeleteSpittleResponse_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "deleteSpittleResponse");
    private final static QName _GetSpittlesForSpitterBySpitterResponse_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getSpittlesForSpitterBySpitterResponse");
    private final static QName _GetSpittlesForSpitterResponse_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getSpittlesForSpitterResponse");
    private final static QName _GetSpittlesForSpitterBySpitter_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getSpittlesForSpitterBySpitter");
    private final static QName _GetRecentSpittles_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getRecentSpittles");
    private final static QName _SaveSpittleResponse_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "saveSpittleResponse");
    private final static QName _GetSpittleByIdResponse_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getSpittleByIdResponse");
    private final static QName _GetSpitter_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getSpitter");
    private final static QName _SaveSpitterResponse_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "saveSpitterResponse");
    private final static QName _StartFollowing_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "startFollowing");
    private final static QName _GetSpittlesForSpitter_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getSpittlesForSpitter");
    private final static QName _SaveSpittle_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "saveSpittle");
    private final static QName _StartFollowingResponse_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "startFollowingResponse");
    private final static QName _GetAllSpittersResponse_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getAllSpittersResponse");
    private final static QName _GetRecentSpittlesResponse_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getRecentSpittlesResponse");
    private final static QName _GetSpitterResponse_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getSpitterResponse");
    private final static QName _SaveSpitter_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "saveSpitter");
    private final static QName _GetAllSpitters_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getAllSpitters");
    private final static QName _GetSpitterById_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getSpitterById");
    private final static QName _GetSpitterByIdResponse_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getSpitterByIdResponse");
    private final static QName _GetSpittleById_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getSpittleById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.habuma.spitter.remoting.jaxws.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StartFollowingResponse }
     * 
     */
    public StartFollowingResponse createStartFollowingResponse() {
        return new StartFollowingResponse();
    }

    /**
     * Create an instance of {@link GetAllSpittersResponse }
     * 
     */
    public GetAllSpittersResponse createGetAllSpittersResponse() {
        return new GetAllSpittersResponse();
    }

    /**
     * Create an instance of {@link SaveSpittle }
     * 
     */
    public SaveSpittle createSaveSpittle() {
        return new SaveSpittle();
    }

    /**
     * Create an instance of {@link GetSpittlesForSpitter }
     * 
     */
    public GetSpittlesForSpitter createGetSpittlesForSpitter() {
        return new GetSpittlesForSpitter();
    }

    /**
     * Create an instance of {@link GetSpitterById }
     * 
     */
    public GetSpitterById createGetSpitterById() {
        return new GetSpitterById();
    }

    /**
     * Create an instance of {@link GetSpitterByIdResponse }
     * 
     */
    public GetSpitterByIdResponse createGetSpitterByIdResponse() {
        return new GetSpitterByIdResponse();
    }

    /**
     * Create an instance of {@link GetSpittleById }
     * 
     */
    public GetSpittleById createGetSpittleById() {
        return new GetSpittleById();
    }

    /**
     * Create an instance of {@link GetAllSpitters }
     * 
     */
    public GetAllSpitters createGetAllSpitters() {
        return new GetAllSpitters();
    }

    /**
     * Create an instance of {@link SaveSpitter }
     * 
     */
    public SaveSpitter createSaveSpitter() {
        return new SaveSpitter();
    }

    /**
     * Create an instance of {@link GetRecentSpittlesResponse }
     * 
     */
    public GetRecentSpittlesResponse createGetRecentSpittlesResponse() {
        return new GetRecentSpittlesResponse();
    }

    /**
     * Create an instance of {@link GetSpitterResponse }
     * 
     */
    public GetSpitterResponse createGetSpitterResponse() {
        return new GetSpitterResponse();
    }

    /**
     * Create an instance of {@link GetSpittlesForSpitterBySpitter }
     * 
     */
    public GetSpittlesForSpitterBySpitter createGetSpittlesForSpitterBySpitter() {
        return new GetSpittlesForSpitterBySpitter();
    }

    /**
     * Create an instance of {@link GetRecentSpittles }
     * 
     */
    public GetRecentSpittles createGetRecentSpittles() {
        return new GetRecentSpittles();
    }

    /**
     * Create an instance of {@link GetSpittlesForSpitterResponse }
     * 
     */
    public GetSpittlesForSpitterResponse createGetSpittlesForSpitterResponse() {
        return new GetSpittlesForSpitterResponse();
    }

    /**
     * Create an instance of {@link GetSpittlesForSpitterBySpitterResponse }
     * 
     */
    public GetSpittlesForSpitterBySpitterResponse createGetSpittlesForSpitterBySpitterResponse() {
        return new GetSpittlesForSpitterBySpitterResponse();
    }

    /**
     * Create an instance of {@link DeleteSpittleResponse }
     * 
     */
    public DeleteSpittleResponse createDeleteSpittleResponse() {
        return new DeleteSpittleResponse();
    }

    /**
     * Create an instance of {@link DeleteSpittle }
     * 
     */
    public DeleteSpittle createDeleteSpittle() {
        return new DeleteSpittle();
    }

    /**
     * Create an instance of {@link StartFollowing }
     * 
     */
    public StartFollowing createStartFollowing() {
        return new StartFollowing();
    }

    /**
     * Create an instance of {@link SaveSpitterResponse }
     * 
     */
    public SaveSpitterResponse createSaveSpitterResponse() {
        return new SaveSpitterResponse();
    }

    /**
     * Create an instance of {@link GetSpitter }
     * 
     */
    public GetSpitter createGetSpitter() {
        return new GetSpitter();
    }

    /**
     * Create an instance of {@link GetSpittleByIdResponse }
     * 
     */
    public GetSpittleByIdResponse createGetSpittleByIdResponse() {
        return new GetSpittleByIdResponse();
    }

    /**
     * Create an instance of {@link SaveSpittleResponse }
     * 
     */
    public SaveSpittleResponse createSaveSpittleResponse() {
        return new SaveSpittleResponse();
    }

    /**
     * Create an instance of {@link Spitter }
     * 
     */
    public Spitter createSpitter() {
        return new Spitter();
    }

    /**
     * Create an instance of {@link Spittle }
     * 
     */
    public Spittle createSpittle() {
        return new Spittle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSpittle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "deleteSpittle")
    public JAXBElement<DeleteSpittle> createDeleteSpittle(DeleteSpittle value) {
        return new JAXBElement<DeleteSpittle>(_DeleteSpittle_QNAME, DeleteSpittle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSpittleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "deleteSpittleResponse")
    public JAXBElement<DeleteSpittleResponse> createDeleteSpittleResponse(DeleteSpittleResponse value) {
        return new JAXBElement<DeleteSpittleResponse>(_DeleteSpittleResponse_QNAME, DeleteSpittleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpittlesForSpitterBySpitterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "getSpittlesForSpitterBySpitterResponse")
    public JAXBElement<GetSpittlesForSpitterBySpitterResponse> createGetSpittlesForSpitterBySpitterResponse(GetSpittlesForSpitterBySpitterResponse value) {
        return new JAXBElement<GetSpittlesForSpitterBySpitterResponse>(_GetSpittlesForSpitterBySpitterResponse_QNAME, GetSpittlesForSpitterBySpitterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpittlesForSpitterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "getSpittlesForSpitterResponse")
    public JAXBElement<GetSpittlesForSpitterResponse> createGetSpittlesForSpitterResponse(GetSpittlesForSpitterResponse value) {
        return new JAXBElement<GetSpittlesForSpitterResponse>(_GetSpittlesForSpitterResponse_QNAME, GetSpittlesForSpitterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpittlesForSpitterBySpitter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "getSpittlesForSpitterBySpitter")
    public JAXBElement<GetSpittlesForSpitterBySpitter> createGetSpittlesForSpitterBySpitter(GetSpittlesForSpitterBySpitter value) {
        return new JAXBElement<GetSpittlesForSpitterBySpitter>(_GetSpittlesForSpitterBySpitter_QNAME, GetSpittlesForSpitterBySpitter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecentSpittles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "getRecentSpittles")
    public JAXBElement<GetRecentSpittles> createGetRecentSpittles(GetRecentSpittles value) {
        return new JAXBElement<GetRecentSpittles>(_GetRecentSpittles_QNAME, GetRecentSpittles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveSpittleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "saveSpittleResponse")
    public JAXBElement<SaveSpittleResponse> createSaveSpittleResponse(SaveSpittleResponse value) {
        return new JAXBElement<SaveSpittleResponse>(_SaveSpittleResponse_QNAME, SaveSpittleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpittleByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "getSpittleByIdResponse")
    public JAXBElement<GetSpittleByIdResponse> createGetSpittleByIdResponse(GetSpittleByIdResponse value) {
        return new JAXBElement<GetSpittleByIdResponse>(_GetSpittleByIdResponse_QNAME, GetSpittleByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpitter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "getSpitter")
    public JAXBElement<GetSpitter> createGetSpitter(GetSpitter value) {
        return new JAXBElement<GetSpitter>(_GetSpitter_QNAME, GetSpitter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveSpitterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "saveSpitterResponse")
    public JAXBElement<SaveSpitterResponse> createSaveSpitterResponse(SaveSpitterResponse value) {
        return new JAXBElement<SaveSpitterResponse>(_SaveSpitterResponse_QNAME, SaveSpitterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartFollowing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "startFollowing")
    public JAXBElement<StartFollowing> createStartFollowing(StartFollowing value) {
        return new JAXBElement<StartFollowing>(_StartFollowing_QNAME, StartFollowing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpittlesForSpitter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "getSpittlesForSpitter")
    public JAXBElement<GetSpittlesForSpitter> createGetSpittlesForSpitter(GetSpittlesForSpitter value) {
        return new JAXBElement<GetSpittlesForSpitter>(_GetSpittlesForSpitter_QNAME, GetSpittlesForSpitter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveSpittle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "saveSpittle")
    public JAXBElement<SaveSpittle> createSaveSpittle(SaveSpittle value) {
        return new JAXBElement<SaveSpittle>(_SaveSpittle_QNAME, SaveSpittle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartFollowingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "startFollowingResponse")
    public JAXBElement<StartFollowingResponse> createStartFollowingResponse(StartFollowingResponse value) {
        return new JAXBElement<StartFollowingResponse>(_StartFollowingResponse_QNAME, StartFollowingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSpittersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "getAllSpittersResponse")
    public JAXBElement<GetAllSpittersResponse> createGetAllSpittersResponse(GetAllSpittersResponse value) {
        return new JAXBElement<GetAllSpittersResponse>(_GetAllSpittersResponse_QNAME, GetAllSpittersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecentSpittlesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "getRecentSpittlesResponse")
    public JAXBElement<GetRecentSpittlesResponse> createGetRecentSpittlesResponse(GetRecentSpittlesResponse value) {
        return new JAXBElement<GetRecentSpittlesResponse>(_GetRecentSpittlesResponse_QNAME, GetRecentSpittlesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpitterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "getSpitterResponse")
    public JAXBElement<GetSpitterResponse> createGetSpitterResponse(GetSpitterResponse value) {
        return new JAXBElement<GetSpitterResponse>(_GetSpitterResponse_QNAME, GetSpitterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveSpitter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "saveSpitter")
    public JAXBElement<SaveSpitter> createSaveSpitter(SaveSpitter value) {
        return new JAXBElement<SaveSpitter>(_SaveSpitter_QNAME, SaveSpitter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSpitters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "getAllSpitters")
    public JAXBElement<GetAllSpitters> createGetAllSpitters(GetAllSpitters value) {
        return new JAXBElement<GetAllSpitters>(_GetAllSpitters_QNAME, GetAllSpitters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpitterById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "getSpitterById")
    public JAXBElement<GetSpitterById> createGetSpitterById(GetSpitterById value) {
        return new JAXBElement<GetSpitterById>(_GetSpitterById_QNAME, GetSpitterById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpitterByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "getSpitterByIdResponse")
    public JAXBElement<GetSpitterByIdResponse> createGetSpitterByIdResponse(GetSpitterByIdResponse value) {
        return new JAXBElement<GetSpitterByIdResponse>(_GetSpitterByIdResponse_QNAME, GetSpitterByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpittleById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", name = "getSpittleById")
    public JAXBElement<GetSpittleById> createGetSpittleById(GetSpittleById value) {
        return new JAXBElement<GetSpittleById>(_GetSpittleById_QNAME, GetSpittleById.class, null, value);
    }

}
