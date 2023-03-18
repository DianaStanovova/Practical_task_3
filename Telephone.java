/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mirea.com.kt.main_2;

/**
 *
 * @author Админ
 */
abstract public class Telephone {
    protected boolean telephoneState;
    protected double displayDiagonal;
    protected String OS;
    protected String model;

    abstract void call(String number);
    abstract void blockTelephone();
    abstract void unblockTelephone();
    abstract String sendSms(String sms);

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
