
package com.ctmobile.okhttpxml.api.retrieve.response;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

import java.util.List;


/**
 * Result<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "result")
@Convert(ResultsConverter.class)
@Namespace(reference = "urn:partner.soap.sforce.com")
public class RetrieveResult {

    private String id;
    private String type;
    private boolean nil;
    public String Body;
    public String BodyLength;
    private List<Field> fieldsList;

    public RetrieveResult() {
    }

    public RetrieveResult(List<Field> fieldsList) {
        this.fieldsList = fieldsList;
    }

    public static class Field {
        public String name;
        public String type;
        //Depends on type
        public Object value;

        public Field(String name, String type, Object value) {
            this.name = name;
            this.type = type;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Field field = (Field) o;

            if (name != null ? !name.equals(field.name) : field.name != null) return false;
            if (type != null ? !type.equals(field.type) : field.type != null) return false;
            return value != null ? value.equals(field.value) : field.value == null;

        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (type != null ? type.hashCode() : 0);
            result = 31 * result + (value != null ? value.hashCode() : 0);
            return result;
        }
    }

    public List<Field> getFieldsList() {
        return fieldsList;
    }

    public void setFieldsList(List<Field> fieldsList) {
        this.fieldsList = fieldsList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isNil() {
        return nil;
    }

    public void setNil(boolean nil) {
        this.nil = nil;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    public String getBodyLength() {
        return BodyLength;
    }

    public void setBodyLength(String bodyLength) {
        BodyLength = bodyLength;
    }
}
