package org.example.singleton;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

public class LazySingleton {
    public LazySingleton() {
        System.out.println("Lazy Singleton");
    }
}
