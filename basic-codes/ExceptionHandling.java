class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println(result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero.");
        }
        finally
        {
            System.out.println("Finally block executed.");
        }

        try
        {
            checkAge(15);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age) throws Exception
    {
        if (age < 18)
        {
            throw new Exception("Age must be 18 or above.");
        }

        System.out.println("Eligible.");
    }
}