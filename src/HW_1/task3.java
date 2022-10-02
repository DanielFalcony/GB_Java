// Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа, равные заданному,
// нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
// а остальные - равны ему.

package HW_1;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] newArray = new int[] {3,2,2,3};
        int val = 3;
        for (int i = 0; i < newArray.length - 1; i++) {
            if (newArray[i] == val){
                for (int j = i; j < newArray.length - 1; ++j) {
                    newArray[j] = newArray[j + 1];
                }
                newArray[newArray.length - 1] = val;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
