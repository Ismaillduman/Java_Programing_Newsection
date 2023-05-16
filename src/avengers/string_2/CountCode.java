package avengers.string_2;

public class CountCode {
    public int countCode(String str) {

        /*countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2*/
        int count=0;
        if(str.contains("co")){
            for (int i = 0; i < str.length()-3; i++) {
                String code=str.substring(i,i+2)+""+str.charAt(i+3);

                if(code.equals("coe")){
                    count++;
                }
            }

        }

        return count;
    }
}
