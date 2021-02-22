package com.sakshi.sakshilearn;

import static org.junit.Assert.assertEquals;

import com.sakshi.sakshilearn.SakshilearnApplication;
import com.sakshi.sakshilearn.basic.BinarySearchImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SakshilearnApplication.class)
public class BinarySearchTest {

    // Get this bean from the context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {

        // call method on binarySearch
        int actualResult = binarySearch.binarySearch(new int[] {}, 5);

        // check if the value is correct
        assertEquals(3, actualResult);

    }

}