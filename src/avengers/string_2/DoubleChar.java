package avengers.string_2;

public class DoubleChar {
    public String doubleChar(String str) {
        for (char each : str.toCharArray()
        ) {
            System.out.print(each + "" + each);

        }
        return str;
        /* String doubleChar="";
  for (char each:str.toCharArray()
             ) {
            doubleChar+=each+""+each;

        }
        return doubleChar;*/
    }

    public static void main(String[] args) {
        DoubleChar doubleChar = new DoubleChar();

        doubleChar.doubleChar("Hix");
    }
}
