import org.junit.*;

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
    public void sum_with1number() {
        int[] numbers = { 2};
        int expected = 2;
        int actual = MyMath.sum(numbers);

        assertEquals(expected, actual);

    }


    MyMath myMath = new MyMath();


@Before
public void before() throws Exception {
    System.out.println("before");
}

    @Test
    public void sum_with3numbers() {
        int[] numbers = {1, 2, 3};
        int expected = 6;
        int actual = MyMath.sum(numbers);

        assertEquals(expected, actual);

    }


@After
public void after() throws Exception {
    System.out.println("after");
    //cleanup goes here
}

@BeforeClass
public static void beforeClass() throws Exception {
    System.out.println("beforeClass");
    //establish a connection to the database, init some data, etc
}

@AfterClass
public static void afterClass() throws Exception {
    System.out.println("afterClass");
    // close the connection to the database, etc
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
