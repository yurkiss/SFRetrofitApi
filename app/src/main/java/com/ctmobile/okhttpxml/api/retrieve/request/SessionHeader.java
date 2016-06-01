
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
@Root(name = "SessionHeader")
@Namespace(reference = "http://schemas.xmlsoap.org/soap/envelope/")
public class SessionHeader implements Serializable {

    @Element(name = "sessionId")
    @Namespace(reference = "urn:partner.soap.sforce.com")
    private String sessionId;

    public SessionHeader() {
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
