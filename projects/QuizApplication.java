import java.util.Scanner;

class QuizApplication
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String[] questions =
        {
            "What is the capital of Bangladesh?",
            "Which language is used for Android development?",
            "What is 5 + 5?"
        };

        String[][] options =
        {
            {"1. Dhaka", "2. Chittagong", "3. Sylhet", "4. Rajshahi"},
            {"1. Java", "2. HTML", "3. CSS", "4. SQL"},
            {"1. 8", "2. 10", "3. 12", "4. 15"}
        };

        int[] answers = {1, 1, 2};

        int score = 0;

        for (int i = 0; i < questions.length; i++)
        {
            System.out.println("\n" + questions[i]);

            for (String option : options[i])
            {
                System.out.println(option);
            }

            System.out.print("Enter answer: ");
            int answer = input.nextInt();

            if (answer == answers[i])
            {
                System.out.println("Correct!");
                score++;
            }
            else
            {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\nYour Score: " + score + "/" + questions.length);

        input.close();
    }
}