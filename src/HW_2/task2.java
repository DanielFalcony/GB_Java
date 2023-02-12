// Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
//1 Расширение файла: txt
//2 Расширение файла: pdf
//3 Расширение файла:
//4 Расширение файла: jpg

package HW_2;

import java.io.File;

public class task2 {
    public static void main(String[] args) {
        StringBuilder allFiles = new StringBuilder();
        String[] path;
        File filePath = new File("A:\\PythonPyCharm\\JavaProjects\\GB_Java\\src\\HW_2\\test_folder");
        path = filePath.list();
        assert path != null;
        for (String pathname : path) {
            int indexDot = pathname.indexOf(".");
            System.out.println(pathname.substring(indexDot + 1));
            allFiles.append(pathname).append(" ");
        }
        System.out.println(allFiles);
        // как отделить расширения списка "allFiles"?
    }
}