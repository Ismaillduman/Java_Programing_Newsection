package replit_tasks.tasks_week_4;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        /*Use `String methods` and `if statements` for the fast food company's menu.
        There is two main orders: A Burger meal or a Chicken meal.
        The cashier will have an input `order` that will be used to determine the price.
        Use the following information to determine the price of the order:*/

        Scanner sc= new Scanner(System.in);
        String order= sc.nextLine();
        if(order.equals("burger")){
            System.out.println("Your total is $12.50");
        }else if(order.equalsIgnoreCase("chicken")){
            System.out.println("Your total is $9.75");
        }

        /*burger: $12.50
> - chicken: $9.75

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

```
Ex:
  Input:
    chicken

  Output:
    Your total is $9.75
```

```
Ex:
  Input:
    burger

  Output:
    Your total is $12.50*/

    }
}
