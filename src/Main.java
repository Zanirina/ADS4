import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        Set<Integer> s = new HashSet<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");
        //System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.values().stream());

    }
}