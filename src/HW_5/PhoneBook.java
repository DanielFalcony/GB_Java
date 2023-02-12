package HW_5;

import java.util.*;

public class PhoneBook {
    private Map<String, List> map;
    private List<String> numbers;

    public PhoneBook() {
        map = new HashMap<>();
        numbers = new ArrayList<>();
    }

    public void add(String name, String number){
        if (!map.containsKey(name)) {
            map.put(name, new ArrayList<>());
            map.get(name).add(number);
        } else {
            map.get(name).add(number);
        }
    }

    public void printPerson() {
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
