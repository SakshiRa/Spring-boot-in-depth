package com.sakshi;

import com.sakshi.sakshilearn.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
@PropertySource("classpath:app.properties")
public class properiesApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(properiesApp.class);

        SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

        System.out.println(service);
    }
}
