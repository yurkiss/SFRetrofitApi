
package com.ctmobile.okhttpxml.api.retrieve.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

import java.io.Serializable;


/**
 * RetriveRequestEnvelope<br>
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
public class RetrieveRequestEnvelope implements Serializable {

    @Element(name = "Header", required = false)
    private RetrieveHeader header;
    @Element(name = "Body", required = false)
    private RetrieveBody body;

    public RetrieveRequestEnvelope() {
    }

    public RetrieveHeader getHeader() {
        return header;
    }

    public void setHeader(RetrieveHeader header) {
        this.header = header;
    }

    public RetrieveBody getBody() {
        return body;
    }

    public void setBody(RetrieveBody body) {
        this.body = body;
    }

}
