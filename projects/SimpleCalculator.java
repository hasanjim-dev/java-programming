import java.util.Scanner;

class SimpleCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter operator: ");
        char operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        double result;

        switch (operator)
        {
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (number2 == 0)
                {
                    System.out.println("Cannot divide by zero.");
                }
                else
                {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid operator.");
        }

        input.close();
    }
}