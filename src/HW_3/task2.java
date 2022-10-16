// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. (Collections.max())

package HW_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        int sum = 0;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(sum / list.size());
    }
}