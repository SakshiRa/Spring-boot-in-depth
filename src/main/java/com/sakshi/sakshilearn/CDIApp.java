package com.sakshi.sakshilearn;

import com.sakshi.sakshilearn.CDI.SomeCDIBuisness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CDIApp {

    private static Logger LOGGER =
            LoggerFactory.getLogger(CDIApp.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(CDIApp.class, args);

        SomeCDIBuisness someCDIBuisness =
                applicationContext.getBean(SomeCDIBuisness.class);

        LOGGER.info("{} dao-{}",  someCDIBuisness, someCDIBuisness.getSomeCDIDAO());

    }

}
