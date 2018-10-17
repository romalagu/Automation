package POJO.User;

import org.apache.commons.lang3.StringUtils;

public class Geo {

    String lat;
    String lng;

    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }



    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }

    public void checkNullValues(Geo geo){
        if(geo==null){
            System.out.println("Geo object is null");
        }

        if (StringUtils.isBlank(this.lat)) {
            System.out.println("Geo-> lat is null");
        }

        if (StringUtils.isBlank(this.lng)) {
            System.out.println("Geo-> lng is null");
        }

    }

    public boolean equals(Object obj) {

        //if (this == obj) return true;
        if (obj == null) {
            System.out.println("Obj is null");
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            System.out.println("Objects are of different class");
            return false;
        }
        Geo that = (Geo) obj;
        if (!this.lat.equals(that.lat)) {
            System.out.println("lat is not matching with expected lat");
            return false;
        }

        if (!this.lng.equals(that.lng)) {
            System.out.println("lng is not matching with expected lng");
            return false;
        }
        return true;
    }
}
