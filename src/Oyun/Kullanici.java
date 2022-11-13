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
public class Kullanici extends Oyuncu {

    Random random = new Random();

    public Kullanici(String oyuncuAdi, int skor) {
        super(oyuncuAdi, skor);
        setOyuncuID(random.nextInt(10));
        super.getOyuncuAdi();

        System.out.println(super.getOyuncuAdi());
        System.out.println(oyuncuAdi);
        System.out.println(getOyuncuID());

    }

    Kullanici() {

    }

}
