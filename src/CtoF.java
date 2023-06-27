import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double Celsius;
        double Farenheit;
        String Trash;
        boolean done = false;
        do
        {
            System.out.print("Enter the temperature in Celsius :");
            if(in.hasNextDouble())
            {
                Celsius = in.nextDouble();
                in.nextLine();
                Farenheit = 32 +((1.8) * Celsius);
                System.out.println("The temperature " + Celsius + " C is " + Farenheit + " F");
                done = true;
            }
            else {
                Trash = in.nextLine();
                System.out.println("\nyour value entered was :" + Trash);
                System.out.println("You have an invalid entry");
            }
        }while (!done);
    }

}
