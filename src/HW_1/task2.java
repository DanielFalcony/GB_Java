//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1

package HW_1;

public class task2 {

    public static void main(String[] args) {
        int[] newArray = new int[]{1,1,0,1,1,1,1,1};
        int count = 0;
        int countMax = 0;
        int val = 0;
        for (int item : newArray){
            if (item == val || count == 0){
                count += 1;
                val = item;
                if (count > countMax){
                    countMax = count;
                }
            }
            else{
                count = 0;
            }
        }
        System.out.printf("максимальное ко-во вхождений подряд у значения= %s, кол-во вхождений = %s%n", val, countMax);

    }
}
