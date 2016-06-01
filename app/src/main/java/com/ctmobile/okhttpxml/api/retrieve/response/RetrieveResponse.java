
package com.ctmobile.okhttpxml.api.retrieve.response;


import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * RetrieveResponse<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "retrieveResponse")
@Namespace(reference = "urn:partner.soap.sforce.com")
public class RetrieveResponse {

    @ElementList(name = "result", entry = "result", inline = true, required = false)
    private List<RetrieveResult> result;

    public RetrieveResponse() {
    }

    public List<RetrieveResult> getResult() {
        return result;
    }

    public void setResult(List<RetrieveResult> result) {
        this.result = result;
    }

}
