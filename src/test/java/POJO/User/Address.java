package POJO.User;

import org.apache.commons.lang3.StringUtils;

public class Address {

    Geo geo;
    String lat;
    String lng;

    String street;
    String suite;
    String city;
    String zipcode;

    public Address(String street, String suite, String city, String zipcode,Geo geo) {
       this.geo=geo;
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
    }

    public Geo getGeo() {

       //return geo;
       return new Geo(lat,lng);

    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", suite='" + suite + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ",geo=" + geo +
                '}';
    }


    public void checkNullValues(Address addr) {
        if (addr == null) {
            System.out.println("Address object is null");
        }

        if (StringUtils.isBlank(this.street)) {
            System.out.println("Address-> street is null");
        }

        if (StringUtils.isBlank(this.suite)) {
            System.out.println("Address-> suite is null");
        }

        if (StringUtils.isBlank(this.city)) {
            System.out.println("Address-> city is null");
        }
        if (StringUtils.isBlank(this.zipcode)) {
            System.out.println("Address-> zipcode is null");
        }
    }

    @Override
    public boolean equals(Object obj) {

        //if (this == obj) return true;
        if (obj == null){
            System.out.println("Obj is null");
            return false;
        }
        if (this.getClass() != obj.getClass()){
            System.out.println("Objects are of different class");
            return false;
        }
        Address that = (Address) obj;
        if (!this.street.equals(that.street)) {
            System.out.println("street is not matching with expected street");
            return false;
        }
        if (!this.suite.equals(that.suite)){
            System.out.println("suite is not matching with expected suite");
            return false;
        }
        if (!this.city.equals(that.city)){
            System.out.println("city is not matching with expected city");
            return false;
        }
        if (!this.zipcode.equals(that.zipcode)){
            System.out.println("zipcode is not matching with expected zipcode");
            return false;
        }
        if (!this.geo.equals(that.geo)){
            System.out.println("geo is not matching with expected geo");
            return false;
        }
        return true;
    }
}
