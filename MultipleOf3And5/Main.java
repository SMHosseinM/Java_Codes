public class Main
{
  public static void main(String[] args)
  {
    int result = 0;
    for(int i=3; i<1000; i++)
    {
      if(i%3 == 0 || i%5 == 0)
        result += i;
    }//for

    System.out.println(result);
  }
}//Main
