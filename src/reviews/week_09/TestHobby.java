package reviews.week_09;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;

public class TestHobby {
    public static void main(String[] args) {
        Hobby golf= new Hobby("Golf",25,true,false);
        Hobby puzzle= new Hobby("Puzzle",12,false,false);
        Hobby java= new Hobby("java");
        Hobby dancing= new Hobby("Salsa",45,false,true);
        Hobby bowling= new Hobby("Bowling",50,false,true);
        Hobby tennis= new Hobby("Tennis",60,true,true);

        ArrayList<Hobby> hobbies= new ArrayList<>();
        hobbies.addAll(Arrays.asList(golf,puzzle,java,dancing,bowling,tennis));

        hobbies.addAll(Arrays.asList(new Hobby("ping pin",200,false,true),
                new Hobby("volleyball",100,false,true),
                new Hobby("Swimming",150,true,false)));

        System.out.println(hobbies);

        System.out.println("-----------------------------------------------");
        for(Hobby each:hobbies){
            each.doIt();
        }
    }

}
