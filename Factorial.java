import java.util.Scanner;
public class Factorial 
{
    public static void main(String[]args)
    {
        int n, f;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a no:");
        n = input.nextInt();

        f = fact(n);
        System.out.println(f);

    }    

    static int fact(int n)
    {
        if(n<=1)
        {
            return 1;

        } else 
            return n * fact(n-1);
    }
}
