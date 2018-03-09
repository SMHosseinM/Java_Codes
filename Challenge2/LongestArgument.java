/** This programe takes some arguments as the stdin
  * retuns the longest string with it position
  */
public class LongestArgument
{
  public static void main(String[] args) throws RuntimeException 
  {
    Pair<String, Integer> result = LongestString.findLongestString(args);
    String longestArg = result.getFirst();
    int longestIndex = result.getSecond().intValue();
    
    System.out.println("A longest argument was `" + longestArg + "`");
    System.out.println("of length " + longestArg.length());
    System.out.println("found at position " + (longestIndex + 1));
  }//main
}//class
