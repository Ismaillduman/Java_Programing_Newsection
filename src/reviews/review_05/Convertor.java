package reviews.review_05;

public class Convertor {
    public static void main(String[] args) {
        System.out.println(convertUnit(50, "EuRo".toLowerCase()));
    }
    public static double convertUnit(double dollar,String unit){
        double convertion=0;


        /*1 dollar = 0.91 euro
		1 dollar = 121.03 yen
		1 dollar = 14.85 lira
		1 dollar = 1,217.52 won
		1 dollar = 181.45 rupee*/
        switch (unit.toLowerCase()){
            case "euro":
                convertion=dollar*0.91;
                break;
            case "yen":
                convertion=dollar*121.03;
                break;
            case "lira":
                convertion=dollar*20.35;
                break;
            case "won":
                convertion=dollar*1217.52;
                break;
            case "rupee":
                convertion=dollar*181.45;
                break;
            default:
                System.err.println("Invalid unit");;
        }
        System.out.println("$"+dollar+" "+convertion+" "+unit);

        return convertion;


    }
}
