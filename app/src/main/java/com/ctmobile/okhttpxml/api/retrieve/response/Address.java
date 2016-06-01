
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
<city>Alameda</city>
<country>uuuuu</country>
<countryCode xsi:nil="true"/>
<geocodeAccuracy xsi:nil="true"/>
<postalCode xsi:nil="true"/>
<state xsi:nil="true"/>
<stateCode xsi:nil="true"/>
<street>Clinton Ave</street>
 *
 */
@Root(strict = false)
@Namespace(reference = "urn:partner.soap.sforce.com")
public class Address {

    @Element(required = false)
    private String latitude;
    @Element(required = false)
    private String longitude;
    @Element(required = false)
    private String city;
    @Element(required = false)
    private String country;
    @Element(required = false)
    private String postalCode;
    @Element(required = false)
    private String state;
    @Element(required = false)
    private String stateCode;
    @Element(required = false)
    private String street;

    public Address() {
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", state='" + state + '\'' +
                ", stateCode='" + stateCode + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
