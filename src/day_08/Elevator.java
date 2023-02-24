package day_08;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber=3;
        String result="invalid floor";
        if(floorNumber<=3&&floorNumber>=1) {
           result = "Floor " + floorNumber + " is selected. companies: ";

            result += (floorNumber == 1) ? "Lobby, Verizon, Starbucks" :
                    (floorNumber == 2) ? "Cydeo, NASA, Intelsat" :
                            (floorNumber == 3) ? "Lyft, BofA, Stake house" :
                                    "Invalid floor - " + floorNumber;
        }
        System.out.println(result);
    }
}
