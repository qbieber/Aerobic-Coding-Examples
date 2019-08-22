import java.util.Scanner;

public class AeroCode5
{
    public void assertion(int age)
    {
        assert age >= 21 : "The person is underage, therefore can't drink alcohol";
    }
    public static void main(String[] args)
    {
        AeroCode5 work = new AeroCode5();
        Scanner usrin = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = usrin.nextInt();

        work.assertion(age);
        System.out.println("The person is " + age + " years old and can drink alcohol");

        usrin.close();
    }
}