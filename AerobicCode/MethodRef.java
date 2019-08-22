import java.util.Arrays;
import java.util.List;

public class MethodRef
{
    public static void main(String[] args)
    {
        List <String> myArray = Arrays.asList("a","b","c","d","e","f","g","h","i","j");

        long start = System.currentTimeMillis();
        myArray.stream().forEach(x ->  System.out.print(x));
        long end = System.currentTimeMillis();
        System.out.println(" time " +(end-start));

        long start2 = System.currentTimeMillis();
        myArray.stream().forEach(System.out::print);
        long end2 = System.currentTimeMillis();
        System.out.println(" time " + (end2-start2));
    }
}