package org.example.config;

import org.example.singleton.EagerSingleton;
import org.example.singleton.LazySingleton;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("org.example")
public class Config {
    @Bean
    public EagerSingleton EagerSingleton() {
        return new EagerSingleton();
    }

    @Bean
    @Lazy
    public LazySingleton lazySingleton() {
        return new LazySingleton();
    }
}
