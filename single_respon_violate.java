package solid_p;
import java.util.*;
 class College{
    private String collegeName ;
    private String city;

    static int b;
    static ArrayList<String> f = new ArrayList<String>();
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
    public void  accounts(int salaries,int fees,int maintanance_charges){
        b = fees -(salaries+maintanance_charges);
    }
    public void canteen(ArrayList<String> food)
    {
         f = food;
    }
}
class student{
     private int roll_no;
     private String name;
     public  Map<String, Integer> hm = new HashMap<String, Integer>();
     public ArrayList<String> at = new ArrayList<>();

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
