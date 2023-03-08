package day_12;

public class EligibleVote {
    public static void main(String[] args) {
        eligibleToVote(18,true);
    }

    public static void eligibleToVote(int age,boolean isAmerican){
        /*Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote*/
        if(age>16&&isAmerican){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible");
        }

    }
}
