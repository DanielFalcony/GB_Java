//Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//Обработайте ошибки с помощью try-catch конструкции.
// В случае возникновения исключения, оно должно записаться в лог-файл.
// (используйте метод list класса File)

package HW_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task1 {
    public static void main(String[] args) {
        StringBuilder allFiles = new StringBuilder();
        String[] path;
        File filePath = new File("A:\\PythonPyCharm\\JavaProjects\\GB_Java\\src\\HW_2\\test_folder");
        path = filePath.list();
        assert path != null;
        for (String pathname : path){
            allFiles.append(pathname).append(" ");
        }
        File file = new File("A:\\PythonPyCharm\\JavaProjects\\GB_Java\\src\\HW_2");
        FileWriter fileWriter = null;
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            fileWriter = new FileWriter("A:\\PythonPyCharm\\JavaProjects\\GB_Java\\src\\HW_2\\filesInText.txt", false);
            fileWriter.write(allFiles.toString());
            fileWriter.flush();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("Файл записан");
    }
}

