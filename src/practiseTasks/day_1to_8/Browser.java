package practiseTasks.day_1to_8;

public class Browser {
    public static void main(String[] args) {
        String browserName="chrome", result="";

        if(browserName=="chrome"||browserName=="CHROME"||browserName=="Chrome"){
result=browserName+" browser is selected.";
        }else if(browserName=="firefox"||browserName=="FIREFOX"||browserName=="Firefox"){
            result=browserName+" browser is selected.";
        }else if(browserName=="opera"||browserName=="OPERA"||browserName=="Opera"){
            result=browserName+" browser is selected.";
        }else if(browserName=="safari"||browserName=="SAFARI"||browserName=="Safari"){
            result=browserName+" browser is selected.";
        }else if(browserName=="edge"||browserName=="EDGE"||browserName=="Edge"){
            result=browserName+" browser is selected.";
        }
        System.out.println(result);
    }


}
