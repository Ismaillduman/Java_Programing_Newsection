package office_hours.week_17.map_1;

import java.util.Map;

public class mapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
if(map.containsKey("ice cream")){
    map.put("yogurt",map.get("ice cream"));
}
if(map.containsKey("spinach")){
    map.put("spinach","nuts");
}
return map;
    }
}
