package practiseTasks.day_31.states;

public class States {

    private  String name,politicalParty,senator,governor,abbreviation;
    private int population;
    private  double stateTask;

    public States(String name, String politicalParty, String senator, String governor, String abbreviation,
                  int population, double stateTask) {
       setName(name);
       setPoliticalParty(politicalParty);
       setSenator(senator);
       setGovernor(governor);
       setAbbreviation(abbreviation);
       setPopulation(population);
       setStateTask(stateTask);

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()||name.isBlank()||name==null)
        {System.out.println("name can not be empty/blank");
            System.exit(1);

        }else {
            this.name = name;

        }

    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(!politicalParty.isBlank()||!politicalParty.isEmpty()||politicalParty!=null)
        {this.politicalParty = politicalParty;}else {
            System.out.println("political Party can not be empty/blank");
            System.exit(1);
        }

    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(!senator.isBlank()||!senator.isEmpty()||senator!=null)
        {this.senator = senator;}else {
            System.out.println("senator can not be empty/blank");
            System.exit(1);
        }

    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if(!governor.isBlank()||!governor.isEmpty()||governor!=null)
        { this.governor = governor;}else {
            System.out.println("governor can not be empty/blank");
            System.exit(1);
        }

    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(!abbreviation.isBlank()||!abbreviation.isEmpty()||abbreviation!=null)
        { this.abbreviation = abbreviation;}else {
            System.out.println("abbreviation can not be empty/blank/null");
            System.exit(1);
        }

    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population<=0){
            System.out.println("Population can not be zero or negative "+ population);
            System.exit(1);
        }else{
            this.population = population;
        }

    }

    public double getStateTask() {
        return stateTask;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", senator='" + senator + '\'' +
                ", governor='" + governor + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", population=" + population +
                ", stateTask=" + stateTask +
                '}';
    }

    public void setStateTask(double stateTask) {
        if(stateTask>0){
            this.stateTask = stateTask;
        }else {
            System.out.println("taxRate can not be negative "+stateTask);
            System.exit(1);
        }

    }

    /*

                        Conditions:
                            1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            2. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            3. taxRate can not be negative
                            4. Population can not be zero or negative

            Methods:
                toString()

    2. Create the following sub classes of States and add any additional fields and methods if necessary:
                1. Virginia
                2. California
                3. Texas
                4. Florida


    3. Create a class named StateObjects
                    Create the objects of each sub classes

                    test all the functions of each objects

                    Analyze the relationships between the classes*/
}
