import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] poem = new String[100];
        int i=0;
        String line = input.nextLine();
        while (!line.equals(""))
        {
            poem[i] = line;
            i++;
            line = input.nextLine();
        }
        for ( int j = 0; j < i; j++)
        {
            int padding = (50 - poem[j].length()) / 2;
            for (int z = 0; z < padding; z++)
            {
                System.out.print(" ");
            }
            System.out.println(poem[j]);
        }
    }
}
