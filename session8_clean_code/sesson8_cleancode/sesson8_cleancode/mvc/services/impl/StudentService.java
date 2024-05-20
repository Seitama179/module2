package sesson8_cleancode.mvc.services.impl;

import sesson8_cleancode.mvc.models.Student;
import sesson8_cleancode.mvc.repositories.StudentRepository;
import sesson8_cleancode.mvc.services.IStudentService;

public class StudentService implements IStudentService {
    private StudentRepository studentRepository = new StudentRepository();
    @Override
    public boolean add(Student student) {
//        Kiểm tra dữ liệu
        if(student.getName().equals("")) {
            return false;
        }
        if(student.getCode() <0 || student.getCode()>1000000) {
            return false;
        }
        studentRepository.add(student);
        return true;
    }
}
