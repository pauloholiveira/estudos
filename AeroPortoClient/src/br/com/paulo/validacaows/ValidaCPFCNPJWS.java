
package br.com.paulo.validacaows;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ValidaCPF_CNPJWS", targetNamespace = "http://validacaoWS.paulo.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ValidaCPFCNPJWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarCPFouCNPJ", targetNamespace = "http://validacaoWS.paulo.com.br/", className = "br.com.paulo.validacaows.ValidarCPFouCNPJ")
    @ResponseWrapper(localName = "validarCPFouCNPJResponse", targetNamespace = "http://validacaoWS.paulo.com.br/", className = "br.com.paulo.validacaows.ValidarCPFouCNPJResponse")
    public boolean validarCPFouCNPJ(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}