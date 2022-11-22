/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oyun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.logging.*;


/**
 * @author mustafa
 */
public class Oyun {
    public static Logger logger = Logger.getLogger("Rock Paper Scissors Log");
    double dayanguı;
    int seviyeguı;
    String tempName;
    String classgui,oyunSonu;
    int ran = 0;
    int progressS;
    public static String ad;
    ArrayList<Nesneler> objects = new ArrayList<>();
    static ArrayList<Nesneler> bilgisayarObjeleri = new ArrayList<>();
    ArrayList<Integer> bindex = new ArrayList<Integer>();
    static ArrayList<String> bilgisayarHamleler = new ArrayList<>();
    int index;
     static int saydir=0;
    double bilgisayarskor = 0, skor = 0;
    //Bilgisayar bilgisayar = new Bilgisayar("Bİlgisayar", skor);
    Random random = new Random();
    Tas tas = new Tas();
    Bilgisayar bilgisayar = new Bilgisayar();
    int sayac = 0;
    AgirTas agirTas = new AgirTas();
    Kagit kagit = new Kagit();
    OzelKagit ozelKagit = new OzelKagit();
    Makas makas = new Makas();
    UstaMakas ustaMakas = new UstaMakas();
    double a = 0.2;
    String nesne1 = "";
    double nesne1Etki = 1;

    double nesne2Etki = 1;
    boolean c = false, d = false, e = false;

    public static void main(String[] args) {
        init();
        Bilgisayar bilgisayar1 = new Bilgisayar();
        Frame frame = new Frame();
        frame.setVisible(true);
        bilgisayar1.setOyuncuAdi("BILGISAYAR2");
        bilgisayar1.nesneSec();
        System.out.println(bilgisayar1.bilObjects);
        bilgisayarObjeleri = bilgisayar1.bilObjects;
        for (int i = 0; i < bilgisayarObjeleri.size(); i++) {
            logger.info(bilgisayar1.getOyuncuAdi()+" "+bilgisayarObjeleri.get(i).getName()+" nesnesi oluşturdu");
        }
        //Kullanici kullanici = new Kullanici(ad, skor);
        bilgisayarHamleler = bilgisayar1.randomhamle;
        saydir=bilgisayarObjeleri.size();

        /*   
            nesne1      nesne2
            Taş         Taş               berabere              a       a
            Taş         Kağıt       kaybeden     kazanan        a       1-a
            Taş         Makas       kazanan      kaybeden       1-a     a
            Kağıt       Taş         kazanan      kaybeden       1-a     a
            Kağıt       Kağıt             berabere              a       a
            Kağıt       Makas       kaybeden     kazanan        a       1-a
            Makas       Taş         kaybeden     kazanan        a       1-a
            Makas       Kağıt       kazanan      kaybeden       1-a     a
            Makas       Makas             berabere              a       a
           
         */
    }

    void kontrol() {
        logger.info("///////////////////////El BAŞI//////////////////////////");
        saydir=bilgisayarObjeleri.size()-1;
        if(bilgisayarObjeleri.size()==0){
            System.out.println("KAZANAN: OYUNCU1");
        }if (objects.size()==0){
            System.out.println("KAZANAN: OYUNCU2");
        }else{

            if (bilgisayarObjeleri.size()!=0)
            nesne2Etki = bilgisayarObjeleri.get(ran).etkiHesapla();
            if (objects.size()!=0)
            nesne1Etki = objects.get(index).etkiHesapla();

            int seviyeGuncel = 0;
            double temp;
            if ((nesne1 == "tas" && bilgisayarObjeleri.get(ran).getName() == "makas") || (nesne1 == "kagit" && bilgisayarObjeleri.get(ran).getName() == "tas") || (nesne1 == "makas" && bilgisayarObjeleri.get(ran).getName() == "kagit")) {
                temp = nesne1Etki;
                nesne1Etki /= (a * nesne2Etki);
                logger.info("1.oyuncunun etkisi:" + nesne1Etki);
                nesne2Etki /= ((1 - a) * temp);
                logger.info("2.oyuncunun etki puanı:" + nesne2Etki);
                seviyeGuncel = objects.get(index).getSeviyePuani();
                seviyeGuncel += 20;

                objects.get(index).setSeviyePuani(seviyeGuncel);
                logger.info("Bu eli 1.oyuncu kazandı.");
                logger.info(objects.get(index).getName() + " nesnesinin seviye puanı:" + objects.get(index).getSeviyePuani());
                if (seviyeGuncel == 40) {
                    if (nesne1.equals("tas")) {
                        double dayanikliliktemp = objects.get(index).getDayaniklilik();
                        int seviyetemp = objects.get(index).getSeviyePuani();
                        objects.set(index, agirTas);
                        objects.get(index).setSeviyePuani(seviyetemp);
                        objects.get(index).setDayaniklilik(dayanikliliktemp);
                        logger.info("Taş nesnesi Ağır Taşa Dönüştü.");

                    } else if (nesne1.equals("kagit")) {
                        double dayanikliliktemp = objects.get(index).getDayaniklilik();
                        int seviyetemp = objects.get(index).getSeviyePuani();
                        objects.set(index, ozelKagit);
                        objects.get(index).setSeviyePuani(seviyetemp);
                        objects.get(index).setDayaniklilik(dayanikliliktemp);
                        logger.info("Kağıt nesnesi Özel Kağıda dönüştü");

                    } else if (nesne1.equals("makas")) {
                        double dayanikliliktemp = objects.get(index).getDayaniklilik();
                        int seviyetemp = objects.get(index).getSeviyePuani();
                        objects.set(index, ustaMakas);
                        objects.get(index).setSeviyePuani(seviyetemp);
                        objects.get(index).setDayaniklilik(dayanikliliktemp);
                        logger.info("Makas nesnesi Usta Makasa dönüştü");

                    }

                }
            } else if ((nesne1 == "tas" && bilgisayarObjeleri.get(ran).getName() == "kagit") || (nesne1 == "kagit" && bilgisayarObjeleri.get(ran).getName() == "makas") || (nesne1 == "makas" && bilgisayarObjeleri.get(ran).getName() == "tas")) {
                temp = nesne1Etki;
                nesne1Etki /= ((1 - a) * nesne2Etki);
                logger.info("1.oyuncunun etkisi:" + nesne1Etki);
                nesne2Etki /= (a * temp);
                logger.info("2.oyuncunun etki puanı:" + nesne2Etki);
                seviyeGuncel = bilgisayarObjeleri.get(ran).getSeviyePuani();
                seviyeGuncel += 20;
                seviyeguı = seviyeGuncel;
                bilgisayarObjeleri.get(ran).setSeviyePuani(seviyeGuncel);
                logger.info("Bu eli 2.oyuncu kazandı.");
                logger.info(bilgisayarObjeleri.get(ran).getName() + " nesnesinin seviye puanı:" + objects.get(index).getSeviyePuani());
                if (seviyeGuncel == 40) {
                    if (bilgisayarObjeleri.get(ran).getName().equals("tas")) {
                        double dayanikliliktemp = bilgisayarObjeleri.get(ran).getDayaniklilik();
                        int seviyetemp = bilgisayarObjeleri.get(ran).getSeviyePuani();
                        bilgisayarObjeleri.set(ran, agirTas);
                        bilgisayarObjeleri.get(ran).setSeviyePuani(seviyetemp);
                        bilgisayarObjeleri.get(ran).setDayaniklilik(dayanikliliktemp);
                        logger.info("Taş nesnesi Ağır Taşa dönüştü.");

                    } else if (bilgisayarObjeleri.get(ran).getName().equals("kagit")) {
                        double dayanikliliktemp = bilgisayarObjeleri.get(ran).getDayaniklilik();
                        int seviyetemp = bilgisayarObjeleri.get(ran).getSeviyePuani();
                        bilgisayarObjeleri.set(ran, ozelKagit);
                        bilgisayarObjeleri.get(ran).setSeviyePuani(seviyetemp);
                        bilgisayarObjeleri.get(ran).setDayaniklilik(dayanikliliktemp);
                        logger.info("Kağıt nesnesi Özel Kağıda dönüştü ");

                    } else if (bilgisayarObjeleri.get(ran).getName().equals("makas")) {
                        double dayanikliliktemp = bilgisayarObjeleri.get(ran).getDayaniklilik();
                        int seviyetemp = bilgisayarObjeleri.get(ran).getSeviyePuani();
                        bilgisayarObjeleri.set(ran, ustaMakas);
                        bilgisayarObjeleri.get(ran).setSeviyePuani(seviyetemp);
                        bilgisayarObjeleri.get(ran).setDayaniklilik(dayanikliliktemp);
                        logger.info("Makas nesnesi Usta Makasa dönüştü.");

                    }

                }
            } else if ((nesne1 == "tas" && bilgisayarObjeleri.get(ran).getName() == "tas") || (nesne1 == "kagit" && bilgisayarObjeleri.get(ran).getName() == "kagit") || (nesne1 == "makas" && bilgisayarObjeleri.get(ran).getName() == "makas")) {
                temp = nesne1Etki;
                nesne1Etki /= (a * nesne2Etki);
                logger.info("1.oyuncunun etkisi:" + nesne1Etki);
                nesne2Etki /= (a * temp);
                logger.info("2.oyuncunun etki puanı:" + nesne2Etki);
                logger.info("Bu el berabere.");
            }

            objects.get(index).howMuch = nesne2Etki;
            bilgisayarObjeleri.get(ran).howMuch = nesne1Etki;
            objects.get(index).setDayaniklilik(objects.get(index).getDayaniklilik() - nesne2Etki);
            bilgisayarObjeleri.get(ran).setDayaniklilik(bilgisayarObjeleri.get(ran).getDayaniklilik() - nesne1Etki);
            System.out.println(objects.get(index).howMuch);
            System.out.println(bilgisayarObjeleri.get(ran).howMuch);
            dayanguı = bilgisayarObjeleri.get(ran).getDayaniklilik();

            classgui = bilgisayarObjeleri.get(ran).getClass().getName();

            progressS = objects.get(index).getSeviyePuani();
            logger.info("1.oyuncunun " + objects.get(index).getName() + " nesnesinin dayanıklılığı: " + objects.get(index).getDayaniklilik());
            logger.info("2.oyuncunun " + bilgisayarObjeleri.get(ran).getName() + " nesnesinin dayanıklılığı: " + bilgisayarObjeleri.get(ran).getDayaniklilik());

            System.out.println("111111111111111111111111111111111111111111");

            oyunSonu = bilgisayar.getOyuncuAdi() + "adlı oyuncunun nesneleri tükendi.";


           /* if (ran >= saydir && bilgisayarObjeleri.size() != 0) {

                Collections.shuffle(bilgisayarObjeleri);
                sayac = 0;
                ran = 0;

            }
            if (bilgisayarObjeleri.get(ran).getDayaniklilik() <= 0) {
                sayac++;
                bilgisayarObjeleri.remove(ran);
            }*/
            System.out.println(bilgisayarObjeleri);
            System.out.println("///////////////////////////////////////////////////////////");
            for (int i = 0; i < bilgisayarObjeleri.size(); i++) {
                System.out.println(bilgisayarObjeleri.get(i).getDayaniklilik());
            }
            System.out.println("///////////////////////////////////////////////////////////");


        /*if(objects.get(index).getDayaniklilik()<=0){
            objects.remove(index);
        }
        if(bilgisayarObjeleri.get(ran).getDayaniklilik()<=0){
            bilgisayarObjeleri.remove(ran);
        }*/

            logger.info("///////////////////////El SONU//////////////////////////");
        }
    }

    void skorhesapla() {
        for (int i = 0; i < bilgisayarObjeleri.size(); i++) {
            bilgisayarskor += bilgisayarObjeleri.get(i).getDayaniklilik();
        }
        for (int i = 0; i < objects.size(); i++) {
            skor += objects.get(i).getDayaniklilik();
        }
        System.out.println(bilgisayarskor);
        System.out.println(skor);

    }

    void check() {
        System.out.println(objects);
    }

    public String getBilObjectsToPrint() {
        String output = "";
        for (int i = 0; i < bilgisayarObjeleri.size(); i++) {
            output += bilgisayarObjeleri.get(i).getClass().getName() + " ";
        }
        return output;
    }
    public static void init(){
        FileHandler fh;
        try{
            fh = new FileHandler("./tasKagitMakas.log");

            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            logger.info("Logger Initialized");
        }catch(Exception e){
            logger.log(Level.WARNING,"Exception ::",e);
        }
    }

}
