package org.example;
import org.example.config.Config;
import org.example.service.StudentService;
import org.example.service.StudentApplication;
import org.example.service.BasicStudentService;
import org.example.singleton.LazySingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//eager singleton already initialized
        LazySingleton lazySingleton = context.getBean(LazySingleton.class);
        StudentApplication app = context.getBean(StudentApplication.class);
        app.run();

    }
}
