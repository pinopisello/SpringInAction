
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

    private final static QName _GetSpitterById_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getSpitterById");
    private final static QName _GetSpitterByIdResponse_QNAME = new QName("http://SEI.jaxws.remoting.spitter.habuma.com/SpitterService", "getSpitterByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.habuma.spitter.remoting.jaxws.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSpitterByIdResponse }
     * 
     */
    public GetSpitterByIdResponse createGetSpitterByIdResponse() {
        return new GetSpitterByIdResponse();
    }

    /**
     * Create an instance of {@link GetSpitterById }
     * 
     */
    public GetSpitterById createGetSpitterById() {
        return new GetSpitterById();
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

}
