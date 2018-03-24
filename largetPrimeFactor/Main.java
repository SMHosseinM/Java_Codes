import java.util.List;
import java.util.ArrayList;
public class Main
{
  public static void main(String[] args)
  {
    List<Long> listOfPrime = new ArrayList<>();
    listOfPrime.add((long)2);
    listOfPrime.add((long)3);
    List<Long> listOfDivisors = new ArrayList<>();
    long number = Long.parseLong(args[0]);
    while(number != 1)
    {
      int i = 2;
      while(number%i != 0)
      {
        i++;
      }//for
      if(!listOfDivisors.contains(i))
        listOfDivisors.add((long)i);
      number /= i;
    }//while  

    for(int i=0; i<listOfDivisors.size(); i++)
    {
      boolean isPrime = true;
      for(int j=0; j<listOfPrime.size(); j++)
      {
        if(listOfDivisors.get(i)%listOfPrime.get(j) == 0)
        {
          isPrime = false;
          break;
        }//if
      }//for
      if(isPrime)
        listOfPrime.add(listOfDivisors.get(i));
    }
    System.out.println(listOfPrime.get(listOfPrime.size() -1));
  }//main
}
