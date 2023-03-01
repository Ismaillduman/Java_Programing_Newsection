package day_10;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFileWithScanner {
    public static void main(String[] args) throws IOException{
        Scanner scan= new Scanner(Path.of("src/day_09/day09 class notes (1).txt"));
        String text= scan.nextLine();
        System.out.println(scan.nextLine());



        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());//word by word

        System.out.println(scan.next()+text);
        //scan.nextLine();
//        for (int i = 0; i <89 ; i++) {
//            System.out.println(i+ scan.nextLine());
//
//        }
        System.out.println(scan.hasNext());
    }
}
