import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatenationOfStringsImpl {


    public String concat(String str1, String str2, String str3, String str4, String str5, String str6,
                         String str7) {

        String concatStrings = Stream.of(str1, str2, str3, str4, str5, str6, str7).reduce("", String::concat).toUpperCase();
        System.out.println(concatStrings);


        return concatStrings;


    }
}


