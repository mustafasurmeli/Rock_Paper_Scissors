/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oyun;

/**
 *
 * @author mustafa
 */
public class OzelKagit extends Kagit {
    
    public OzelKagit(int dayaniklilik,int seviyePuani,int nufuz){
         super(dayaniklilik, seviyePuani);
    }
    public OzelKagit() {
    }
    private int kalinlik=2;

    public int getKalinlik() {
        return kalinlik;
    }

    public void setKalinlik(int kalinlik) {
        this.kalinlik = kalinlik;
    }
    private int nesnePuaniGoster(){
        return 0;
    }
    public double etkiHesapla(){
        return kalinlik*getNufuz();
    }
    private int durumGuncelle(){
        return 0;
    }
}
