import java.util.Scanner;

class ConditionalStatements
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0)
        {
            System.out.println("Positive number");
        }
        else if (number < 0)
        {
            System.out.println("Negative number");
        }
        else
        {
            System.out.println("Zero");
        }

        switch (number)
        {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            default:
                System.out.println("Other number");
        }

        input.close();
    }
}