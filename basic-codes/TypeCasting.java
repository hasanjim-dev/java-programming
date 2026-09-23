class TypeCasting
{
    public static void main(String[] args)
    {
        int number = 10;

        double decimal = number;

        System.out.println("Widening Casting: " + decimal);

        double value = 25.75;

        int converted = (int) value;

        System.out.println("Narrowing Casting: " + converted);
    }
}