import java.util.*;

public class AeroCode3
{
    public static void main(String[] args)
    {
        TreeMap<String, Integer> food = new TreeMap<String, Integer>();
        food.put("Fruit", 1);
        food.put("Meat", 2);
        food.put("Veggies", 3);
        
        System.out.println("Does Fruit exist?");
        if (food.containsKey("Fruit"))
        {
            System.out.println("Yes it does! The Value is: " + food.get("Fruit"));
        }
        else
        {
            System.out.println("No it does not! Try again");
        }

        System.out.println("Does Bread exist?");
        if (food.containsKey("Bread"))
        {
            System.out.println("Yes it does! The Value is: " + food.get("Bread"));
        }
        else
        {
            System.out.println("No it does not! Try again");
        }

    }
}