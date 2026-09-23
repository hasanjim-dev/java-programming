class Operators
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 3;

        System.out.println("Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("\nRelational Operators");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        System.out.println("\nLogical Operators");
        System.out.println((a > 5 && b < 5));
        System.out.println((a > 5 || b > 5));
        System.out.println(!(a == b));

        System.out.println("\nAssignment Operators");
        a += 5;
        System.out.println("a += 5: " + a);

        a -= 2;
        System.out.println("a -= 2: " + a);

        System.out.println("\nBitwise Operators");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));

        System.out.println("\nTernary Operator");
        System.out.println(a > b ? "a is greater" : "b is greater");
    }
}