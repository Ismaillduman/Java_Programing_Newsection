package replit_tasks.tasks_week_4;

import java.util.Scanner;

public class StarsXEndsX {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word= sc.nextLine();
        if(word.startsWith("x")||word.startsWith("X")){
            System.out.println(word.substring(1, word.length() - 1));
        } else if (word.endsWith("x")||word.endsWith("X")) {
            System.out.println(word.substring(0, word.length() - 2));
        } else{
            System.out.println(word);
        }
        /*Use `String methods` to modify the given `word` based on the following rules:

> - If `word` starts with or ends with `x` or `X` print the String without those `x` characters
> - If there is no `x` or `X` as the first or last character print the `word` untouched

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

```
Ex:
  Input:
    xHiX

  Output:
    Hi
```
```
Ex:
  Input:
    apple

  Output:
    apple
```
```
Ex:
  Input:
    xUxL

  Output:
    UxL
```
```
Ex:
  Input:
    JavaX

  Output:
    Java
```*/
    }
}
