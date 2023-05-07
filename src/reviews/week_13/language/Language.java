package reviews.week_13.language;

public interface Language {
    String default_Coding="UTF_8";

    void hello();
    void bye();
    static void description(){
        System.out.println("Languages have the ability to express thoughts and ideas to others " +
                "using units of sound like words or sentences. " +
                "There is often rules or syntax for how the words come together");

    }


}
