import java.util.Scanner;
import java.util.ArrayList;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int nums = in.nextInt();
    
    ArrayList<Integer> data = new ArrayList<>();
    ArrayList<Integer> data2 = new ArrayList<>();
    
    /*[1, 1, 1, 2, 3, 4, 4, 4]
    [3, 3, 3, 1, 1, 3, 3, 3]
    */
    int highest = 0;
    int ind = 0;
    
    
    for (int i = nums; i > 0; i--)
    {
        data.add(in.nextInt());
    }
    
    for (int i : data)
    {
        int freq = 0;
        for (int x : data)
        {
            if (i == x)
            {
                freq ++;
            }
        }
        
        data2.add(freq);
    }
    
    for (int i = 0; i < nums; i++)
    {
        if(data2.get(i) >= highest)
        {
            highest = data2.get(i);
            ind = i;
        }
        
    }
    System.out.println(data.get(ind));
    
  }
}
