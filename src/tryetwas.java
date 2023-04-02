public class tryetwas {
    public static void main(String[] args) {
        char [] arr={'a','b','c'};
        for (char c : arr) {
            System.out.println(c+" ");
            if(c=='c'){
                continue;
            }
        }
    }
}
