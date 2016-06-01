
package com.ctmobile.okhttpxml.api.login.request;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * LoginRequest<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "login")
@Namespace(reference = "urn:partner.soap.sforce.com")
@Order(elements = {"username", "password"})
public class LoginRequest {

    @Element
    @Namespace(reference = "urn:partner.soap.sforce.com")
    private String username;

    @Element
    @Namespace(reference = "urn:partner.soap.sforce.com")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
