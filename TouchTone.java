
package mirea.com.kt.main_2;


import java.util.Scanner;

public class TouchTone extends Telephone {

    public TouchTone(boolean telephoneState, double displayDiagonal, String OS, String model){
        this.displayDiagonal = displayDiagonal;
        this.telephoneState = telephoneState;
        this.OS = OS;
        this.model = model;
    }


    @Override
    void call(String number) {
        System.out.printf("Набираем номер с помощью клавиш. Идет звонок по номеру %s\n", number);
    }

    @Override
    void blockTelephone() {
        if (!telephoneState) System.out.println("Телефон уже выключен.");
        else{
            System.out.println("Выключаем кнопочный телефон.");
            telephoneState = false;
        }
    }

    @Override
    void unblockTelephone() {
        if (!telephoneState){
            System.out.println("Включаем кнопочный телефон.");
            telephoneState = true;
        }
        else System.out.println("Телефон уже включен.");
    }

    @Override
    String sendSms(String sms) {
        System.out.print("Введите номер с помощью клавиш: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        return "Сообщение: '" + sms + "' было отправлено на номер " + number;
    }

    @Override
    public String toString() {
        return "Состояние телефона: " + telephoneState + ", диагональ дисплея кнопочного телефона: " + displayDiagonal + ", операционная система: " + OS;
    }
}

