import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, null);
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(map.get(key));
        }
    }
}
