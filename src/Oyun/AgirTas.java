/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oyun;

/**
 *
 * @author mustafa
 */
public class AgirTas extends Tas {

    private String name = "tas";

    public String getName() {
        return name;
    }

    public AgirTas(double dayaniklilik, int seviyePuani, double howMuch) {
        super(dayaniklilik, seviyePuani, howMuch);
    }

    public AgirTas() {
    }
    private int sicaklik = 2;

    public int getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(int sicaklik) {
        this.sicaklik = sicaklik;
    }

    double nesnePuaniGoster(int kontrol) {
        if (kontrol == 1) {
            return getSeviyePuani();
        } else {
            return getDayaniklilik();
        }

    }

    public double etkiHesapla() {
        return sicaklik * getKatilik();
    }

    public double durumGuncelle() {
        //setDayaniklilik(getDayaniklilik() - howMuch);
        return getDayaniklilik();
    }

}
