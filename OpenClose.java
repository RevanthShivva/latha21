package solidPrinciples;

interface Stu_Record{
    public void display();
}
class Student_marks_display implements Stu_Record {

    @Override
    public void display() {
        System.out.println("Marks displayed");
    }
}
class Student_attendance implements Stu_Record {

    @Override
    public void display() {
        System.out.println("Attendance displayed");
    }
}
class rec{
    public void show(Stu_Record str){
        str.display();
    }
}
