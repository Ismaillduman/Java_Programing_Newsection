package reviews.week_13.language;

public class ClassRoom {
    public static void main(String[] args) {
        // Language obj= new Language(); can not create an obj from abstract class or interface

        English english = new English();
        english.hello();
        english.bye();
        System.out.println();
        Spanish spanish = new Spanish();

        spanish.bye();
        spanish.hello();
        // spanish.description(); static methods can not inherited from interface
        Language.description();
        System.out.println(spanish.default_Coding);

    }
}
