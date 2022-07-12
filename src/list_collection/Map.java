package list_collection;

public class Map {
    private Set keys;
    private String[][] map;

    public Map() {
        keys = new Set();
        map = new String[4][2];
    }

    public void create(String key, String value){
        if(keys.has(key)){
            return;
        }

        if(map[map.length -1] != null){
            String[][] tempMap = new String[map.length * 2][2];

            for (int i = 0; i < map.length; i++) {
                tempMap[i][0] = map[i][0];
                tempMap[i][1] = map[i][1];
            }

            map = tempMap;
        }

        for (int i = 0; i < map.length; i++) {
            if(map[i] != null){
                map[i][0] = key;
                map[i][1] = value;
                break;
            }
        }

        keys.add(key);
    }

    public String get(String key){
        for (int i = 0; i < map.length; i++) {
            if(map[i][0] == key){
                return map[i][1];
            }
        }

        return null;
    }

    public void delete(String key){
        for (int i = 0; i < map.length; i++) {
            if(map[i][0] == key){
                map[i][0] = null;
                map[i][1] = null;
                break;
            }
        }
    }

    public void update(String key, String newValue){
        for (int i = 0; i < map.length; i++) {
            if(map[i][0] == key){
                map[i][1] = newValue;
                break;
            }
        }
    }
}
