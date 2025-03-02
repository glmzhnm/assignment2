package org.example.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentApplication {
    private final StudentService basicStudentService;
    private final StudentService advancedStudentService;

    @Autowired
    public StudentApplication(@Qualifier("basicStudentService") StudentService basicStudentService,
                              @Qualifier("advancedStudentService") StudentService advancedStudentService) {
        this.basicStudentService = basicStudentService;
        this.advancedStudentService = advancedStudentService;
    }

    public void run() {
        System.out.println("Basic Service Students: " + basicStudentService.getAllStudents());
        System.out.println("Advanced Service Students: " + advancedStudentService.getAllStudents());
    }
}
