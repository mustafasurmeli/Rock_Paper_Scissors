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
public class Kullanici extends Oyuncu{
    Random random = new Random();
    String oyuncuAdi;
    int oyuncuID;
    int skor;
    
    Kullanici(){
        super.setOyuncuID(random.nextInt(10));
        super.getOyuncuAdi();
        
    }
    void Goster(){
        System.out.println(super.getOyuncuAdi());
        System.out.println(super.getOyuncuID());
    }
    
}
