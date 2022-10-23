package HW_5;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> map;

    public PhoneBook() {
        map = new HashMap<>();
    }

    public void add(String number, String name){
        map.put(number, name);
    }

    public void printPerson() {
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
