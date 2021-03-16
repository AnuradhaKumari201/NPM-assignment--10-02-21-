import org.junit.Test;

import org.junit.jupiter.api.Assertions;

public class ConcatenationOfStringsImplTest {


    @Test
    public void testStringsNotEquals(){
         ConcatenationOfStringsImpl concatinationOfStringsImpl =  new ConcatenationOfStringsImpl();
        String sevenStrings = "THISLAMBDAHASTOOMANYSTRINGSARGUMENTS";
        String sevenStrings2 = concatinationOfStringsImpl.concat("This", "lambda", "has", "too", "many", "strings","arguments");
        Assertions.assertEquals(sevenStrings,sevenStrings2);

    }


    @Test
    public void testStringsLengthEquals(){
        ConcatenationOfStringsImpl concatinationOfStringsImpl = new ConcatenationOfStringsImpl();
         String expected= "This lambda has too many strings arguments";
       // String expected = "thislembdahastoomanystringsarguments";
        String result = concatinationOfStringsImpl.concat("This", "lambda", "has", "too", "many", "strings","arguments");
       Assertions.assertNotEquals(expected,result);
    }
}