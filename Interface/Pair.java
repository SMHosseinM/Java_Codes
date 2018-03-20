public class Pair<FirstType, SecondType>
{
  private final FirstType first;
  private final SecondType second;

  public Pair(FirstType requiredFirst, SecondType requiredSecond)
  {
    first = requiredFirst;
    second = requiredSecond;
  }//Pair

  public FirstType getFirst()
  {
    return first;
  }//getFirst

  public SecondType getSecond()
  {
    return second;
  }//getSecond

}//class pair
