package POJO.User;

import Utility.CommonFields;
import org.apache.commons.lang3.StringUtils;

public class Company {

    String name;
    String catchPhrase;
    String bs;

    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    @Override
    public String toString() {

        checkNullValues(this);
        return "Company{" +
                "name='" + name + '\'' +
                ", catchPhrase='" + catchPhrase + '\'' +
                ", bs='" + bs + '\'' +
                '}';
    }

    public void checkNullValues(Company c){
        if(c==null){
            System.out.println("Company object is null");
        }

        if (StringUtils.isBlank(this.name)) {
            System.out.println("Company-> name is null");
        }

        if (StringUtils.isBlank(this.catchPhrase)) {
            System.out.println("Company-> catchPhrase is null");
        }

        if (StringUtils.isBlank(this.bs)) {
            System.out.println("Company-> bs is null");
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
        Company that = (Company) obj;
        if (!this.name.equals(that.name)) {
            System.out.println("company name is not matching with expected");
            return false;
        }

        if (!this.catchPhrase.equals(that.catchPhrase)) {
            System.out.println("catchPhrase is not matching with expected catchPhrase");
            return false;
        }

        if (!this.bs.equals(that.bs)) {
            System.out.println("bs is not matching with expected bs");
            return false;
        }
        return true;
    }
}
