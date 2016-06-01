
package com.ctmobile.okhttpxml.api.retrieve.request;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * RetrieveRequest<br>
 */
@Root(name = "retrieve")
@Namespace(reference = "urn:partner.soap.sforce.com")
@Order(elements = {"fieldList", "sObjectType", "ids"})
public class RetrieveRequest {

    @Element(name = "fieldList")
    @Namespace(reference = "urn:partner.soap.sforce.com")
    private String fieldList;

    @Element(name = "sObjectType")
    @Namespace(reference = "urn:partner.soap.sforce.com")
    private String sObjectType;

    @ElementList(name = "ids", entry = "ids", inline = true)
    @Namespace(reference = "urn:partner.soap.sforce.com")
    private List<String> ids;

    public String getFieldList() {
        return fieldList;
    }

    public void setFieldList(String fieldList) {
        this.fieldList = fieldList;
    }

    public String getsObjectType() {
        return sObjectType;
    }

    public void setsObjectType(String sObjectType) {
        this.sObjectType = sObjectType;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public RetrieveRequest() {
    }
}

