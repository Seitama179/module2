package session8_cleancode.mvc.repositories;

import session8_cleancode.mvc.models.Student;

import java.util.*;

public class StudentRepository {
//    private static Student[] students = new Student[100];
//    up casting
//    Generic
    private static List<Student> students = new LinkedList<>();

    static {
        students.add(new Student(1, "HaiTT", "Quảng Nam", "C1123G1"));
    }

    public void add(Student student) {
        students.add(student);
    }

    public List<Student> getAll() {
        List<Student> result = new ArrayList<>();
        Collections.copy(students, result);
        return result;
    }

    public Student findByCode(int code) {
        for (Student student : students) {
            if(student == null) {
                return null;
            }
            if (student.getCode() == code) {
                return student;
            }
        }
        return null;
    }

    public void removeStudent(Student student) {
        int size = students.size();
        for(int i = 0; i < size; i++) {
            if(students.get(i).getCode() == (student.getCode())) {
               for(int j = i ; j < size; j++) {
                   students.remove(i);
                   return;
               }

            }
        }

    }
}
