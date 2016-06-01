
package com.ctmobile.okhttpxml.api.retrieve.response;

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
@Root(name = "Body")
@Namespace(reference = "http://schemas.xmlsoap.org/soap/envelope/")
public class Body implements Serializable {

    @Element(name = "retrieveResponse", required = false)
    private RetrieveResponse retrieveResponse;

    public Body() {
    }

    public RetrieveResponse getRetrieveResponse() {
        return retrieveResponse;
    }

    public void setRetrieveResponse(RetrieveResponse retrieveResponse) {
        this.retrieveResponse = retrieveResponse;
    }

}
