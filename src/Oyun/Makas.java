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

    public Makas(int dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);
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

    private int durumGuncelle() {
        return 0;
    }
}
