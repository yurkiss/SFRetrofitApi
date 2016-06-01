
package com.ctmobile.okhttpxml.api.retrieve.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Address<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 *
<latitude>0.0</latitude>
<longitude>0.0</longitude>
 *
 */
@Root(strict = false)
@Namespace(reference = "urn:partner.soap.sforce.com")
public class Location {

    @Element(required = false)
    private String latitude;
    @Element(required = false)
    private String longitude;


    public Location() {
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


    @Override
    public String toString() {
        return "Address{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}
