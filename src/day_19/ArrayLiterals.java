package day_19;

import day_10_scanner_string.StringIntro;

import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {
        String [] days={"Montag","Dienstag","Mitwoch","Donerstag","Freitag","Samstag","Sontag"};
        int n=1;
        System.out.println(days[n-1]);

        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("Months" +Arrays.toString(months));

    }
}
