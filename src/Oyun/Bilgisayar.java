/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oyun;

import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author mustafa
 */
public class Bilgisayar extends Oyuncu {

    Random random = new Random();

    /*Nesneler nesneler = new Nesneler() {
        @Override
        public double etkiHesapla() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };*/
    String[] baslangicNesne = {"tas", "kagit", "makas"};
    private String KarsilasmaNesnesi;
    ArrayList<Nesneler> bilObjects = new ArrayList<>();
    ArrayList<String> nesneSecim = new ArrayList<String>();
    ArrayList<String> randomhamle = new ArrayList<>();

    public Bilgisayar() {
        setOyuncuID(random.nextInt(10));
        setOyuncuAdi("BILGISAYAR");
        /* System.out.println(getOyuncuAdi());
        System.out.println(getOyuncuID());*/
    }

    public Bilgisayar(String oyuncuAdi, int skor) {
        super(oyuncuAdi, skor);

        setOyuncuID(random.nextInt(10));
        super.setOyuncuAdi("BILGISAYAR");
        /*System.out.println(getOyuncuAdi());
        System.out.println(getOyuncuID());*/
    }

    void nesneSec() {

        for (int i = 0; i < 5; i++) {
            nesneSecim.add(baslangicNesne[random.nextInt(baslangicNesne.length)]);
        }
        for (int i = 0; i < nesneSecim.size(); i++) {
            System.out.println(nesneSecim.get(i));
        }
        for (int i = 0; i < 5; i++) {
            int t = random.nextInt(nesneSecim.size());
            KarsilasmaNesnesi = nesneSecim.get(t);
            if (KarsilasmaNesnesi == "tas") {
                randomhamle.add(KarsilasmaNesnesi);
                bilObjects.add(new Tas());
            } else if (KarsilasmaNesnesi == "kagit") {
                randomhamle.add(KarsilasmaNesnesi);
                bilObjects.add(new Kagit());
            } else if (KarsilasmaNesnesi == "makas") {
                randomhamle.add(KarsilasmaNesnesi);
                bilObjects.add(new Makas());
            }
            nesneSecim.remove(t);
        }
    }

    public String getKarsilasmaNesnesi() {
        return KarsilasmaNesnesi;
    }

    public void setKarsilasmaNesnesi(String KarsilasmaNesnesi) {
        this.KarsilasmaNesnesi = KarsilasmaNesnesi;
    }

}
