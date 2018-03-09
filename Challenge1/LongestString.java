public class LongestString
{
  public static Pair findLongestString(String[] array)
                     throws IllegalArgumentException
  {
    if(array == null || array.length == 0)
      throw new IllegalArgumentException("Array must exist and be non-empty");

    String longestString = array[0];
    int longestIndex = 0;
    for(int index = 1; index<array.length; index++)
      if(longestString.length() < array[index].length())
      {
        longestString = array[index];
        longestIndex = index;
      }//if

    return new Pair(longestString, new Integer(longestIndex));
  }//Pair
}//LongestString
