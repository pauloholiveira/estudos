
package br.com.paulo.distanciaws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.paulo.distanciaws package. 
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

    private final static QName _CalculaDistanciaResponse_QNAME = new QName("http://distanciaWS.paulo.com.br/", "calculaDistanciaResponse");
    private final static QName _CalculaDistancia_QNAME = new QName("http://distanciaWS.paulo.com.br/", "calculaDistancia");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.paulo.distanciaws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculaDistanciaResponse }
     * 
     */
    public CalculaDistanciaResponse createCalculaDistanciaResponse() {
        return new CalculaDistanciaResponse();
    }

    /**
     * Create an instance of {@link CalculaDistancia }
     * 
     */
    public CalculaDistancia createCalculaDistancia() {
        return new CalculaDistancia();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaDistanciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://distanciaWS.paulo.com.br/", name = "calculaDistanciaResponse")
    public JAXBElement<CalculaDistanciaResponse> createCalculaDistanciaResponse(CalculaDistanciaResponse value) {
        return new JAXBElement<CalculaDistanciaResponse>(_CalculaDistanciaResponse_QNAME, CalculaDistanciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaDistancia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://distanciaWS.paulo.com.br/", name = "calculaDistancia")
    public JAXBElement<CalculaDistancia> createCalculaDistancia(CalculaDistancia value) {
        return new JAXBElement<CalculaDistancia>(_CalculaDistancia_QNAME, CalculaDistancia.class, null, value);
    }

}
