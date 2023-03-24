package office_hours.week_7;

public class TestSportsTeam {
    public static void main(String[] args) {
        SportsTeam sportsTeam= new SportsTeam();
        sportsTeam.setInfo("Koln","Yusuf Duman","45","Cologne",18,35000);
        System.out.println(sportsTeam);

        sportsTeam.joinFanClub();
        System.out.println(sportsTeam.numberOfFans);
    }
}
