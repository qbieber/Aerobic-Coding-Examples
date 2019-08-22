class Object1 implements Cloneable
{
    int num;
    String word;

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class AeroCode6
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Object1 obj1 = new Object1();
        
        obj1.num = 5;
        obj1.word = "Hello";

        Object1 obj2 = (Object1)obj1.clone();

        //obj2.num = 8;
        //obj2.word = "Goodbye";

        System.out.println(obj1.num);
        System.out.println(obj1.word);
        System.out.println(" ");
        System.out.println(obj2.num);
        System.out.println(obj2.word);



    }
}