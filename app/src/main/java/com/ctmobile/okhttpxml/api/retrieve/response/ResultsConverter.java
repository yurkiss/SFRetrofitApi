package com.ctmobile.okhttpxml.api.retrieve.response;

import android.util.Log;

import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yurkiss on 5/24/16.
 */

public class ResultsConverter implements Converter<RetrieveResult> {

    Persister persister;

    public ResultsConverter() {
        persister = new Persister();
    }

    @Override
    public RetrieveResult read(InputNode node) throws Exception {

        List<RetrieveResult.Field> list = new ArrayList<>();
        RetrieveResult retrieveResult = new RetrieveResult();

        InputNode nill = node.getAttribute("nil");
        if (nill != null) {
            retrieveResult.setNil(true);
            return retrieveResult;
        }

//        Object source = node.getSource();
//        Element element = (Element) source;
        InputNode child = node.getNext();
        while (child != null) {
            if (child.isElement()) {
                String nodeName = child.getName();
                Object value = child.getValue();
                String type = null;
                if ("Id".equals(nodeName)) {
                    retrieveResult.setId((String) value);
                } else if ("type".equals(nodeName)) {
                    retrieveResult.setType((String) value);
                } else if ("Body".equals(nodeName)) {
                    retrieveResult.setBody((String) value);
                } else if ("BodyLength".equals(nodeName)) {
                    retrieveResult.setBodyLength((String) value);
                } else {
                    InputNode nodeType = child.getAttribute("type");
                    if (nodeType != null) {
                        String nodeTypeValue = nodeType.getValue();
                        if ("address".equals(nodeTypeValue)) {
                            Address address = persister.read(Address.class, child);
                            Log.d("Address", address.toString());
                            value = address;
                            type = nodeTypeValue;
                            // TODO: 5/26/16 Implement location type parsing
                        } else if ("location".equals(nodeTypeValue)) {
                            value = persister.read(Location.class, child);
                            type = nodeTypeValue;
                        } else {
                            throw new UnsupportedOperationException("Unsupported tag type \"" + nodeTypeValue + "\"");
                        }
                    }
                    list.add(new RetrieveResult.Field(nodeName, type, value));
                }
            }
            child = node.getNext();
        }
        retrieveResult.setFieldsList(list);

        return retrieveResult;
    }

    @Override
    public void write(OutputNode node, RetrieveResult value) throws Exception {

    }
}
