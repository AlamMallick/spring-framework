
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterisedCalculatorTest {

   @ParameterizedTest
   @ValueSource(strings = {"ABC","abc"})
    void testCase01(String args){
       Assertions.assertTrue(!args.isEmpty());
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void testCase01(Integer args){
        Assertions.assertEquals(0,args%3);
    }
}
