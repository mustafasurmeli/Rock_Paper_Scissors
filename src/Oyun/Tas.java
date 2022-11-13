/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oyun;

/**
 *
 * @author mustafa
 */
public class Tas extends Nesneler {
    
    Kagit kagit = new Kagit();
    OzelKagit ozelKagit = new OzelKagit();
    Makas makas = new Makas();
    UstaMakas ustaMakas = new UstaMakas();
    public Tas(int dayaniklilik,int seviyePuani){
     //   super(dayaniklilik, seviyePuani);
        
    }
    public Tas() {
    }
    private  int katilik=2;

    public int getKatilik() {
        return katilik;
    }

    public void setKatilik(int katilik) {
        this.katilik = katilik;
    }
    private int nesnePuaniGoster(){
        return 0;
    }
    public double etkiHesapla(){
       
       return katilik;
    }
    private int durumGuncelle(){
        
        return 0;
    }
    
}
