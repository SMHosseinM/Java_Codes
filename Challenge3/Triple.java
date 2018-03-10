public class Triple<FirstItem, SecondItem, ThirdItem>
{
  // First input
  private final FirstItem first;

  // Second input
  private final SecondItem second;

  // Third input
  private final ThirdItem third;

  //Constructor
  public Triple(FirstItem input1, SecondItem input2, ThirdItem input3)
  {
    first = input1;
    second = input2;
    third = input3;
  }//Triple

  //Accossor method
  public FirstItem getFirst()
  {
    return first;
  }

  public SecondItem getSecond()
  {
    return second;
  }

  public ThirdItem getThird()
  {
    return third;
  }

}//class
