package avengers.string_2;

public class xyzMiddle {

    public boolean xyzMiddle(String str) {
/*xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true*/

int indexOfXyz=str.indexOf("xyz");

if(str.substring(0,indexOfXyz).length()==str.substring(indexOfXyz).length()){
    return true;
} else if (str.substring(0,indexOfXyz).length()+1==str.substring(indexOfXyz).length()||str.substring(0,indexOfXyz).length()==str.substring(indexOfXyz).length()+1) {
    return true;
}else{
    return false;}


    }

}
