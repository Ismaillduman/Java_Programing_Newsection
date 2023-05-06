package practiseTasks.day_36;

import practiseTasks.day_34.car.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class CarTask {
    public static void main(String[] args) {
        Car[] cars = {
                new Honda("Pilot",2010, 25000, "White"),
                new Audi("Q6", 2014,32000, "red"),
                new Honda("Accord", 2011,20000, "White"  ),
                new Audi("Q4", 2015, 33000, "White"),
                new Audi("A7", 2019,35000, "Black"),
                new Audi("Q8", 2018,80000, "White"),
                new Audi("Q5", 2009,30000, "Purple"),
                new Audi("A4", 2011, 30000, "Black"),
                new Honda("Civic", 2018,30000, "Black"),
                new Honda("CR-V", 2012, 23000, "Red"),
                new Honda("HR-V", 2019,15000, "Blue"),
                new Tesla("Model 3", 2015, 45000, "Pink"),
                new Tesla("Model Y", 2017, 65000, "Green"),
                new Tesla("Model X", 2016, 48000, "Red"),
                new Tesla("Model X", 2014,48000, "Blue"),
        };
/*1.2 Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Honda: from year 2010 to 2011
	        							Audi: from year 2015 to 2019
	        							Tesla: from year 2015-2016*/
        for (Car each : cars) {
            if(each instanceof Honda && each.getYear()==2010||each.getYear()==2011){
                System.out.println(each.getMake()+ " "+each.getModel()+" from year 2010 to 2011 has recall, because of a defects");
            }
        }

        for (Car each : cars) {
            if(each instanceof Audi&& each.getYear()>=2015 && each.getYear()<=2019){
                System.out.println(each.getMake()+" "+each.getModel()+" from year 2015 to 2019 has recall, because of a defects");
            }
        }
        for (Car each : cars) {
           if(each instanceof Tesla&& each.getYear()==2015||each.getYear()==2016){
               System.out.println(each.getMake()+" "+each.getModel()+" from year 2015-2016 has recall ,because of a defects");
           }
        }

        System.out.println("=================================================");

        /*1.3 Write a program that can display the car that has the highest price*/
        double maxCarPrice=Integer.MIN_VALUE;
        double minCarPrice=Integer.MAX_VALUE;

        for (Car each : cars) {
            if(each.getPrice()>maxCarPrice){
                maxCarPrice=each.getPrice();
            }
        }
        for (Car each : cars) {
            if(each.getPrice()<minCarPrice){
                minCarPrice=each.getPrice();
            }
        }
        System.out.println("maxCarPrice = " + maxCarPrice);
        System.out.println("minCarPrice = " + minCarPrice);
        System.out.println("========================================================");
        /*Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
						ArrayList<Tesla> teslaCars = new ArrayList<>()*/
        ArrayList<Tesla> teslaCars= new ArrayList<>();

        for (Car each : cars) {
            if(each.getMake().equals("Tesla")){
               teslaCars.add((Tesla)each);
            }
        }
        System.out.println(teslaCars);
    }






    /*




			1.3 Write a program that can display the car that has the lowest price

			1.4 */


}
