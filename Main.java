package solid_p;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        College college = new College();
        college.setCollegeName("Vasavi College");
        college.setCity("Hyderabad");
        college.accounts(50000,100000, 20000);
        ArrayList<String> f = new ArrayList<String>();
        f.add("Meals");
        f.add("Water Bottle");
        college.canteen(f);
        System.out.println("College name : " + college.getCollegeName() + " located in " + college.getCity() + " has a profit of" + College.b);
        Student_marks_display s = new Student_marks_display();
        Student_attendance st = new Student_attendance();
        rec re = new rec();
        re.show(s);
        re.show(st);
        TeacherAuthen teacherAuthen = new TeacherAuthen();
        teacherAuthen.login();
        teacherAuthen.modify_attendance();
        student_authen studentAuthen = new student_authen();
        studentAuthen.login();
        HOD hod  = new HOD();
        hod.modify_marks();
        hod.calculate_grades();
        stu st1 = new stu();
        st1.display_marks();
        st1.modify_marks();
        st1.calculate_grades();
        studentAuthen.modify_attendance();
        CollegeDatabase p = new CollegeDatabase();
        mysqlconnect m = new mysqlconnect();
        p.connect(m);
        m.connectionwiddata();
    }
}
