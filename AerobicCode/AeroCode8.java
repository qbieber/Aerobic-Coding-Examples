import java.util.Arrays;
import java.util.stream.Collectors;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

@FunctionalInterface
interface reverseWord
{
    public String rword(String sent);
}

public class AeroCode8
{
    public static void main(String[] args)
    {
        reverseWord backwards = (String sentence) -> {return Arrays.stream(sentence.split(" "))
            .map(str -> new StringBuilder(str).reverse().toString()).collect(Collectors.joining(" "));};
        System.out.println();
    }
}