package reviews.review_06;

public class IsPrime {
    public static void main(String[] args) {

        int range = 100;

        for(int j = 2; j <= range; j++){ // num = j

            boolean isPrime = true;

            for(int i = 2; i < j; i++){
                //System.out.println(num + " % " + i + "  " + (num%i));
                if(j % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(j + ", ");
            }
        }

    }

    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static String primeInRange(int range){
        String prime = "";
        for(int i = 2; i <= range; i++){
            if(isPrime(i)){
                prime += i + ", ";
            }
        }
        return prime.substring(0, prime.length()-2);
    }


}
