public class IntArrayStats
{ 
  // Take an array of int as its argument
  // Returning Triple containing Max, min and mean integer
  // Boxing the first 2 inside integer objects and the third
  // inside a Double
  public static Triple<Integer, Integer, Double> getStats(int[] array)
                      throws IllegalArgumentException
  {
    if(array.length == 0 || array == null)
      throw new IllegalArgumentException(
                                  "Array must exist and be non-empty");
    int maxNumber = array[0];
    int minNumber = array[0];
    double meanNumber = array[0];
    
    //Finding the Max and min number
    for(int index=1; index<array.length; index++)
    {
      // Finding the Max number
      if(array[index] > maxNumber)
        maxNumber = array[index];
      // Finding the min number
      else if(array[index] < minNumber)
        minNumber = array[index];
      // Finding the mean
      meanNumber += array[index];
    }//for
    
    meanNumber /= (double)array.length;
    return new Triple<Integer, Integer, Double>(new Integer(maxNumber)
                          , new Integer(minNumber), new Double(meanNumber)); 
  }//Triple
}//class
