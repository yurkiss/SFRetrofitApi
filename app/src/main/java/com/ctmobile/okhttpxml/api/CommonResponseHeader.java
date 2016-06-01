
package com.ctmobile.okhttpxml.api;

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
public class CommonResponseHeader implements Serializable {

    @Element(name = "LimitInfoHeader", required = false)
    private LimitInfoHeader limitInfoHeader;

    public CommonResponseHeader() {
    }

    public LimitInfoHeader getLimitInfoHeader() {
        return limitInfoHeader;
    }

    public void setLimitInfoHeader(LimitInfoHeader limitInfoHeader) {
        this.limitInfoHeader = limitInfoHeader;
    }

}
