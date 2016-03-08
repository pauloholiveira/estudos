
package br.com.paulo.precogasws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PrecoGasolinaWSService", targetNamespace = "http://precoGasWS.paulo.com.br/", wsdlLocation = "http://localhost:8080/ProjetoWSAeroPorto/PrecoGasolinaWS?wsdl")
public class PrecoGasolinaWSService
    extends Service
{

    private final static URL PRECOGASOLINAWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRECOGASOLINAWSSERVICE_EXCEPTION;
    private final static QName PRECOGASOLINAWSSERVICE_QNAME = new QName("http://precoGasWS.paulo.com.br/", "PrecoGasolinaWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ProjetoWSAeroPorto/PrecoGasolinaWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRECOGASOLINAWSSERVICE_WSDL_LOCATION = url;
        PRECOGASOLINAWSSERVICE_EXCEPTION = e;
    }

    public PrecoGasolinaWSService() {
        super(__getWsdlLocation(), PRECOGASOLINAWSSERVICE_QNAME);
    }

    public PrecoGasolinaWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRECOGASOLINAWSSERVICE_QNAME, features);
    }

    public PrecoGasolinaWSService(URL wsdlLocation) {
        super(wsdlLocation, PRECOGASOLINAWSSERVICE_QNAME);
    }

    public PrecoGasolinaWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRECOGASOLINAWSSERVICE_QNAME, features);
    }

    public PrecoGasolinaWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PrecoGasolinaWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PrecoGasolinaWS
     */
    @WebEndpoint(name = "PrecoGasolinaWSPort")
    public PrecoGasolinaWS getPrecoGasolinaWSPort() {
        return super.getPort(new QName("http://precoGasWS.paulo.com.br/", "PrecoGasolinaWSPort"), PrecoGasolinaWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PrecoGasolinaWS
     */
    @WebEndpoint(name = "PrecoGasolinaWSPort")
    public PrecoGasolinaWS getPrecoGasolinaWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://precoGasWS.paulo.com.br/", "PrecoGasolinaWSPort"), PrecoGasolinaWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRECOGASOLINAWSSERVICE_EXCEPTION!= null) {
            throw PRECOGASOLINAWSSERVICE_EXCEPTION;
        }
        return PRECOGASOLINAWSSERVICE_WSDL_LOCATION;
    }

}