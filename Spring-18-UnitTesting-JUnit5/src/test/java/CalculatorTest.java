import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All");
    }

    @Test
    void testCase01(){
 fail("Not implemented yet ");
    }

    @Test
    void testCase02(){
        assertThrows(IllegalArgumentException.class,()->Calculator.add2(5,2));

    }

    @Test
    void testCase03(){
        Calculator c1=new Calculator();
        Calculator c2=c1;
       assertSame(c1,c2);

    }

    @Test
    void testCase04(){
        String nullString=null;
        String notNullString="Cydeo";
        assertNull(nullString);
        assertNotNull(notNullString);

    }

    @Test
    void testCase05(){
        assertArrayEquals(new int []{1,2,3},new int[]{1,2,3});

    }





    @Test
   void add()
    {
        int actual=Calculator.add(2,3);
        assertEquals(5,actual);
    }


}