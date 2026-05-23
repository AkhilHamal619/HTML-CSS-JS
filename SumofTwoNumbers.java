public class SumofTwoNumbers
{
    public static void main(String[]args)
    {
        if(args.length<2)
        {
            System.out.println("Usage: java SumofTwoNumbers <num1> <num2>");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        double sum = num1 + num2;
  System.out.println(sum);
  

    }
}