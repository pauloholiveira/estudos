
package br.com.paulo.estudosejbws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.paulo.estudosejbws package. 
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

    private final static QName _SubtracaoResponse_QNAME = new QName("http://estudosEJBWS.paulo.com.br/", "subtracaoResponse");
    private final static QName _Divisap_QNAME = new QName("http://estudosEJBWS.paulo.com.br/", "divisap");
    private final static QName _SomaResponse_QNAME = new QName("http://estudosEJBWS.paulo.com.br/", "somaResponse");
    private final static QName _Multiplicacao_QNAME = new QName("http://estudosEJBWS.paulo.com.br/", "multiplicacao");
    private final static QName _DivisapResponse_QNAME = new QName("http://estudosEJBWS.paulo.com.br/", "divisapResponse");
    private final static QName _MultiplicacaoResponse_QNAME = new QName("http://estudosEJBWS.paulo.com.br/", "multiplicacaoResponse");
    private final static QName _Soma_QNAME = new QName("http://estudosEJBWS.paulo.com.br/", "soma");
    private final static QName _Subtracao_QNAME = new QName("http://estudosEJBWS.paulo.com.br/", "subtracao");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.paulo.estudosejbws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Divisap }
     * 
     */
    public Divisap createDivisap() {
        return new Divisap();
    }

    /**
     * Create an instance of {@link SubtracaoResponse }
     * 
     */
    public SubtracaoResponse createSubtracaoResponse() {
        return new SubtracaoResponse();
    }

    /**
     * Create an instance of {@link Subtracao }
     * 
     */
    public Subtracao createSubtracao() {
        return new Subtracao();
    }

    /**
     * Create an instance of {@link Soma }
     * 
     */
    public Soma createSoma() {
        return new Soma();
    }

    /**
     * Create an instance of {@link MultiplicacaoResponse }
     * 
     */
    public MultiplicacaoResponse createMultiplicacaoResponse() {
        return new MultiplicacaoResponse();
    }

    /**
     * Create an instance of {@link DivisapResponse }
     * 
     */
    public DivisapResponse createDivisapResponse() {
        return new DivisapResponse();
    }

    /**
     * Create an instance of {@link SomaResponse }
     * 
     */
    public SomaResponse createSomaResponse() {
        return new SomaResponse();
    }

    /**
     * Create an instance of {@link Multiplicacao }
     * 
     */
    public Multiplicacao createMultiplicacao() {
        return new Multiplicacao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtracaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://estudosEJBWS.paulo.com.br/", name = "subtracaoResponse")
    public JAXBElement<SubtracaoResponse> createSubtracaoResponse(SubtracaoResponse value) {
        return new JAXBElement<SubtracaoResponse>(_SubtracaoResponse_QNAME, SubtracaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divisap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://estudosEJBWS.paulo.com.br/", name = "divisap")
    public JAXBElement<Divisap> createDivisap(Divisap value) {
        return new JAXBElement<Divisap>(_Divisap_QNAME, Divisap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://estudosEJBWS.paulo.com.br/", name = "somaResponse")
    public JAXBElement<SomaResponse> createSomaResponse(SomaResponse value) {
        return new JAXBElement<SomaResponse>(_SomaResponse_QNAME, SomaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://estudosEJBWS.paulo.com.br/", name = "multiplicacao")
    public JAXBElement<Multiplicacao> createMultiplicacao(Multiplicacao value) {
        return new JAXBElement<Multiplicacao>(_Multiplicacao_QNAME, Multiplicacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://estudosEJBWS.paulo.com.br/", name = "divisapResponse")
    public JAXBElement<DivisapResponse> createDivisapResponse(DivisapResponse value) {
        return new JAXBElement<DivisapResponse>(_DivisapResponse_QNAME, DivisapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://estudosEJBWS.paulo.com.br/", name = "multiplicacaoResponse")
    public JAXBElement<MultiplicacaoResponse> createMultiplicacaoResponse(MultiplicacaoResponse value) {
        return new JAXBElement<MultiplicacaoResponse>(_MultiplicacaoResponse_QNAME, MultiplicacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://estudosEJBWS.paulo.com.br/", name = "soma")
    public JAXBElement<Soma> createSoma(Soma value) {
        return new JAXBElement<Soma>(_Soma_QNAME, Soma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtracao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://estudosEJBWS.paulo.com.br/", name = "subtracao")
    public JAXBElement<Subtracao> createSubtracao(Subtracao value) {
        return new JAXBElement<Subtracao>(_Subtracao_QNAME, Subtracao.class, null, value);
    }

}
