package test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** 
* MyMath Tester. 
* 
* @author <Authors name> 
* @since <pre>Aug 18, 2022</pre> 
* @version 1.0 
*/ 
public class MyMathTest { 

    //MyMath.sum      initially call it with a simple imput, like 3 nums, and it will return 6
    @Test
    public void sum_with3numbers() {
        int[] numbers = {1, 2, 3};
        int expected = 6;
        int actual = MyMath.sum(numbers);
        assertEquals(expected, actual);

    }


@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sum(int[] numbers) 
* 
*/ 
@Test
public void testSum() throws Exception { 
//absence of failure is success
//    fail("Not yet implemented");

} 


} 
