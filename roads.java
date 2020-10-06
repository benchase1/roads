import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class roads {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter region: ");
    String region = input.nextLine();
    System.out.print("Enter route: ");
    String road = input.nextLine();

    try {
      File obj = new File(region + "/" + road + ".txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
}
