package org.example.repo;
import org.example.students.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepository {
    private final List<Student> students = new ArrayList<>();

    public StudentRepository() {
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
    }

    public List<Student> findAll() {
        return students;
    }
}
