package solidPrinciples;

import java.util.ArrayList;

class College {
    private String collegeName ;
    private String city;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
class accounts extends College {
    static int b;
    public void  accounts(int salaries,int fees,int maintanance_charges){
        b = fees -(salaries+maintanance_charges);
    }

}
class canteen extends College {
    static ArrayList<String> f = new ArrayList<String>();
    public void canteen(ArrayList<String> food){
        f = food;

    }
}
