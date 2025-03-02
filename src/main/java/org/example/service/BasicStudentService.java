package org.example.service;
import org.example.students.Student;
import org.example.repo.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import java.util.List;
@Service
@Primary
public class BasicStudentService implements StudentService {
    private final StudentRepository studentRepository;

    public BasicStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
