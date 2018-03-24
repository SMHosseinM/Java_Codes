import java.util.ArrayList;
import java.util.List;

public class Team<T extends Sport> implements Comparable<Team<T>>
{
  private String name;
  private int point = 0;
  private int numOfLoss = 0;
  private int numOfVictory = 0;
  private int numOfTied = 0;
  private int numOfMatches = 0;

  public Team(String teamName)
  {
    name = teamName;
  }

  public String getName()
  {
    return name;
  }
  
  public void matchResult(Team<T> opponent, int ourScore, int rivalScore)
  {
    if(ourScore > rivalScore)
    {
      point +=3;
      numOfVictory++;
    }
    else if(ourScore == rivalScore)
    {
      numOfTied++; 
      point++;
    }
    else
    {
      numOfLoss++;
    }

    numOfMatches++;

    // update the opponet information
    if(opponent != null)
      opponent.matchResult(null, rivalScore, ourScore);
  }

  public int getPoint()
  {
    return point;
  }//getPoint

  public int getNumOfLosses()
  {
    return numOfLoss;
  }//getNumOfLosses

  public int getNumOfVictory()
  {
    return numOfVictory;
  }//numOfVictories

  public int getNumOfMatches()
  {
    return numOfMatches;
  }//getNumOfMatches
 
  public int ranking()
  {
    return point+numOfTied;
  }
  
  @Override
  public int compareTo(Team<T> team)
  {
    if(this.ranking() > team.ranking())
      return -1;
    else if(this.ranking() < team.ranking())
      return 1;
    else 
      return 0;
  }//compareTo
}//Team
