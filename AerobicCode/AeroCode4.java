public class AeroCode4
{
    public static void main(String[] args)
    {
        try
        {
            int[] arr = new int[5];
            arr[5] = 12/0;
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Out of bounds index exception");
        }
        finally
        {
            System.out.println("This will always print!");
        }
    }
}