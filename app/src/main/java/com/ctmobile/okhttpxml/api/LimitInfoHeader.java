
package com.ctmobile.okhttpxml.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.io.Serializable;


/**
 * LimitInfoHeader<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "LimitInfoHeader")
@Namespace(reference = "urn:partner.soap.sforce.com")
public class LimitInfoHeader implements Serializable {

    @Element(name = "limitInfo", required = false)
    private LimitInfo limitInfo;

    public LimitInfoHeader() {
    }

    public LimitInfo getLimitInfo() {
        return limitInfo;
    }

    public void setLimitInfo(LimitInfo limitInfo) {
        this.limitInfo = limitInfo;
    }

}
