package office_hours.week_7;

public class SportsTeam {
    /*Create a class called SportsTeam
    declare these instance variables:
        name, number of players, coach, win/loss record, country, number of fans

    create a setInfo() method to initialize these variables

    create a method joinFanclub
        it is a void method with no parameters, but whenever it is run the number of fans increases by one

    create a toString() that shows the information in the following format:
        The $name sports team is based out of $country. A total of $player players are led by $coach and currently hold a $record record of wins and losses. They have $fans fans.

    use the ObjectTester class and create some SportsTeam objects*/


    public String name, coach, WinLossRecord, country;
    public int numberOfPlayers, numberOfFans;

    public void setInfo(String name, String coach, String winLossRecord, String country, int numberOfPlayers, int numberOfFans) {
        this.name = name;
        this.coach = coach;
        this.WinLossRecord = winLossRecord;
        this.country = country;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfFans = numberOfFans;
    }

    public void joinFanClub(){
        numberOfFans++;
    }


    public String toString() {
        return "The "+name+" sports team is based out of "+country+". "+numberOfPlayers+" players are led by "+coach+" and \n" +
                "         currently hold a "+WinLossRecord+" record of wins and losses. They have "+numberOfFans+" fans.";

    }
}
