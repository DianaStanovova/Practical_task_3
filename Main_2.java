

package mirea.com.kt.main_2;

/**
 *
 * @author Диана
 */

import java.util.Locale;
import java.util.Scanner;
public class Main_2 {
    public static void main(String[] args) {
        System.out.println("Практическое задание №3. Вариант 2. Студент: Становова Д.А. Группа РИБО-03-21");
        Seller seller = new Seller();
        Smartphone smartphone = new Smartphone(false, 7, "Android", "Nokia");
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        System.out.println("Введите состояние телефона (true/false): ");
        boolean state = scanner.nextBoolean();
        System.out.println("Введите диагональ дисплея телефона: ");
        scanner = new Scanner(System.in);
        double diagonal = scanner.nextDouble();
        System.out.println("Введите операционную систему телефона");
        scanner = new Scanner(System.in);
        String OS = scanner.nextLine();
        System.out.println("Введите модель телефона: ");
        String model = scanner.nextLine();

        TouchTone touchTone = new TouchTone(state, diagonal, OS, model);
        touchTone.call("8-906-714-80-49");
        touchTone.blockTelephone();
        System.out.println(touchTone.sendSms("Я люблю Mirea"));
        touchTone.unblockTelephone();

        System.out.println(smartphone);
        seller.modify(smartphone);
        System.out.println(smartphone);
    }
}
   

