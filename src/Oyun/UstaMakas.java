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

    public UstaMakas(double dayaniklilik, int seviyePuani, double howMuch) {
        super(dayaniklilik, seviyePuani, howMuch);
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

    public double durumGuncelle() {
         setDayaniklilik(getDayaniklilik()-howMuch);
        return getDayaniklilik();
    }
}
