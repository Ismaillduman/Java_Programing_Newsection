package day_04_casting_concat;

import java.util.ArrayList;
import java.util.List;

public class CarInfoExm {

    public static void main(String[] args) {
        List<CarInfo> carInfo = new ArrayList<>();
        carInfo.add(new CarInfo(2023, "toyota","yaris",1250,"Blue",19000,"$"));

        System.out.println(carInfo);
    }
}
