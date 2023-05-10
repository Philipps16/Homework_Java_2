package Homework_Java_2;
import java.util.Arrays;
import java.io.IOException;
import java.util.logging.*;
public class Task02 {
    public static void main(String[] args) {
        int [] array1 = {11, 3, 14, 16, 7};
 
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array1.length-1; i++) {
                if(array1[i] > array1[i+1]){
                    isSorted = false;
 
                    buf = array1[i];
                    array1[i] = array1[i+1];
                    array1[i+1] = buf;
                }
            }
            
        }
        System.out.println(Arrays.toString(array1));
    }
    public class Logger1 {
        public static void main(String[] args) {
            try {
                // создаем логгер с именем Loggers
                Logger logger = Logger.getLogger(Logger1.class.getName());
                // объявляем хендлер, чтобы сделать запись в файл
                FileHandler fh = new FileHandler("logger.log"); 
                // связываем хендлер и логгер между собой
                logger.addHandler(fh);
                SimpleFormatter sFormat = new SimpleFormatter();
                fh.setFormatter(sFormat);
                // нужно, чтобы была запись только в файл, без вывода в терминал
                logger.setUseParentHandlers(false);
                // записываем в лог файл
                logger.log(Level.INFO, "Начало логирования");
            } catch(IOException ex) {
                ex.printStackTrace();
            }
            
        }
    }
}
