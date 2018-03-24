public class Main
{
  public static void main(String[] args)
  {
    League<Team<Football>> footballLeague = new League<>("AFI");
    Team<Football> realMadrid = new Team<>("RealMadrid");
    Team<Football> barcelona  = new Team<>("Barcelona");
    Team<Football> manUnited  = new Team<>("ManUnited");
    Team<Football> chelsea    = new Team<>("Chelsea");
   // Team<Tennis> champions    = new Team<>("Champions");

    footballLeague.add(realMadrid);
    footballLeague.add(barcelona);
    footballLeague.add(manUnited);
    footballLeague.add(chelsea);
    
    realMadrid.matchResult(barcelona, 4, 0);
    barcelona.matchResult(manUnited, 2, 2);
    manUnited.matchResult(chelsea, 6, 2);
    footballLeague.showLeagueTable();
  }//main
}
