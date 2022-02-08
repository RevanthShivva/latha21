package solid_p;

interface College_Website {
    public void login();

    public void modify_attendance();

}
class TeacherAuthen implements College_Website{

    @Override
    public void login() {
        System.out.println("Teacher have logged in");
    }

    @Override
    public void modify_attendance() {
        System.out.println("Modified Attendance");
    }
}
class student_authen implements College_Website{

    @Override
    public void login() {
        System.out.println("Student have logged in");
    }

    @Override
    public void modify_attendance() {
        throw new UnsupportedOperationException("This is not supported");
    }
}
