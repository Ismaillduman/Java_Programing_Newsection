package office_hours.week_17.map_1;

import java.util.Map;

public class MapAB2 {
    public Map<String,String > map(Map<String,String> map){

        if (map.containsKey("a")&&map.containsKey("b")){
            if(map.get("a").equals(map.get("b"))){
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
}