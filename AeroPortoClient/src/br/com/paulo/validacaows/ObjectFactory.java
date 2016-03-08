
package br.com.paulo.validacaows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.paulo.validacaows package. 
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

    private final static QName _ValidarCPFouCNPJResponse_QNAME = new QName("http://validacaoWS.paulo.com.br/", "validarCPFouCNPJResponse");
    private final static QName _ValidarCPFouCNPJ_QNAME = new QName("http://validacaoWS.paulo.com.br/", "validarCPFouCNPJ");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.paulo.validacaows
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidarCPFouCNPJ }
     * 
     */
    public ValidarCPFouCNPJ createValidarCPFouCNPJ() {
        return new ValidarCPFouCNPJ();
    }

    /**
     * Create an instance of {@link ValidarCPFouCNPJResponse }
     * 
     */
    public ValidarCPFouCNPJResponse createValidarCPFouCNPJResponse() {
        return new ValidarCPFouCNPJResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarCPFouCNPJResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validacaoWS.paulo.com.br/", name = "validarCPFouCNPJResponse")
    public JAXBElement<ValidarCPFouCNPJResponse> createValidarCPFouCNPJResponse(ValidarCPFouCNPJResponse value) {
        return new JAXBElement<ValidarCPFouCNPJResponse>(_ValidarCPFouCNPJResponse_QNAME, ValidarCPFouCNPJResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarCPFouCNPJ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validacaoWS.paulo.com.br/", name = "validarCPFouCNPJ")
    public JAXBElement<ValidarCPFouCNPJ> createValidarCPFouCNPJ(ValidarCPFouCNPJ value) {
        return new JAXBElement<ValidarCPFouCNPJ>(_ValidarCPFouCNPJ_QNAME, ValidarCPFouCNPJ.class, null, value);
    }

}
