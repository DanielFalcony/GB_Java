//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

package HW_4;

import java.util.LinkedList;

public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < 31; i++) {
            list.add(i);
        }

        for (Integer integer : list) {
            sum += integer;
        }

        System.out.println(list);
        System.out.println(sum);
    }
}