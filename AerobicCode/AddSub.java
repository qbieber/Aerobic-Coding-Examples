import java.util.Scanner;

public class AddSub
{
    public static void main(String[] args)
    {
        Scanner usrin = new Scanner(System.in);

        System.out.print("Please enter two numbers that added, subtracted, multiplied, and divided(remainder)");
        System.out.print("\nPlease enter the first number: ");
        int num1 = usrin.nextInt();
        usrin.nextLine();

        System.out.print("\nPlease enter the second number: ");
        int num2 = usrin.nextInt();
        usrin.nextLine();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int remain = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + sub);
        System.out.println(num1 + " * " + num2 + " = " + mult);
        System.out.println(num1 + " % " + num2 + " = " + remain);

    }
}