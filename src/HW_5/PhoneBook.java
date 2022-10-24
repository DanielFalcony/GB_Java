package HW_5;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> map;

    public PhoneBook() {
        map = new HashMap<>();
    }

    public void add(String name, String number){
        if (map.size() == 0){
            map.put(name, number);
        }
        else {
            for (String key : map.keySet()) {
                if (name.equals(key)){
                    map.keySet().add(number);
                }
                else {
                    map.put(name, number);
                }
            }
        }
    }

    public void printPerson() {
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));

        }
    }
}
