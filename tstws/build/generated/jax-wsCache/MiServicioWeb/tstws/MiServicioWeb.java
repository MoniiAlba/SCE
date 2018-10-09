
package tstws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MiServicioWeb", targetNamespace = "http://miservicioweb/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MiServicioWeb {


    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suma", targetNamespace = "http://miservicioweb/", className = "tstws.Suma")
    @ResponseWrapper(localName = "sumaResponse", targetNamespace = "http://miservicioweb/", className = "tstws.SumaResponse")
    @Action(input = "http://miservicioweb/MiServicioWeb/sumaRequest", output = "http://miservicioweb/MiServicioWeb/sumaResponse")
    public int suma(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://miservicioweb/", className = "tstws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://miservicioweb/", className = "tstws.HelloResponse")
    @Action(input = "http://miservicioweb/MiServicioWeb/helloRequest", output = "http://miservicioweb/MiServicioWeb/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
