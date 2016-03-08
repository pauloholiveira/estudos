
package br.com.paulo.precogasws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.paulo.precogasws package. 
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

    private final static QName _PrecoGasolinaResponse_QNAME = new QName("http://precoGasWS.paulo.com.br/", "precoGasolinaResponse");
    private final static QName _PrecoGasolina_QNAME = new QName("http://precoGasWS.paulo.com.br/", "precoGasolina");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.paulo.precogasws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrecoGasolinaResponse }
     * 
     */
    public PrecoGasolinaResponse createPrecoGasolinaResponse() {
        return new PrecoGasolinaResponse();
    }

    /**
     * Create an instance of {@link PrecoGasolina }
     * 
     */
    public PrecoGasolina createPrecoGasolina() {
        return new PrecoGasolina();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrecoGasolinaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://precoGasWS.paulo.com.br/", name = "precoGasolinaResponse")
    public JAXBElement<PrecoGasolinaResponse> createPrecoGasolinaResponse(PrecoGasolinaResponse value) {
        return new JAXBElement<PrecoGasolinaResponse>(_PrecoGasolinaResponse_QNAME, PrecoGasolinaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrecoGasolina }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://precoGasWS.paulo.com.br/", name = "precoGasolina")
    public JAXBElement<PrecoGasolina> createPrecoGasolina(PrecoGasolina value) {
        return new JAXBElement<PrecoGasolina>(_PrecoGasolina_QNAME, PrecoGasolina.class, null, value);
    }

}
