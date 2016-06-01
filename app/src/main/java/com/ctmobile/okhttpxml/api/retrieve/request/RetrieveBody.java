
package com.ctmobile.okhttpxml.api.retrieve.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.io.Serializable;


/**
 * Body<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Namespace(reference = "http://schemas.xmlsoap.org/soap/envelope/")
@Root(name = "Body")
public class RetrieveBody implements Serializable {

    @Namespace(reference = "urn:partner.soap.sforce.com")
    @Element(name = "retrieve", required = true)
    private RetrieveRequest retrieveRequest;

    public RetrieveBody() {
    }

    public RetrieveRequest getRetrieveRequest() {
        return retrieveRequest;
    }

    public void setRetrieveRequest(RetrieveRequest retrieveRequest) {
        this.retrieveRequest = retrieveRequest;
    }
}


