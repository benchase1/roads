import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ri {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter route: ");
    String id = input.nextLine();

    if (id.equals("us1")) {
    try {
      File obj = new File("ri/us1.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("us1bus")) {
    try {
      File obj = new File("ri/us1bus.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri1a")) {
      System.out.println("ri1a-westerly - 8.80 miles");
      System.out.println("ri1a-charlestown - 6.77 miles");
      System.out.println("ri1a-south-kingstown - 16.50 miles");
      System.out.println("ri1a-warwick - 15.20 miles");
    }
    else if (id.equals("ri1a-westerly")) {
    try {
      File obj = new File("ri/ri1a-westerly.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri1a-charlestown")) {
    try {
      File obj = new File("ri/ri1a-charlestown.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri1a-south-kingstown")) {
    try {
      File obj = new File("ri/ri1a-south-kingstown.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri1a-warwick")) {
    try {
      File obj = new File("ri/ri1a-warwick.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri2")) {
    try {
      File obj = new File("ri/ri2.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri3")) {
    try {
      File obj = new File("ri/ri3.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri4")) {
    try {
      File obj = new File("ri/ri4.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri5")) {
    try {
      File obj = new File("ri/ri5.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("us6")) {
    try {
      File obj = new File("ri/us6.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("us6bus")) {
    try {
      File obj = new File("ri/us6bus.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("us6a")) {
    try {
      File obj = new File("ri/us6a.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri7")) {
    try {
      File obj = new File("ri/ri7.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri10")) {
    try {
      File obj = new File("ri/ri10.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri12")) {
    try {
      File obj = new File("ri/ri12.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri14")) {
    try {
      File obj = new File("ri/ri14.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri15")) {
    try {
      File obj = new File("ri/ri15.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri24")) {
    try {
      File obj = new File("ri/ri24.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri33")) {
    try {
      File obj = new File("ri/ri33.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri37")) {
    try {
      File obj = new File("ri/ri37.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("us44")) {
    try {
      File obj = new File("ri/us44.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri51")) {
    try {
      File obj = new File("ri/ri51.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri77")) {
    try {
      File obj = new File("ri/ri77.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri78")) {
    try {
      File obj = new File("ri/ri78.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri81")) {
    try {
      File obj = new File("ri/ri81.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri91")) {
    try {
      File obj = new File("ri/ri91.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri94")) {
    try {
      File obj = new File("ri/ri94.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("i95")) {
    try {
      File obj = new File("ri/i95.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri96")) {
    try {
      File obj = new File("ri/ri96.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri98")) {
    try {
      File obj = new File("ri/ri98.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri99")) {
    try {
      File obj = new File("ri/ri99.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri100")) {
    try {
      File obj = new File("ri/ri100.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri101")) {
    try {
      File obj = new File("ri/ri101.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri102")) {
    try {
      File obj = new File("ri/ri102.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri103")) {
    try {
      File obj = new File("ri/ri103.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri103a")) {
    try {
      File obj = new File("ri/ri103a.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri104")) {
    try {
      File obj = new File("ri/ri104.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri107")) {
    try {
      File obj = new File("ri/ri107.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri108")) {
    try {
      File obj = new File("ri/ri108.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri110")) {
    try {
      File obj = new File("ri/ri110.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri112")) {
    try {
      File obj = new File("ri/ri112.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri113")) {
    try {
      File obj = new File("ri/ri113.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri114")) {
    try {
      File obj = new File("ri/ri114.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri114a")) {
      System.out.println("ri114a-east-providence-s - 0.10 miles");
      System.out.println("ri114a-east-providence-n - 0.30 miles");
    }
    else if (id.equals("ri114a-east-providence-s")) {
    try {
      File obj = new File("ri/ri114a-east-providence-s.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri114a-east-providence-n")) {
    try {
      File obj = new File("ri/ri114a-east-providence-n.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri115")) {
    try {
      File obj = new File("ri/ri115.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri116")) {
    try {
      File obj = new File("ri/ri116.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri117")) {
    try {
      File obj = new File("ri/ri117.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri118")) {
    try {
      File obj = new File("ri/ri118.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri120")) {
    try {
      File obj = new File("ri/ri120.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri121")) {
    try {
      File obj = new File("ri/ri121.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri122")) {
    try {
      File obj = new File("ri/ri122.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri123")) {
    try {
      File obj = new File("ri/ri123.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri126")) {
    try {
      File obj = new File("ri/ri126.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri128")) {
    try {
      File obj = new File("ri/ri128.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri136")) {
    try {
      File obj = new File("ri/ri136.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri138")) {
    try {
      File obj = new File("ri/ri138.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri138a")) {
    try {
      File obj = new File("ri/ri138a.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri146")) {
    try {
      File obj = new File("ri/ri146.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri146a")) {
    try {
      File obj = new File("ri/ri146a.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri152")) {
    try {
      File obj = new File("ri/ri152.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri165")) {
    try {
      File obj = new File("ri/ri165.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri177")) {
    try {
      File obj = new File("ri/ri177.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri179")) {
    try {
      File obj = new File("ri/ri179.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri214")) {
    try {
      File obj = new File("ri/ri214.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri216")) {
    try {
      File obj = new File("ri/ri216.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri238")) {
    try {
      File obj = new File("ri/ri238.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri246")) {
    try {
      File obj = new File("ri/ri246.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri401")) {
    try {
      File obj = new File("ri/ri401.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri402")) {
    try {
      File obj = new File("ri/ri402.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else if (id.equals("ri403")) {
    try {
      File obj = new File("ri/ri403.txt");
      Scanner read = new Scanner(obj);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } }
    else {
        System.out.println("Not a valid route.");
    }
  }
}
