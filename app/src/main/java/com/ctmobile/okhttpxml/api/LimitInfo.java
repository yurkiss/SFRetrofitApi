
package com.ctmobile.okhttpxml.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.io.Serializable;


/**
 * LimitInfo<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "limitInfo")
@Namespace(reference = "urn:partner.soap.sforce.com")
public class LimitInfo implements Serializable {

    @Element(name = "current", required = false)
    private String current;
    @Element(name = "limit", required = false)
    private String limit;
    @Element(name = "type", required = false)
    private String type;

    public LimitInfo() {
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
