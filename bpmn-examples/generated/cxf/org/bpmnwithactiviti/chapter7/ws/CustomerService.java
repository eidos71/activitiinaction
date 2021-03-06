package org.bpmnwithactiviti.chapter7.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.4
 * 2011-08-26T19:49:55.546+02:00
 * Generated source version: 2.3.4
 * 
 */
 
@WebService(targetNamespace = "http://ws.chapter7.bpmnwithactiviti.org/", name = "CustomerService")
@XmlSeeAlso({ObjectFactory.class})
public interface CustomerService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "findCustomerById", targetNamespace = "http://ws.chapter7.bpmnwithactiviti.org/", className = "org.bpmnwithactiviti.chapter7.ws.FindCustomerById")
    @WebMethod
    @ResponseWrapper(localName = "findCustomerByIdResponse", targetNamespace = "http://ws.chapter7.bpmnwithactiviti.org/", className = "org.bpmnwithactiviti.chapter7.ws.FindCustomerByIdResponse")
    public org.bpmnwithactiviti.chapter7.ws.Customer findCustomerById(
        @WebParam(name = "customerId", targetNamespace = "")
        long customerId
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "findCustomer", targetNamespace = "http://ws.chapter7.bpmnwithactiviti.org/", className = "org.bpmnwithactiviti.chapter7.ws.FindCustomer")
    @WebMethod
    @ResponseWrapper(localName = "findCustomerResponse", targetNamespace = "http://ws.chapter7.bpmnwithactiviti.org/", className = "org.bpmnwithactiviti.chapter7.ws.FindCustomerResponse")
    public org.bpmnwithactiviti.chapter7.ws.Customer findCustomer(
        @WebParam(name = "customerName", targetNamespace = "")
        java.lang.String customerName,
        @WebParam(name = "contactperson", targetNamespace = "")
        java.lang.String contactperson
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "storeSalesOpportunity", targetNamespace = "http://ws.chapter7.bpmnwithactiviti.org/", className = "org.bpmnwithactiviti.chapter7.ws.StoreSalesOpportunity")
    @WebMethod
    @ResponseWrapper(localName = "storeSalesOpportunityResponse", targetNamespace = "http://ws.chapter7.bpmnwithactiviti.org/", className = "org.bpmnwithactiviti.chapter7.ws.StoreSalesOpportunityResponse")
    public org.bpmnwithactiviti.chapter7.ws.Customer storeSalesOpportunity(
        @WebParam(name = "product", targetNamespace = "")
        java.lang.String product,
        @WebParam(name = "expectedQuantity", targetNamespace = "")
        long expectedQuantity,
        @WebParam(name = "description", targetNamespace = "")
        java.lang.String description,
        @WebParam(name = "customerId", targetNamespace = "")
        long customerId
    );
}
