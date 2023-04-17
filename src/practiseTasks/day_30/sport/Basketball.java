package practiseTasks.day_30.sport;

public class Basketball extends Sport {
    private int numberOfPeriod;

    public Basketball(String name, String rules, int numberOfPlayers, int numberOfReferee, int numberOfPeriod) {
        super(name, rules, numberOfPlayers, numberOfReferee);
        setNumberOfPeriod(numberOfPeriod);
    }

    public int getNumberOfPeriod() {
        return numberOfPeriod;
    }

    public void setNumberOfPeriod(int numberOfPeriod) {
        this.numberOfPeriod = numberOfPeriod;
    }

    public void topScorer(int score){
        System.out.println(getName()+" is top scorer with "+score+" score");
    }
}
