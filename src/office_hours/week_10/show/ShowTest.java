package office_hours.week_10.show;

import java.util.ArrayList;
import java.util.Arrays;

public class ShowTest {
    /*
            Sample data to use, or use your own
    name - number of seasons - completed - available languages
    the last of us - 1 - false - english, spanish
    game of thrones - 8 - true - english, spanish, german
    family feud - 24 - false - english
    squid game - 1 false - korean, english, french, spanish, german
    you knock on my door(Sen Çal Kapimi) - 2 - true - turkish
         */
    public static void main(String[] args) {

        Show show= new Show("the last of us",1,false);
       show.audioLanguagesAvailable.add("English");
       show.audioLanguagesAvailable.add("spanish");
        System.out.println(show);

        Show got= new Show("game of trons",8,true);
        ArrayList<String> langGot= new ArrayList<>(Arrays.asList("english","german","spanish"));
        got.audioLanguagesAvailable.addAll(langGot);
        System.out.println(got);

        Show familyFeud= new Show("family feud",24,false);
        familyFeud.audioLanguagesAvailable.add("english");



        Show squidGame= new Show("squid Game",1,false);
        ArrayList<String> langSquid= new ArrayList<>(Arrays.asList("korean","french","english","german","spanish"));
        squidGame.audioLanguagesAvailable.addAll(langSquid);

        ShowTracker account= new ShowTracker("isma","HKN8318.",5);
        account.trackedShows.add(squidGame);
        account.trackedShows.add(familyFeud);
        System.out.println("--------------------------------------");
        System.out.println(account.filter("french"));
    }
}
