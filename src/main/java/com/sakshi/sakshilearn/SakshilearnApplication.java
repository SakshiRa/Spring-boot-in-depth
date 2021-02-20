package com.sakshi.sakshilearn;

import com.sakshi.sakshilearn.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SakshilearnApplication {

    public static void main(String[] args) {

        //BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

        ApplicationContext applicationContext =
                SpringApplication.run(SakshilearnApplication.class, args);

        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);


        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);

        System.out.println(result);
        System.out.println(binarySearch);
        System.out.println(binarySearch1);

    }
}
