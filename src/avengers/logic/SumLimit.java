package avengers.logic;

public class SumLimit {
    public int sumLimit(int a, int b) {
int sum=a+b;
if(String.valueOf(sum).toCharArray().length>String.valueOf(a).length()){
    return a;
}else{
    return sum;
}
    }
}
