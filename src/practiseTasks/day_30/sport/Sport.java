package practiseTasks.day_30.sport;

public class Sport {
    private String name, rules;
    private int numberOfPlayers, numberOfReferee;

    public Sport(String name, String rules, int numberOfPlayers, int numberOfReferee) {
        this.name = name;
        this.rules = rules;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferee = numberOfReferee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if (numberOfPlayers <= 0) {
            System.err.println("can not be zero or negative");
            System.exit(1);
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferee() {
        return numberOfReferee;
    }

    public void setNumberOfReferee(int numberOfReferee) {
        if (numberOfReferee <= 0) {
            System.err.println("can not be zero or negative");
            System.exit(1);
        }
        this.numberOfReferee = numberOfReferee;
    }

    public void play(){
        System.out.println(name+" is playing with "+numberOfPlayers+" players");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                '}';
    }
    /*	1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules

			Encapsulate all the fields
					Conditions:
						1. numberOfPlayers can not be set to zero or negative
						2. numberOfReferre can not be set to zero or negative

			Add a constructor that can set all the fields

			methods:
				play()
				toString()

		2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods*/
}
