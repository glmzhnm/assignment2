package org.example.service;
import org.example.students.Student;
import org.example.repo.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@Service
public class AdvancedStudentService implements StudentService {
    private final StudentRepository studentRepository;

    public AdvancedStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        students.add(new Student(3, "Charlie"));
        return students;
    }
}
