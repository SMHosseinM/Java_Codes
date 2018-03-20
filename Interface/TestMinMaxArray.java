public class TestMinMaxArray
{
  public static void main(String[] args)
  {
    try
    {
      String[] arrayOfData = new String[args.length];
      for(int i=0; i<args.length; i++)
        arrayOfData[i] = args[i];
      Pair minAndMax = MinMaxArray.minMaxFinder(arrayOfData);
      System.out.println("min: " + minAndMax.getFirst());
      System.out.println("Max: " + minAndMax.getSecond());
    }//try
    catch(IllegalArgumentException e)
    {
      System.out.println("The argument providing is wrong\n"
                                   + e.getMessage());
      System.err.println(e);
    }//catch
    
  }
}//TestMinMaxArray
