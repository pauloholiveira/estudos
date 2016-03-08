
package br.com.paulo.cotacaows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.paulo.cotacaows package. 
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

    private final static QName _CotacaoResponse_QNAME = new QName("http://cotacaoWS.paulo.com.br/", "cotacaoResponse");
    private final static QName _Cotacao_QNAME = new QName("http://cotacaoWS.paulo.com.br/", "cotacao");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.paulo.cotacaows
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CotacaoResponse }
     * 
     */
    public CotacaoResponse createCotacaoResponse() {
        return new CotacaoResponse();
    }

    /**
     * Create an instance of {@link Cotacao }
     * 
     */
    public Cotacao createCotacao() {
        return new Cotacao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CotacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cotacaoWS.paulo.com.br/", name = "cotacaoResponse")
    public JAXBElement<CotacaoResponse> createCotacaoResponse(CotacaoResponse value) {
        return new JAXBElement<CotacaoResponse>(_CotacaoResponse_QNAME, CotacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cotacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cotacaoWS.paulo.com.br/", name = "cotacao")
    public JAXBElement<Cotacao> createCotacao(Cotacao value) {
        return new JAXBElement<Cotacao>(_Cotacao_QNAME, Cotacao.class, null, value);
    }

}
