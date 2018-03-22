public class DeliveryHouseDetails implements Comparable<DeliveryHouseDetails>
{
  private int houseNumber;
  private String name;

  public DeliveryHouseDetails(int houseNum, String name)
  {
    this.houseNumber = houseNum;
    this.name = name;
  }//constructor

  //accossor method for the name
  public String getName()
  {
    return name;
  }//getName

  @Override 
  public int compareTo(DeliveryHouseDetails house)
  {
    if((this.houseNumber%2) == 1 && (house.houseNumber%2) == 1)
      return this.houseNumber-house.houseNumber;
    else if((this.houseNumber%2) == 0 && (house.houseNumber%2) == 0)
      return house.houseNumber-this.houseNumber;
    else if(this.houseNumber%2 == 1)
      return -1;
    else
      return 1;
  }//CompareTo

  @Override 
  public String toString()
  {
    return "The houseNumber is: " + houseNumber + " and name is: " + name;
  }
}//DeliveryHouseDetails
