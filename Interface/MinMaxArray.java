import java.util.Arrays;
public class MinMaxArray
{
  public static <T extends Comparable<T>> Pair
                  minMaxFinder(T[] array) throws IllegalArgumentException
  {
    try
    {
      // sorting an array according to the natural ordering
      Arrays.sort(array);
    
      return new Pair<T, T>(array[0], array[array.length-1]);
    }//try
    catch(ArrayIndexOutOfBoundsException e)
    {
      throw new IllegalArgumentException("Array must be non-empty", e);
    } 
    catch(NullPointerException e)
    {
      throw new IllegalArgumentException("Array must be non-empty", e);
    } 
  }//minMaxFinder
}//class
