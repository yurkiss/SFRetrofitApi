
package com.ctmobile.okhttpxml.api.login.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

import java.io.Serializable;


/**
 * ServerTimestampEnvelope<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Envelope")
@NamespaceList({
        @Namespace(prefix = "x", reference = "http://schemas.xmlsoap.org/soap/envelope/"),
        @Namespace(prefix = "urn1", reference = "urn:partner.soap.sforce.com"),
        })
@Namespace(reference = "http://schemas.xmlsoap.org/soap/envelope/")
public class LoginRequestEnvelope implements Serializable {

    @Element(name = "Header", required = false)
    private Header header;
    @Element(name = "Body", required = false)
    private Body   body;

    public LoginRequestEnvelope() {
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

}
