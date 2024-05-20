package demo;

public class Student extends Person {
    public static void main(String[] args) {
        Student student = new Student();
        student.moveCompany();
    }
    @Override
    public void moveCompany() {
        System.out.println("Hoc sinh");
    }
}
