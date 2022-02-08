package solidPrinciples;

interface StudentMarks{
    public void display_marks();
}
interface Marks_change{
    public void modify_marks();
    public void addMarks();
}
interface Grades{
    public void calculate_grades();
}
class HOD implements StudentMarks,Marks_change,Grades {

    @Override
    public void display_marks() {
        System.out.println("Marks Displayed");
    }

    @Override
    public void modify_marks() {
        System.out.println("Modified marks");
    }

    @Override
    public void calculate_grades() {
        System.out.println("Calculated grades");
    }

    @Override
    public void addMarks() {
        System.out.println("Added marks");
    }
}
class stu implements StudentMarks {

    @Override
    public void display_marks() {
        System.out.println("Student marks displayed");
    }
}
