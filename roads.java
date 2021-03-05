import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class roads
{
  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);
    int choice = 1;

  while (choice == 1)
  {
    System.out.print("Enter region: "); // region code as on website
    String region = input.nextLine();
    System.out.print("Enter route:  "); // same as summer 2020 code
    String road = input.nextLine();

    try
    {
      File obj = new File(region + "/" + road + ".txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    }
    catch (FileNotFoundException e) 
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    System.out.println("");
    System.out.print("Enter 1 to search again: ");
    choice = input.nextInt();
    System.out.println("-----------------------------------------------");

    input.nextLine(); // absorb enter key - fix for error if repeating
    }
  }
}
