import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    System.out.println("Enter Weight in Kilograms:");
    
    Scanner in = new Scanner(System.in);
    double Weight = in.nextDouble();
    
    System.out.println("Enter Height in Meters:");
    
    Scanner in2 = new Scanner(System.in);
    double height = in2.nextDouble();
    
    System.out.println(Weight/(height*height));
  }
}
