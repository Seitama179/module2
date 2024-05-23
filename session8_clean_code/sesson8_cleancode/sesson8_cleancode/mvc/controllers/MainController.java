package sesson8_cleancode.mvc.controllers;

import sesson8_cleancode.mvc.models.Student;
import sesson8_cleancode.mvc.services.IStudentService;
import sesson8_cleancode.mvc.services.impl.StudentService;
import sesson8_cleancode.mvc.views.StudentView;

public class MainController {

    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        IStudentService studentService = new StudentService();
        int choice;
        Student student;
        boolean result;
        while (true) {
            choice = studentView.view();
            switch (choice) {
                case 1: {
                    student = studentView.viewAdd();
                    result = studentService.add(student);
                    studentView.viewMessage(result);
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    int code = studentView.inputCode();
                    student = studentService.findByCode(code);
                    if(student == null) {
                        studentView.displayMesseageNotFound();
                    } else {
                        boolean isConfirm()
                    }
                break;
                }
                case 4: {
                    Student[] students = studentService.getAll();
                    studentView.displayAllStudent(students);
                    break;
                }
                case 0:
                    return;
            }
            System.out.println();
        }
    }
}
