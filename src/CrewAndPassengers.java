public class CrewAndPassengers {
    public static void main(String[] args) {

        int number=50;

        String result;

        result= (number == 50 || number==75|| number==100)? (number==50) ? "20 crew 30 passenger" :
        (number==75)? "25 crew , 50 passengers" : "30 crew , 70 passenger": "invalid";

        System.out.println("result = " + result);


        System.out.println("------------------------------------------------------------");

        int number_1 =50;
        String result_1="";
        switch (number_1){
            case 50:
                result_1="20 crew 30 passenger";
                break;
            case 75:
               result_1="25 crew , 50 passengers";
                break;
            case 100:
                result_1="30 crew , 70 passenger";
            default:
               result_1="invalid data";
        }
        System.out.println(result_1);

    }
}
