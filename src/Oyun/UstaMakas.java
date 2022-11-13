/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oyun;

/**
 *
 * @author mustafa
 */
public class UstaMakas extends Makas {

    public UstaMakas(int dayaniklilik, int seviyePuani, int keskinlik) {
        super(dayaniklilik, seviyePuani);
    }

    public UstaMakas() {
    }
    private int direnc = 2;

    public int getDirenc() {
        return direnc;
    }

    public void setDirenc(int direnc) {
        this.direnc = direnc;
    }

    private int nesnePuaniGoster() {
        return 0;
    }

    public double etkiHesapla() {
        return getKeskinlik() * direnc;
    }

    private void durumGuncelle(double dayaniklilikGuncel, int seviyeGuncel) {

    }
}
