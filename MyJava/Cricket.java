import java.lang.*;
import java.util.*;

class Player
{
    String name;
    String country;
    int playerID;
    int teamIDofPlayer;

    public Player(String name, String country, int playerID,int teamIDofPlayer) {
        this.name = name;
        this.country = country;
        this.playerID = playerID;
        this.teamIDofPlayer=teamIDofPlayer;
    }

    @Override
    public String toString() {
        return  
                "Name = '" + name + '\'' +
                ", Country = '" + country + '\'' +
                ", PlayerID = " + playerID +
                ", TeamIDofPlayer = " + teamIDofPlayer ;
    }
}

class Team
{
    String teamName;
    String country;
    int teamID;
    List<Player> playerList=new ArrayList<>();

    public Team(String teamName, String country, int teamID, List<Player> playerList) {
        this.teamName = teamName;
        this.country = country;
        this.teamID = teamID;
        this.playerList = playerList;
    }

    @Override
    public String toString() {
        return
                "TeamName = '" + teamName + '\'' +
                ", Country = '" + country + '\'' +
                ", TeamID = " + teamID +
                ", PlayerList = \n" + playerList ;
    }
}
public class Cricket {

    public static void main(String[] args) {

        List<Team> teamList=new ArrayList<>();

        Player p1=new Player("MS Dhoni","India",1,111);
        Player p2=new Player("Rohit Sharma","India",2,111);
        Player p3=new Player("K.L. Rahul","India",3,111);
        Player p4=new Player("Virat Kohli","India",4,111);

        List<Player> playerListIndia=new ArrayList<>();
        playerListIndia.add(p1);
        playerListIndia.add(p2);
        playerListIndia.add(p3);
        playerListIndia.add(p4);

        Team india=new Team("Indian Cricket Team","India",111,playerListIndia);
        teamList.add(india);

//2nd team details:
        Player pu1=new Player("Steven Smith","Australia",5,222);
        Player pu2=new Player("David Warner","Australia",6,222);
        Player pu3=new Player("Mitchel Starc","Australia",7,222);
        Player pu4=new Player("Shane Watson","Australia",8,222);

        List<Player> playerListA=new ArrayList<>();
        playerListA.add(pu1);
        playerListA.add(pu2);
        playerListA.add(pu3);
        playerListA.add(pu4);
        Team australia=new Team("Australian Cricket Team","Australia",222,playerListA);
        teamList.add(australia);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Valid Team ID: ");
        int inputIDteam=sc.nextInt();

        if(inputIDteam == 111 || inputIDteam == 222) {
            for (int i = 0; i < teamList.size(); i++) {
                int id;
                Team t;
                t = teamList.get(i);
                id = t.teamID;
                if (id == inputIDteam) {
                    System.out.println(t);
                }
            }
        }
        else
            System.out.println("Enter Valid Team ID!!!");

        System.out.println("\n"+"Enter Valid Player ID: ");
        int inputIDPlayer=sc.nextInt();

        if(inputIDPlayer == 1 || inputIDPlayer == 2 || inputIDPlayer == 3 || inputIDPlayer == 4 ||
                inputIDPlayer == 5|| inputIDPlayer == 6|| inputIDPlayer == 7|| inputIDPlayer == 8) {
            for (int i = 0; i < teamList.size(); i++) {

                Team t;
                t = teamList.get(i);
                for (int j = 0; j < t.playerList.size(); j++) {
                    int pID;
                    Player p;
                    p = t.playerList.get(j);
                    pID = p.playerID;
                    if (inputIDPlayer == pID) {
                        System.out.println(p);
                    }
                }
            }
        }
        else
            System.out.println("Enter Valid Player ID!!!");




    }
}
