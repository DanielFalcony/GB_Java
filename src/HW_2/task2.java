package HW_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        StringBuilder allFiles = new StringBuilder();
        String[] path;
        File filePath = new File("A:\\PythonPyCharm\\JavaProjects\\GB_Java\\src\\HW_2\\test_folder");
        path = filePath.list();
        assert path != null;
        for (String pathname : path) {
            allFiles.append(pathname).append(" ");
        }
        // как сделать перебор списка (строка), найти точку и вырезать значение?
    }
}