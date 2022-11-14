/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oyun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author mustafa
 */
public class Oyun {
    int ran=0;
    int progressS;
    public static String ad;
    ArrayList<Nesneler> objects = new ArrayList<>();
    static ArrayList<Nesneler> bilgisayarObjeleri = new ArrayList<>();
    ArrayList<Integer> bindex = new ArrayList<Integer>();
    static ArrayList<String> bilgisayarHamleler = new ArrayList<>();
    int index;
    double bilgisayarskor = 0,skor=0;
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
    String nesne2 = "";
    double nesne2Etki = 1;
    boolean c = false, d = false, e = false;

    public static void main(String[] args) {
        Bilgisayar bilgisayar1 = new Bilgisayar();
        Frame frame = new  Frame();
        bilgisayar1.Secim();
        System.out.println(bilgisayar1.bilObjects);
        bilgisayarObjeleri = bilgisayar1.bilObjects;
        //Kullanici kullanici = new Kullanici(ad, skor);
        bilgisayarHamleler = bilgisayar1.randomhamle;
        

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
        /*int bNesne0=0,bNesne1=0,bNesne2=0,bNesne3=0,bNesne4=0,sayac=0;    
      if(sayac==0||sayac==5){
       sayac=0;   
       bindex.add(0);
       bindex.add(1);
       bindex.add(2);
       bindex.add(3);
       bindex.add(4);
      }
        int temp=random.nextInt(bindex.size());
       switch(bindex.get(temp)){
           case 0:
               bNesne0++;
               sayac++;
               System.out.println("--------------------------------------------------------------------------------"+objects);
               System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+bilgisayar.bilObjects);
               nesne2Etki=bilgisayar.bilObjects.get(bindex.get(0)).etkiHesapla();
               bindex.remove(0);
               break;
           case 1:
               bNesne1++;
               sayac++;
               System.out.println("--------------------------------------------------------------------------------"+objects);
               System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+bilgisayar.bilObjects);
               nesne2Etki=bilgisayar.bilObjects.get(bindex.get(1)).etkiHesapla();
               bindex.remove(1);
                break;
           case 2:
               bNesne2++;
               sayac++;
               System.out.println("--------------------------------------------------------------------------------"+objects);
               System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+bilgisayar.bilObjects);
               nesne2Etki=bilgisayar.bilObjects.get(bindex.get(2)).etkiHesapla();
               bindex.remove(2);
                break;
           case 3:
               bNesne3++;
               sayac++;
               System.out.println("--------------------------------------------------------------------------------"+objects);
               System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+bilgisayar.bilObjects);
               nesne2Etki=bilgisayar.bilObjects.get(bindex.get(3)).etkiHesapla();
               bindex.remove(3);
                break;
           case 4:
               bNesne4++;
               sayac++;
               nesne2Etki=bilgisayar.bilObjects.get(bindex.get(4)).etkiHesapla();
               bindex.remove(4);
               break;
       }*/
       
        nesne2 = bilgisayarHamleler.get(sayac);
        System.out.println(getBilObjectsToPrint());
        System.out.println("musti" + objects+"///");      
        //int ran = random.nextInt(4);
       System.out.println(bilgisayarObjeleri.get(ran).getName());
        nesne2Etki = bilgisayarObjeleri.get(ran).etkiHesapla();
        nesne1Etki = objects.get(index).etkiHesapla();
        System.out.println(nesne1 + bilgisayarObjeleri.get(ran).getName());
        
        int seviyeGuncel=0;
        double temp;
        if ((nesne1 == "tas" && bilgisayarObjeleri.get(ran).getName()== "makas") || (nesne1 == "kagit" && bilgisayarObjeleri.get(ran).getName() == "tas") || (nesne1 == "makas" && bilgisayarObjeleri.get(ran).getName() == "kagit")) {
            temp = nesne1Etki;
            nesne1Etki /= (a * nesne2Etki);
            nesne2Etki /= ((1-a) * temp);
            seviyeGuncel=objects.get(index).getSeviyePuani();
            seviyeGuncel +=20;
            objects.get(index).setSeviyePuani(seviyeGuncel);
            if(seviyeGuncel>=30){
                if(nesne1.equals("tas")){
                    double dayanikliliktemp =objects.get(index).getDayaniklilik();
                    int seviyetemp=objects.get(index).getSeviyePuani();
                    objects.set(index,agirTas);
                    objects.get(index).setSeviyePuani(seviyetemp);
                    objects.get(index).setDayaniklilik(dayanikliliktemp);
                    System.out.println("********************");
                    System.out.println(objects.get(index).getName());
                }else if(nesne1.equals("kagit")){
                    double dayanikliliktemp =objects.get(index).getDayaniklilik();
                    int seviyetemp=objects.get(index).getSeviyePuani();
                    objects.set(index,ozelKagit);
                    objects.get(index).setSeviyePuani(seviyetemp);
                    objects.get(index).setDayaniklilik(dayanikliliktemp);
                    System.out.println("********************");
                    System.out.println(objects.get(index).getName());
                }else if(nesne1.equals("makas")){
                    double dayanikliliktemp =objects.get(index).getDayaniklilik();
                    int seviyetemp=objects.get(index).getSeviyePuani();
                    objects.set(index,ustaMakas);
                    objects.get(index).setSeviyePuani(seviyetemp);
                    objects.get(index).setDayaniklilik(dayanikliliktemp);
                    System.out.println("********************");
                    System.out.println(objects.get(index).getName());
                }
                    
            }
        } else if ((nesne1 == "tas" &&bilgisayarObjeleri.get(ran).getName() == "kagit") || (nesne1 == "kagit" && bilgisayarObjeleri.get(ran).getName() == "makas") || (nesne1 == "makas" &&bilgisayarObjeleri.get(ran).getName() == "tas")) {
            temp = nesne1Etki;
            nesne1Etki /= ((1-a) * nesne2Etki);
            nesne2Etki /= (a * temp);
             seviyeGuncel=bilgisayarObjeleri.get(ran).getSeviyePuani();
            seviyeGuncel += 20;
            bilgisayarObjeleri.get(ran).setSeviyePuani(seviyeGuncel);
            if(seviyeGuncel>=30){
                if(bilgisayarObjeleri.get(ran).getName().equals("tas")){
                    double dayanikliliktemp =bilgisayarObjeleri.get(ran).getDayaniklilik();
                    int seviyetemp=bilgisayarObjeleri.get(index).getSeviyePuani();
                    bilgisayarObjeleri.set(ran,agirTas);
                    bilgisayarObjeleri.get(ran).setSeviyePuani(seviyetemp);
                    bilgisayarObjeleri.get(ran).setDayaniklilik(dayanikliliktemp);
                    System.out.println("********************");
                    System.out.println(bilgisayarObjeleri.get(ran).getName());
                }else if(bilgisayarObjeleri.get(ran).getName().equals("kagit")){
                    double dayanikliliktemp =bilgisayarObjeleri.get(ran).getDayaniklilik();
                    int seviyetemp=bilgisayarObjeleri.get(ran).getSeviyePuani();
                    bilgisayarObjeleri.set(ran,ozelKagit);
                    bilgisayarObjeleri.get(ran).setSeviyePuani(seviyetemp);
                    bilgisayarObjeleri.get(ran).setDayaniklilik(dayanikliliktemp);
                    System.out.println("********************");
                    System.out.println(bilgisayarObjeleri.get(ran).getName());
                }else if(bilgisayarObjeleri.get(ran).getName().equals("makas")){
                    double dayanikliliktemp =bilgisayarObjeleri.get(ran).getDayaniklilik();
                    int seviyetemp=bilgisayarObjeleri.get(ran).getSeviyePuani();
                    bilgisayarObjeleri.set(ran,ustaMakas);
                    bilgisayarObjeleri.get(ran).setSeviyePuani(seviyetemp);
                    bilgisayarObjeleri.get(ran).setDayaniklilik(dayanikliliktemp);
                    System.out.println("********************");
                    System.out.println(bilgisayarObjeleri.get(ran).getName());
                }
                    
            }
        } else if ((nesne1 == "tas" && bilgisayarObjeleri.get(ran).getName()== "tas") || (nesne1 == "kagit" && bilgisayarObjeleri.get(ran).getName() == "kagit") || (nesne1 == "makas" &&bilgisayarObjeleri.get(ran).getName() == "makas")) {
            temp = nesne1Etki;
            nesne1Etki /= (a * nesne2Etki);
            nesne2Etki /= (a * temp);
        }
       
        objects.get(index).howMuch=nesne2Etki;
        bilgisayarObjeleri.get(ran).howMuch=nesne1Etki;
        System.out.println(bilgisayarObjeleri.get(ran).durumGuncelle());
        System.out.println(objects.get(index).durumGuncelle());
        
   
        
        System.out.println(objects.get(index).getSeviyePuani());
        System.out.println(bilgisayarObjeleri.get(ran).getSeviyePuani());
        progressS=objects.get(index).getSeviyePuani();
        System.out.println("+++" + nesne1Etki);
        System.out.println("1." + nesne1Etki + "--" + "2." + nesne2Etki);
        System.out.println(sayac+"er");
        ///bilgisayar.Goster();
        //KullaniciJFrame kullaniciJFrame = new KullaniciJFrame();
        
        ran++;
        if(ran==5){
            ran=0;
        }
        sayac++;
    }
   
    void skorhesapla(){
        for (int i = 0; i < 5; i++) {
            bilgisayarskor += bilgisayarObjeleri.get(i).getDayaniklilik();
            skor +=objects.get(i).getDayaniklilik();
        }
    }

    void check() {
        System.out.println(objects);
    }
    
        public String getBilObjectsToPrint() {
        String output="";
        for (int i = 0; i < bilgisayarObjeleri.size(); i++) {
            output+=bilgisayarObjeleri.get(i).getClass().getName() +" ";
        }
        return output;
    }
}
