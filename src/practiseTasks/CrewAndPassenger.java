package practiseTasks;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int totalPeople = 75;
        String result ;
        if (totalPeople == 50) {
            result = " 20 crew, 30 passengers";
        } else if (totalPeople == 75) {
            result = "25 crew, 50 passengers";
        } else if (totalPeople == 100) {
            result = "30 crew, 70 passengers";
        } else {
            result = "number of people on the ship is not valid";
        }
        System.out.println("result = " + result);
    }
}
