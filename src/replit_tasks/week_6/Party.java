package replit_tasks.week_6;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
/*Please enter the guest's name:
  Nick
Do you want to enter another guest's name?
  yes
Please enter the guest's name:
  Linda
Do you want to enter another guest's name?
  no
Guests' list: Nick, Linda
```*/

        Scanner input = new Scanner(System.in);
        String guestList = "";
        String answer = "yes";
        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Please enter the guest's name:");
            guestList += input.next()+", ";

            System.out.println("Do you want to enter another guest's name?");
            answer = input.next();




        }

        System.out.println(("Guests' list: " + guestList.substring(0,guestList.length()-2)));

    }
}
