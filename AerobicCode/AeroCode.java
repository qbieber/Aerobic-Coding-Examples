import java.util.Scanner;

public class AeroCode
{
    public static void main(String[] agrs)
    {
        Scanner usrin = new Scanner(System.in);
        int vowelCount = 0;
        String vowels = "";

        while (true)
        {
            System.out.println("Please type any sentence of you choosing: ");
            String sent = usrin.nextLine().toLowerCase();
            for (char i: sent.toCharArray())
            {
                if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
                {
                    vowelCount += 1;
                    vowels += i;
                }
            }
            if(sent.equalsIgnoreCase("Stop")) break;
            System.out.println("Your statement: " + sent);
            System.out.println("# of vowels: " + vowelCount);
            System.out.println("Your vowels: " + vowels.toUpperCase());

        }
        usrin.close();
    }
}