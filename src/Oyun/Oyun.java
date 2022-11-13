/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oyun;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mustafa
 */
public class Oyun {
     public static String ad; 
      ArrayList<Nesneler>objects=new ArrayList<>();
     static ArrayList<Nesneler>bilgisayarObjeleri=new ArrayList<>();
        ArrayList<Integer>bindex = new ArrayList<Integer>();
        static ArrayList<String>bilgisayarHamleler= new ArrayList<>();
       int index;
       int skor=8;
       //Bilgisayar bilgisayar = new Bilgisayar("Bİlgisayar", skor);
       Random random = new Random();
       Tas tas = new Tas();
        Bilgisayar bilgisayar = new Bilgisayar();
       int sayac=0; 
       AgirTas agirTas = new AgirTas();
       Kagit kagit = new Kagit();
       OzelKagit ozelKagit = new OzelKagit();
       Makas makas = new Makas();
       UstaMakas ustaMakas = new UstaMakas();
       double a= 0.2; 
        String nesne1="";
       double nesne1Etki=1;
       String nesne2="";
       double nesne2Etki=1;
      boolean c=false,d=false,e=false;
       
    public static void main(String[] args){
      Bilgisayar bilgisayar1 = new Bilgisayar();  
      Frame frame = new Frame();
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
       void kontrol(){
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
       nesne2=bilgisayarHamleler.get(sayac);
           System.out.println(bilgisayarObjeleri);
           System.out.println("musti"+objects);
           int ran=random.nextInt(4);
       nesne2Etki=bilgisayarObjeleri.get(ran).etkiHesapla();
       nesne1Etki=objects.get(index).etkiHesapla();
           System.out.println(nesne1+nesne2);
       double temp;
       if((nesne1=="tas"&&nesne2=="makas")||(nesne1=="kagit"&&nesne2=="tas")||(nesne1=="makas"&&nesne2=="kagit")){
           temp=nesne1Etki;
           nesne1Etki /=((1-a)*nesne2Etki);
           nesne2Etki /= (a*temp);
       }else if((nesne1=="tas"&&nesne2=="kagit")||(nesne1=="kagit"&&nesne2=="makas")||(nesne1=="makas"&&nesne2=="tas")){
           temp=nesne1Etki;
           nesne1Etki /= (a*nesne2Etki);
           nesne2Etki /=((1-a)*temp);
       }else if((nesne1=="tas"&&nesne2=="tas")||(nesne1=="kagit"&&nesne2=="kagit")||(nesne1=="makas"&&nesne2=="makas")){
           temp=nesne1Etki;
           nesne1Etki /= (a*nesne2Etki);
           nesne2Etki /= (a*temp);
       }
          
       
       System.out.println("+++"+nesne1Etki);
       System.out.println("1." +nesne1Etki + "--" +"2."+nesne2Etki);
           
       
      
      
           

        
      
       
       ///bilgisayar.Goster();
       
        
        //KullaniciJFrame kullaniciJFrame = new KullaniciJFrame();
       sayac++; 
    }
   void check(){
       System.out.println(objects);
   }
}

