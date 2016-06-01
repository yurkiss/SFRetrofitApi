
package com.ctmobile.okhttpxml.api.login.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * LoginResponse<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "loginResponse", strict = false)
@Namespace(reference = "urn:partner.soap.sforce.com")
public class LoginResponse {

    @Element(name = "result", required = false)
    private Result result;

    public LoginResponse() {
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

}
