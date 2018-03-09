public class Pair<FirstType, SecondType>
{
  // The first object
  private final FirstType first;

  // The second object
  private final SecondType second;
  // Constructor is given the two objects.
  public Pair(FirstType requiredFirst,SecondType requiredSecond)
  {
    first = requiredFirst;
    second = requiredSecond;
  }//Constructor

  public FirstType getFirst()
  {
    return first;
  }
 
  public SecondType getSecond()
  {
    return second;
  }
}//Pair
