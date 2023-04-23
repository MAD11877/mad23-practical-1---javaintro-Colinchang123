import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {

    
    Scanner in = new Scanner(System.in);
    double Weight = in.nextDouble();
    

    
    double height = in.nextDouble();
    
    System.out.println(Weight/(height*height));
  }
}
