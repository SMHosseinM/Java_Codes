import java.util.List;
import java.util.ArrayList;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println(a());
  }//main

  private static int a()
  {
    List<Integer> fib = new ArrayList<>();
    fib.add(1);
    fib.add(2);
    int sumOfEvens = 2;
    int result;
    while((result = fib.get(fib.size()-2) + fib.get(fib.size()-1)) <= 4000000)
    {
      fib.add(result);
      if(result%2 == 0)
      {
        sumOfEvens += result;  
      }
    }
    return sumOfEvens;
  }//a
}//Main

