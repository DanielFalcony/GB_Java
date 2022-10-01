//В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида •
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59 •
// "Добрый день, <Имя>!", если время от 12:00 до 17:59; •
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59; •
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

package HW_1;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Как вас зовут?: ");
        String UserName = iScanner.nextLine();
        LocalTime curTime = LocalTime.now().truncatedTo(ChronoUnit.MINUTES);
        int time = curTime.getHour();
        if (time >= 5 & time < 12){
            System.out.printf("Доброе утро, %s, сейчас время %s!", UserName, curTime);
        } else if (time >= 12 & time < 18) {
            System.out.printf("Добрый день, %s, сейчас время %s!", UserName, curTime);
        } else if (time >= 18 & time < 22) {
            System.out.printf("Добрый вечер, %s, сейчас время %s!", UserName, curTime);
        } else
            System.out.printf("Доброй ночи, %s, сейчас время %s!", UserName, curTime);
        iScanner.close();
    }

}
