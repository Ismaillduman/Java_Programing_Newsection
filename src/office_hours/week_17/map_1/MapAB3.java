package office_hours.week_17.map_1;

import java.util.Map;

public class MapAB3 {
public Map<String,String> map(Map<String,String> map){

    if(map.containsKey("a")&&!map.containsKey("b")){
        map.put("b",map.get("a"));
    } else if (map.containsKey("b")&&!map.containsKey("a")) {
        map.put("a",map.get("b"));
    }
    return map;
}
}
