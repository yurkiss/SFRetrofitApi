
package com.ctmobile.okhttpxml.api.login.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.io.Serializable;


/**
 * LoginEnvelope<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Envelope", strict = false)
@Namespace(reference = "http://schemas.xmlsoap.org/soap/envelope/")
public class LoginResponseEnvelope implements Serializable {

    @Element(name = "Body", required = false)
    private Body body;

    public LoginResponseEnvelope() {
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
