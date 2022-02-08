package solidPrinciples;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        College college = new College();
        college.setCollegeName("Vasavi College");
        college.setCity("Hyderabad");
        accounts acc = new accounts();
        acc.accounts(50000,100000,20000);
        canteen canteen1 = new canteen();
        ArrayList<String> f = new ArrayList<String>();
        f.add("Meals");
        f.add("Water Bottle");
        canteen1.canteen(f);
        Student_marks_display studentMarksDisplay = new Student_marks_display();
        Student_attendance studentAttendance = new Student_attendance();
        rec re = new rec();
        re.show(studentMarksDisplay);
        re.show(studentAttendance);
        TeacherAuthen teacherAuthen = new TeacherAuthen();
        teacherAuthen.login();
        teacherAuthen.modify_attendance();
        student_authen studentAuthen = new student_authen();
        studentAuthen.login();
        HOD hod  = new HOD();
        hod.display_marks();
        hod.modify_marks();
        hod.calculate_grades();
        stu st1 = new stu();
        st1.display_marks();
        payment p = new payment();
        mysqlconnect1 m = new mysqlconnect1();
        p.connct(m);
        m.connectwiddata();


    }
}
