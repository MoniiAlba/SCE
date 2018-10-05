
package tstws;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MiServicioWeb", targetNamespace = "http://miservicioweb/", wsdlLocation = "http://148.205.133.193:8080/MisWebServices/MiServicioWeb?WSDL")
public class MiServicioWeb_Service
    extends Service
{

    private final static URL MISERVICIOWEB_WSDL_LOCATION;
    private final static WebServiceException MISERVICIOWEB_EXCEPTION;
    private final static QName MISERVICIOWEB_QNAME = new QName("http://miservicioweb/", "MiServicioWeb");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://148.205.133.193:8080/MisWebServices/MiServicioWeb?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MISERVICIOWEB_WSDL_LOCATION = url;
        MISERVICIOWEB_EXCEPTION = e;
    }

    public MiServicioWeb_Service() {
        super(__getWsdlLocation(), MISERVICIOWEB_QNAME);
    }

    public MiServicioWeb_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MISERVICIOWEB_QNAME, features);
    }

    public MiServicioWeb_Service(URL wsdlLocation) {
        super(wsdlLocation, MISERVICIOWEB_QNAME);
    }

    public MiServicioWeb_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MISERVICIOWEB_QNAME, features);
    }

    public MiServicioWeb_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MiServicioWeb_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MiServicioWeb
     */
    @WebEndpoint(name = "MiServicioWebPort")
    public MiServicioWeb getMiServicioWebPort() {
        return super.getPort(new QName("http://miservicioweb/", "MiServicioWebPort"), MiServicioWeb.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MiServicioWeb
     */
    @WebEndpoint(name = "MiServicioWebPort")
    public MiServicioWeb getMiServicioWebPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://miservicioweb/", "MiServicioWebPort"), MiServicioWeb.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MISERVICIOWEB_EXCEPTION!= null) {
            throw MISERVICIOWEB_EXCEPTION;
        }
        return MISERVICIOWEB_WSDL_LOCATION;
    }

}
