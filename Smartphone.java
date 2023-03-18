
package mirea.com.kt.main_2;


import java.util.Scanner;

public class Smartphone extends Telephone{
    public Smartphone(boolean telephoneState, double displayDiagonal, String OS, String model) {
        this.displayDiagonal = displayDiagonal;
        this.telephoneState = telephoneState;
        this.OS = OS;
        this.model = model;
    }

    @Override
    void call(String number) {
        System.out.printf("Выберите нужный контакт из списка контактов, идет звонок по номеру %s...\n", number);
    }

    @Override
    void blockTelephone() {
        if (!telephoneState) System.out.println("Смартфон уже выключен.");
        else{
            System.out.println("Выключаем сенсорный телефон.");
            telephoneState = false;
        }
    }

    @Override
    void unblockTelephone() {
        if (!telephoneState){
            System.out.println("Включаем сенсорный телефон.");
            telephoneState = true;
        }
        else System.out.println("Смартфон уже включен.");
    }

    @Override
    String sendSms(String sms) {
        System.out.println("Введите сообщение с помощью экранной клавиатуры: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        return "Сообщение: '" + sms + "' было отправлено на номер " + number;
    }

    @Override
    public String toString() {
        return "Состояние телефона: " + telephoneState + ", диагональ дисплея смартфона: "
                + displayDiagonal + ", операционная система: " + OS + ", модель телефона: " + model;
    }
}
