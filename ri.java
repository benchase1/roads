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
    else if (id.equals("us1a")) {
    try {
      File obj = new File("ri/us1a.txt");
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
    try {
      File obj = new File("ri/ri1a.txt");
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
    else {
        System.out.println("Not a valid route.");
    }
  } 
}