/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oyun;

/**
 *
 * @author mustafa
 */
public class Makas extends Nesneler {
    private String name ="makas";

    public String getName() {
        return name;
    }
    public Makas(double dayaniklilik, int seviyePuani, double howMuch) {
        super(dayaniklilik, seviyePuani, howMuch);
    }
   

    public Makas() {
    }
    private int keskinlik = 2;

    public int getKeskinlik() {
        return keskinlik;
    }

    public void setKeskinlik(int keskinlik) {
        this.keskinlik = keskinlik;
    }

    private double nesnePuaniGoster() {
        return 0;
    }

    public double etkiHesapla() {
        return keskinlik;
    }

    public double durumGuncelle() {
         setDayaniklilik(getDayaniklilik()-howMuch);
        return getDayaniklilik();
    }
}
