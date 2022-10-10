import org.assertj.core.api.Fail;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    @Test
    void testPass(){
        //success
        assertEquals(1,1);
    }

    @Test
    void testFail(){
        //fail
        assertEquals(1,1);
    }


    @Test
    void testFail2(){
        //fail
        assertEquals(1,1);
    }







}
