package day_02;

import java.util.HashMap;

public class AboutMe {
    public static void main(String[] args) {

        HashMap<String, String> Myfavorite= new HashMap<>();
        Myfavorite.put("\nMy Favorite book", "\"Animal Farm\"");
        Myfavorite.put("\nMy Favorite quote", "\"Carpe diem\"");
        Myfavorite.put("\n\tMy Favorite TV Show", "\"Grimm\"");
        Myfavorite.put("\nMy Favorite Music", "\"Herbst\"");

        System.out.println(Myfavorite);

    
    }
}
