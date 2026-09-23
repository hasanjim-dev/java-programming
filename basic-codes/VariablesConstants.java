class VariablesConstants
{
    public static void main(String[] args)
    {
        int age = 20;
        double marks = 85.5;
        final double PI = 3.14159;

        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("PI: " + PI);

        age = 21;

        System.out.println("Updated Age: " + age);
    }
}