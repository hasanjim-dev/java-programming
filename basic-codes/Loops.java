class Loops
{
    public static void main(String[] args)
    {
        System.out.println("For Loop:");

        for (int i = 1; i <= 5; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println("\n\nWhile Loop:");

        int i = 1;

        while (i <= 5)
        {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n\nDo While Loop:");

        i = 1;

        do
        {
            System.out.print(i + " ");
            i++;
        }
        while (i <= 5);
    }
}