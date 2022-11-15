/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oyun;

/**
 *
 * @author mustafa
 */
public class Kagit extends Nesneler {

    private String name = "kagit";

    public String getName() {
        return name;
    }

    public Kagit() {
    }
    private int nufuz = 2;

    public int getNufuz() {
        return nufuz;
    }

    public void setNufuz(int nufuz) {
        this.nufuz = nufuz;
    }

    double nesnePuaniGoster(int kontrol) {
        if (kontrol == 1) {
            return getSeviyePuani();
        } else {
            return getDayaniklilik();
        }

    }

    public double etkiHesapla() {
        return nufuz;
    }

    public double durumGuncelle() {
        //setDayaniklilik(getDayaniklilik() - howMuch);
        return getDayaniklilik();
    }
}
