public class Main
{
    public static void main(String[] args) {
        for (int a = 0; a <= 30; a++) {
            System.out.printf("%3d  |", a);
        }
        System.out.println("\n");

        for (int a = 30; a >= 0; a--) {
            System.out.printf("%3d  |", a);
        }
        System.out.println("\n");

        for (int a = 0; a <= 18; a += 3) {
            System.out.printf("%3d  |", a);
        }
        System.out.println("\n");

        for (int a = 10; a >= 0; a -= 2) {
            System.out.printf("%3d  |", a);
        }
        System.out.println("\n");

        for (int a = 0; a < 5; a++)
        {
            for (int b = 0; b <= a; b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int a = 5; a > 0; a--)
        {
            for (int b = 1; b <= a; b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int a = 5; a > 0; a--)
        {
            for (int b = 1; b <= 5; b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


    }
}