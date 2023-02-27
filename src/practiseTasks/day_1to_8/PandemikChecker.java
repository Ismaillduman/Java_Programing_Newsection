package practiseTasks.day_1to_8;

public class PandemikChecker {
    public static void main(String[] args) {
        int given_year=1889;
        String pandemicName="";
        boolean pandemic_year= 0<given_year&&given_year<2023;
        String result= "sorry "+given_year+ " is not a valid year";
        if (pandemic_year){
            if(given_year>=1346&&given_year<=1353){
                pandemicName= "The Black Death";
            } else if (given_year==1665||given_year==1666) {
                pandemicName="Great Plague of London";
            } else if (given_year>=1770&&given_year<=1772) {
                pandemicName="Russian Plague";
            } else if (given_year>=1889&&given_year<=1890) {
                pandemicName="Flu pandemic";
            } else if (given_year==1916) {
                pandemicName="American polio epidemic";
            } else if (given_year<=1920&&given_year>=1918) {
                pandemicName=" Spanish Flu ";
            } else if (given_year==2009||given_year==2010) {
                pandemicName="H1N1 Swine Flu pandemicv";
            } else if (given_year>2014&&given_year<2016) {
                pandemicName="West African Ebola epidemic";
            } else if (given_year==2020||given_year==2021) {
                pandemicName="COVID-19";
            }else {
                System.out.println("No Pandemic in "+ given_year);
            }
        }else {
            System.out.println("result = " + result);
        }
        System.out.println(given_year+": "+pandemicName);

        /*
 */
    }
}
