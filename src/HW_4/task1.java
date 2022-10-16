//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package HW_4;

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> newList = new LinkedList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(6);
        list.add(9);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            newList.addFirst(list.get(i)); // Берем элемент под индексом i и заполняем нвоый список подставляя в начало.
        }
        System.out.println(newList);
    }
}
