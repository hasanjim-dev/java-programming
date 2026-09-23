import java.util.Scanner;

class CurrencyConverter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. USD to BDT");
        System.out.println("2. BDT to USD");

        System.out.print("Choose option: ");
        int choice = input.nextInt();

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        double rate = 120.0;

        if (choice == 1)
        {
            double result = amount * rate;

            System.out.println("BDT: " + result);
        }
        else if (choice == 2)
        {
            double result = amount / rate;

            System.out.println("USD: " + result);
        }
        else
        {
            System.out.println("Invalid option.");
        }

        input.close();
    }
}