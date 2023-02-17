package day_06;

import java.util.HashMap;

public class ChooseLanguage {
    public static void main(String[] args) {
        HashMap<Integer,String> languages=new HashMap<Integer,String>();//Creating HashMap
        languages.put(1,"Hello, thank for your call");  //Put elements in Map
        languages.put(2,"Hola, gracias para llamar");
        languages.put(3," Merhaba, aradiginiz icin tesekkurler");
        languages.put(4,"Privet, spasibo za vash zvonok"); //trying duplicate key
        languages.put(5," Merci ,pour votre appel"); //trying duplicate key
        String language="";

        int select= 4;


        if(select==1){
            language= languages.get(1);
        } else if (select==2) {
            language= languages.get(2);
        }else if (select==3) {
            language= languages.get(3);
        }else if (select==4) {
            language= languages.get(4);
        }else{ language= languages.get(5);}
        System.out.println(language);
    }
}
