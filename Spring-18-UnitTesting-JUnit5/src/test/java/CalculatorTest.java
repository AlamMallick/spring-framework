import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testCase01(){
 fail("Not implemented yet ");
    }

    @Test
    void testCase02(){
        fail("Not implemented yet ");

    }

    @Test
    void testCase03(){
        fail("Not implemented yet ");

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