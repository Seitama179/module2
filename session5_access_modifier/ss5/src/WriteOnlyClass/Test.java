package WriteOnlyClass;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Ngoc");
        s1.setClasses("C03");

        System.out.println("Name: " + s1.getName());
        System.out.println("Class: " + s1.getClasses());
    }
}
