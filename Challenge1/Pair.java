public class Pair
{
  // The two objects
  private final Object first, second;

  // Constructor is given the two objects.
  public Pair(Object requiredFirst, Object requiredSecond)
  {
    first = requiredFirst;
    second = requiredSecond;
  }//Constructor

  public Object getFirst()
  {
    return first;
  }
 
  public Object getSecond()
  {
    return second;
  }
}//Pair
