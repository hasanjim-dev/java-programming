class LoopControlStatements
{
    public static void main(String[] args)
    {
        System.out.println("Continue:");

        for (int i = 1; i <= 10; i++)
        {
            if (i == 5)
            {
                continue;
            }

            System.out.print(i + " ");
        }

        System.out.println("\n\nBreak:");

        for (int i = 1; i <= 10; i++)
        {
            if (i == 6)
            {
                break;
            }

            System.out.print(i + " ");
        }
    }
}