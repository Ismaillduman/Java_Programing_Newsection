package practiseTasks.day_30.sport;

public class Baseball extends Sport{
    public Baseball(String name, String rules, int numberOfPlayers, int numberOfReferee) {
        super(name, rules, numberOfPlayers, numberOfReferee);
    }

    public void bestPlayer(){
        System.out.println(getName()+" is beste player");
    }
}
