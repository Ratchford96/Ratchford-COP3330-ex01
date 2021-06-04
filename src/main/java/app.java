// This show that our program uses scanner
import java.util.Scanner;
public class app {
    public static void main(String[] args)
    {
        // create a scanner
        Scanner input = new Scanner(System.in);
        //This create our input
        System.out.print("What is your name?");
        String name = input.nextLine();

        String outString = "Hello " + name + ", nice to meet you!";
        // prints the output string
        System.out.println(outString);



    }
}
