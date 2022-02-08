package solid_p;
interface StudentMarks{
    public void display_marks();
    public void modify_marks();
    public void calculate_grades();
    public void addMarks();
}
class HOD implements  StudentMarks{

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
class stu implements StudentMarks{

    @Override
    public void display_marks() {
        System.out.println("Student marks displayed");
    }

    @Override
    public void modify_marks() {
        throw new UnsupportedOperationException("This is not supported");
    }

    @Override
    public void calculate_grades() {
        throw new UnsupportedOperationException("This is not supported");
    }

    @Override
    public void addMarks() {
        throw new UnsupportedOperationException("This is not supported");
    }
}

