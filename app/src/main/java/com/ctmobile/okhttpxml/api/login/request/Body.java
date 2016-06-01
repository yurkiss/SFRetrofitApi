
package com.ctmobile.okhttpxml.api.login.request;

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
public class Body implements Serializable {

    @Namespace(reference = "urn:partner.soap.sforce.com")
    @Element(name = "login", required = true)
    private LoginRequest loginRequest;

    public Body() {
    }

    public LoginRequest getLoginRequest() {
        return loginRequest;
    }

    public void setLoginRequest(LoginRequest loginRequest) {
        this.loginRequest = loginRequest;
    }
}
