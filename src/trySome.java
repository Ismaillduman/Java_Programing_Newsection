import java.util.ArrayList;
import java.util.Arrays;

public class trySome {
    public static void main(String[] args) {
        String password ="password";
        String[] passwordArray= password.split("");
        System.out.println(Arrays.toString(passwordArray));
        ArrayList<String> name=new ArrayList<>(Arrays.asList("Ismail","busra","yusuf"));
        name.remove("Ismail");
        System.out.println(name);

    }
}
