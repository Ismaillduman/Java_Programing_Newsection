package practiseTasks.day_25;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    /*Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

            2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary*/
    public static void main(String[] args) {
        Offer offer1= new Offer("Köln","beQualified","sdet",50000,true,true,true,true);
        Offer offer2= new Offer("Frankfurt","beQualified","QA",45000,false,true,true,false);
        Offer offer3= new Offer("Stutgart","beQualified","sdet",55000,true,true,true,true);
        Offer offer4= new Offer("Berlin","beQualified","QA",60000,true,true,false,true);
        Offer offer5= new Offer("Virginia","beQualified","Developer",70000,true,false,true,true);
        Offer offer6= new Offer("Hamburg","beQualified","SDET",63000,true,true,false,false);
        Offer offer7= new Offer("Bremen","beQualified","Designer",45700,false,false,false,false);
        Offer[] fullTimeOffers={offer1,offer2,offer3,offer4,offer5,offer6,offer7};
        ArrayList<Offer> arraylistOffer= new ArrayList<>();
        arraylistOffer.addAll(Arrays.asList(fullTimeOffers));
        arraylistOffer.removeIf(p->!p.isFullTime);
        System.out.println(arraylistOffer);
    }




}
