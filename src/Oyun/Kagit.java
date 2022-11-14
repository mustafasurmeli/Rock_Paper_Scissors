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

    private String name ="kagit";

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

    private int nesnePuaniGoster() {
        return 0;
    }

    public double etkiHesapla() {
        return nufuz;
    }

    public double durumGuncelle() {
         setDayaniklilik(getDayaniklilik()-howMuch);
        return getDayaniklilik();
    }
}
