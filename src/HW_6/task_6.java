package HW_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        String[] modelIs = new String[]{"Asus", "Dell", "HP", "Acer"};
        String[]processorIs = new String[]{"Intel", "AMD"};
        int[] ramIs = new int[]{8, 16, 32};
        int[] hardDriveVolume = new int[]{512, 1024, 2048};
        double[] diagonalIs = new double[]{14, 16.5, 17};

        Map<Notebook, Integer> notebooks = new HashMap<>();

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            String model = modelIs[random.nextInt(0, 4)];
            String CPU = processorIs[random.nextInt(0, 2)];
            int RAM = ramIs[random.nextInt(0, 3)];
            int hardDrive = hardDriveVolume[random.nextInt(0, 3)];
            double diagonal = diagonalIs[random.nextInt(0, 3)];

            Notebook newNotebook = new Notebook(model, CPU, RAM, hardDrive, diagonal);
            if (notebooks.containsKey(newNotebook)){
                var a = notebooks.get(newNotebook);
                notebooks.put(newNotebook, ++a);
            }
            else
                notebooks.put(newNotebook, 1);
        }

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Мин. ОЗУ (8-32 ГБ): ");
        var minRAM = iScanner.nextInt();
        System.out.print("Мин. объем памяти (512-2048 ГБ): ");
        var minSSDVolume = iScanner.nextInt();
        System.out.print("Мин. диагональ (14-17 дюймов): ");
        var minDiagonal = iScanner.nextInt();

        Notebook search = new Notebook("", "", minRAM, minSSDVolume, minDiagonal);
        int count = 0;
        for (var item : notebooks.entrySet()){
            var a = item.getKey();
            if (a.ifMoreOrEqualNotebook(search)){
                System.out.println(a);
                System.out.printf("В наличии: %d\n%n", item.getValue());
                System.out.println("------------------");
                count++;
            }
        }
        System.out.printf("Ноутбуков подходящих под критерии: %d,%n", count);
    }
}
