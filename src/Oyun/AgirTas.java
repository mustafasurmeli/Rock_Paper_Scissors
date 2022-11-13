/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oyun;

/**
 *
 * @author mustafa
 */
public class AgirTas extends Tas{
    
    public AgirTas(int dayaniklilik,int seviyePuani,int katilik){
         super(dayaniklilik, seviyePuani);
    }
    public AgirTas() {
    }
    private int sicaklik=2;

    public int getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(int sicaklik) {
        this.sicaklik = sicaklik;
    }
    private int nesnePuaniGoster(){
        return 0;
    }
    public double etkiHesapla(){
        return sicaklik*getKatilik();
    }
    private int durumGuncelle(){
        return 0;
    }
    
}
