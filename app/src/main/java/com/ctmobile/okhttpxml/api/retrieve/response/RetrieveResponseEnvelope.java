
package com.ctmobile.okhttpxml.api.retrieve.response;

import com.ctmobile.okhttpxml.api.CommonResponseHeader;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.io.Serializable;


/**
 * ServerTimestampEnvelope<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Envelope")
@Namespace(reference = "http://schemas.xmlsoap.org/soap/envelope/")
public class RetrieveResponseEnvelope implements Serializable {

    @Element(name = "Header", required = false)
    private CommonResponseHeader header;
    @Element(name = "Body", required = false)
    private Body   body;

    public RetrieveResponseEnvelope() {
    }

    public CommonResponseHeader getHeader() {
        return header;
    }

    public void setHeader(CommonResponseHeader header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

}
