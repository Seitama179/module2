package Demo1;

public class Student1 extends Person{
    public Student1(int id, String name) {
        super(id, name);
    }
    public Student1() {

    }

    public static void main(String[] args) {
        Student1 student1 = new Student1(1, "Ngoc");
        System.out.println(student1.getId());
    }
}
