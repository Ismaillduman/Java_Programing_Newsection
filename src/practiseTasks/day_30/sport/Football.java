package practiseTasks.day_30.sport;

public class Football extends Sport {
    private int numOfGoals;

    public Football(String name, String rules, int numberOfPlayers, int numberOfReferee, int numOfGoals) {
        super(name, rules, numberOfPlayers, numberOfReferee);
        setNumOfGoals(numOfGoals);
    }

    public int getNumOfGoals() {
        return numOfGoals;
    }

    public void setNumOfGoals(int numOfGoals) {
        this.numOfGoals = numOfGoals;
    }

    public void bestScorer(){
        if(numOfGoals>73){
            System.out.println(getName()+" is best scorer in the world");
        }
    }
}
