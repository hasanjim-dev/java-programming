import java.util.Scanner;

class TicTacToe
{
    static char[][] board =
    {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };

    static void displayBoard()
    {
        System.out.println();

        for (int i = 0; i < 3; i++)
        {
            System.out.println(
                " " + board[i][0] + " | " +
                board[i][1] + " | " +
                board[i][2]
            );

            if (i < 2)
            {
                System.out.println("---+---+---");
            }
        }

        System.out.println();
    }

    static boolean checkWin(char player)
    {
        for (int i = 0; i < 3; i++)
        {
            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player)
            {
                return true;
            }

            if (board[0][i] == player &&
                board[1][i] == player &&
                board[2][i] == player)
            {
                return true;
            }
        }

        return (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player)
                ||
                (board[0][2] == player &&
                 board[1][1] == player &&
                 board[2][0] == player);
    }

    static boolean isDraw()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (board[i][j] != 'X' && board[i][j] != 'O')
                {
                    return false;
                }
            }
        }

        return true;
    }

    static void makeMove(int position, char player)
    {
        int row = (position - 1) / 3;
        int column = (position - 1) % 3;

        board[row][column] = player;
    }

    static boolean validMove(int position)
    {
        if (position < 1 || position > 9)
        {
            return false;
        }

        int row = (position - 1) / 3;
        int column = (position - 1) % 3;

        return board[row][column] != 'X' &&
               board[row][column] != 'O';
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        char player = 'X';

        while (true)
        {
            displayBoard();

            System.out.print("Player " + player + ", choose position: ");
            int position = input.nextInt();

            if (!validMove(position))
            {
                System.out.println("Invalid move.");
                continue;
            }

            makeMove(position, player);

            if (checkWin(player))
            {
                displayBoard();

                System.out.println("Player " + player + " wins!");

                break;
            }

            if (isDraw())
            {
                displayBoard();

                System.out.println("Game Draw!");

                break;
            }

            player = player == 'X' ? 'O' : 'X';
        }

        input.close();
    }
}