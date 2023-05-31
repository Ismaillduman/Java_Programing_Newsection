package office_hours.week_17.map_1;

import java.util.Map;

public class MapAB {
    public Map<String,String> mapAB(Map<String,String> map){

        if (map.containsKey("a")&&map.containsKey("b")){
            String value= map.get("a")+map.get("b");
            map.put("ab",value);
        }

        return map;
    }
}
