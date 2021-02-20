package com.sakshi.sakshilearn;

import com.sakshi.ComponentScan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.sakshi.ComponentScan")
public class ComponentScanApp {

    private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApp.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                SpringApplication.run(ComponentScanApp.class, args);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO);
    }
}
