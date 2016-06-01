
package com.ctmobile.okhttpxml.api.retrieve.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.io.Serializable;


/**
 * Header<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Header")
@Namespace(reference = "http://schemas.xmlsoap.org/soap/envelope/")
public class RetrieveHeader implements Serializable {

    @Element(name = "SessionHeader")
    @Namespace(reference = "urn:partner.soap.sforce.com")
    private SessionHeader sessionHeader;


    public RetrieveHeader() {
    }

    public SessionHeader getSessionHeader() {
        return sessionHeader;
    }

    public void setSessionHeader(SessionHeader sessionHeader) {
        this.sessionHeader = sessionHeader;
    }
}
