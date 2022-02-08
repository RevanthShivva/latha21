package solid_p;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
interface Stu_Record{}
class Student_marks_display implements Stu_Record{

   public void display_marks(){
       System.out.println("Marks displayed");
   }
}
class Student_attendance implements Stu_Record{

    public void display_attendance(){
        System.out.println("Attendance displayed");
    }

}
class rec{
    public void show(Stu_Record str){
        if(str instanceof Student_marks_display){
            Student_marks_display studen1 = (Student_marks_display) str;
            studen1.display_marks();
        } else if(str instanceof Student_attendance){
            Student_attendance studen1 = (Student_attendance) str;
            studen1.display_attendance();
        }
    }
}
