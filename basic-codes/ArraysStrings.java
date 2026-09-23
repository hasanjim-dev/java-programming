class ArraysStrings
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50};

        int[][] matrix =
        {
            {1, 2, 3},
            {4, 5, 6}
        };

        String name = "Hasan Jim";

        System.out.println("1D Array:");

        for (int number : numbers)
        {
            System.out.print(number + " ");
        }

        System.out.println("\n\n2D Array:");

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("\nString: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
    }
}