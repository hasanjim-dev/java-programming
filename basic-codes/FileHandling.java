import java.io.*;

class FileHandling
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter writer = new FileWriter("sample.txt");

            writer.write("This is a Java file handling example.");

            writer.close();

            FileReader reader = new FileReader("sample.txt");

            int character;

            System.out.println("File Content:");

            while ((character = reader.read()) != -1)
            {
                System.out.print((char) character);
            }

            reader.close();
        }
        catch (IOException e)
        {
            System.out.println("File error occurred.");
        }
    }
}