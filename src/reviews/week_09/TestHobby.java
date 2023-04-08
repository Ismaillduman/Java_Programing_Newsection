package reviews.week_09;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;

public class TestHobby {
    public static void main(String[] args) {
        Hobby golf = new Hobby("Golf", 2500, true, false);
        Hobby puzzle = new Hobby("Puzzle", 120, false, false);
        Hobby java = new Hobby("java");
        Hobby dancing = new Hobby("Salsa", 450, false, true);
        Hobby bowling = new Hobby("Bowling", 500, false, true);
        Hobby tennis = new Hobby("Tennis", 600, true, true);

        ArrayList<Hobby> hobbies = new ArrayList<>();
        hobbies.addAll(Arrays.asList(golf, puzzle, java, dancing, bowling, tennis));

        hobbies.addAll(Arrays.asList(new Hobby("ping pin", 200, false, true),
                new Hobby("volleyball", 100, false, true),
                new Hobby("Swimming", 150, true, false)));

        System.out.println(hobbies);

        System.out.println("-----------------------------------------------");
        for (Hobby each : hobbies) {
            each.doIt();
        }
        System.out.println("--------------------------------------------");
        ArrayList<Hobby> outdoors = new ArrayList<>(hobbies);
        ArrayList<Hobby> requireOthers = new ArrayList<>(hobbies);
        ArrayList<Hobby> highCost = new ArrayList<>(hobbies);
        outdoors.removeIf(p-> !p.isOutdoors);
        requireOthers.removeIf(p->p.requiresOthers);
        highCost.removeIf(p->p.annualCost>400);
        System.out.println(outdoors);
        System.out.println(requireOthers);
        System.out.println(highCost);

    }

}
