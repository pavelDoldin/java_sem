package sem_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task_4 {
    public static void main(String[] args) {
        String s = "TEST ";
        int n = 100;
        ex0(s, n);
    }
    static void ex0(String s, int n){
        /*
        Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
        который запишет эту строку в простой текстовый файл, обработайте исключения.
         */
        String filePath = "/f/f/ftext.txt";
        String s1 = repeatString(s, n);
        writeToFile(s1, filePath);
    }
    static String repeatString(String s, int n){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
    static void writeToFile(String s, String filePath){
        try {
            Logger logger = Logger.getAnonymousLogger();
            FileHandler fh = new FileHandler("log.txt", true);
            logger.addHandler(fh);
            try (FileWriter writer = new FileWriter(filePath, false)) {
                writer.write(s);
                writer.flush();
                logger.log(Level.INFO, "Записанно успешно !");
            } catch (Exception e) {
                e.printStackTrace();
                logger.log(Level.WARNING, e.getMessage());
            }
            fh.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}






















