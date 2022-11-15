/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oyun;

/**
 *
 * @author mustafa
 */
public class Tas extends Nesneler {

    private String name = "tas";

    public String getName() {
        return name;
    }

    Kagit kagit = new Kagit();
    OzelKagit ozelKagit = new OzelKagit();
    Makas makas = new Makas();
    UstaMakas ustaMakas = new UstaMakas();

    public Tas(double dayaniklilik, int seviyePuani, double howMuch) {
        super(dayaniklilik, seviyePuani, howMuch);

    }

    public Tas() {
    }
    private int katilik = 2;

    public int getKatilik() {
        return katilik;
    }

    public void setKatilik(int katilik) {
        this.katilik = katilik;
    }

    double nesnePuaniGoster(int kontrol) {
        if (kontrol == 1) {
            return getSeviyePuani();
        } else {
            return getDayaniklilik();
        }

    }

    public double etkiHesapla() {

        return katilik;
    }

    public double durumGuncelle() {
        //setDayaniklilik(getDayaniklilik() - howMuch);
        return getDayaniklilik();
    }

}
