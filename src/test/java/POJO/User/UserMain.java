package POJO.User;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;


public class UserMain {

    String id;
    String name;
    String username;
    String email;

   public Address address;
   public String street;
    String suite;
    String city;
    String zipcode;

    Geo geo;
    String lat;
    String lng;

    String phone;
    String website;

    Company company;
    String cname;
    String catchPhrase;
    String bs;

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return cname;
    }

    public void setName(String name) {
        this.cname = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
       return address;
      // return new Address(street,suite,city,zipcode,geo);
    }

   public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Company getCompany() {

        return company;
       // return new Company(cname,catchPhrase,bs);
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String toString() {
        checkNullValues();
        return "id=" + this.id + " \nname=" + this.name + " \nUsername="
                + this.username + "\nEmail=" + this.email + "\nAddress=" + this.address + "\nPhone=" + this.phone + "\nWebsite=" + this.website + "\nCompany=" + this.company;
    }

//this.id == null || this.id.equals(null) || this.id.equals("")
    public void checkNullValues() {
        if (StringUtils.isBlank(this.id)) {
            System.out.println("ID is null");
        }
        if (StringUtils.isBlank(this.name)) {
            System.out.println("Name is null");
        }
        if (StringUtils.isBlank(this.username)) {
            System.out.println("username is null");
        }
        if (StringUtils.isBlank(this.email)) {
            System.out.println("Email is null");
        }
       if (this.address==null) {
            System.out.println("Address is null");
        }
        if (StringUtils.isBlank(this.phone)) {
            System.out.println("phone is null");
        }
        if (StringUtils.isBlank(this.website)) {
            System.out.println("website is null");
        }
        if (this.company==null) {
            System.out.println("company is null");
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
        UserMain that = (UserMain) obj;
        if (!this.id.equals(that.id)) {
            System.out.println("id is not matching with expected id");
            return false;
        }
        if (!this.name.equals(that.name)){
            System.out.println("name is not matching with expected name");
            return false;
        }
        if (!this.username.equals(that.username)){
            System.out.println("Username is not matching with expected Username");
            return false;
        }
        if (!this.email.equals(that.email)){
            System.out.println("email is not matching with expected email");
            return false;
        }
        if (!this.address.equals(that.address)){
            System.out.println("address is not matching with expected address");
            return false;
        }
        return true;
    }
    public static void main(String a[]) {

       Gson gson = new Gson();

       String jsonString = "{\n" +
               "        'id': 1,\n" +
               "        'name': 'Leanne Graham',\n" +
               "        'username': 'Bret',\n" +
               "        'email': 'Sincere@april.biz',\n" +
               "       \n" +
               "        'phone': '1-770-736-8031 x56442',\n" +
               "        'website': 'hildegard.org'\n" +
               "    }";


        // convert to java class
        UserMain obj = gson.fromJson(jsonString, UserMain.class);
        System.out.println("OBJECT : " + obj);
        /*Type userListType = new TypeToken<ArrayList<UserMain>>(){}.getType();

        List<UserMain> userList = gson.fromJson(jsonString, userListType);
        System.out.println("OBJECT : " + userList);*/
    }
}
