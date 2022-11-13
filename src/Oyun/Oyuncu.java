/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oyun;

import java.util.Random;

/**
 *
 * @author mustafa
 */
public class Oyuncu {

    Random random = new Random();
    private String oyuncuAdi;
    private int OyuncuID = random.nextInt(10);

    public int getOyuncuID() {
        return OyuncuID;
    }

    public void setOyuncuID(int OyuncuID) {

        this.OyuncuID = OyuncuID;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }
    private int skor;

    public String getOyuncuAdi() {

        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        // System.out.println(oyuncuAdi);
        // System.out.println(OyuncuID);
        this.oyuncuAdi = oyuncuAdi;
    }

    public Oyuncu(String oyuncuAdi, int skor) {
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;

    }

    Oyuncu() {

    }

}
