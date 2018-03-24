import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
  * Creating a league table for a sport
  *
  */
public class League<T extends Team>
{
  private String leagueName;
  private List<T> membersOfLeague = new ArrayList<>();
  
  public League(String name)
  {
    leagueName = name;
  }
  /**
    * If team is of type of the league, it will be added
    * to the list containing all the participant in 
    * that specific league.
    */
  public void add(T team)
  {
    if(!membersOfLeague.contains(team))
      membersOfLeague.add(team);
  }

  public void showLeagueTable()
  {
    Collections.sort(membersOfLeague);
    for(T t : membersOfLeague)
      System.out.println(t.getName() + " : " + t.ranking());
  }
}//class 
