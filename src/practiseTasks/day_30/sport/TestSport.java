package practiseTasks.day_30.sport;

public class TestSport {
    public static void main(String[] args) {
        Football football= new Football("Football","who make more score is winner",11,4,74);
        football.bestScorer();
        System.out.println(football);
        Baseball baseball= new Baseball("Baseball","kick the ball",+9,2);
        baseball.play();
    }
}
