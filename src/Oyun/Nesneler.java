package Oyun;

/**
 *
 * @author mustafa
 */
public abstract class Nesneler {
   private String name;
    private double dayaniklilik=20;
    double howMuch;
    public double getDayaniklilik() {
        return dayaniklilik;
    }

    public String getName() {
        return name;
    }

    public void setDayaniklilik(double dayaniklilik) {
        this.dayaniklilik = dayaniklilik;
    }
    private int seviyePuani=0;
    public int getSeviyePuani() {
        return seviyePuani;
    }

    public void setSeviyePuani(int seviyePuani) {
        this.seviyePuani = seviyePuani;
    }
    

    
    public Nesneler(double dayaniklilik, int seviyePuani,double howMuch) {
        //dayaniklilik=20;
        //seviyePuani=0;
    }

    public Nesneler() {

    }

    private int nesnePuaniGoster() {
        double a = 0.2;
        return 0;
    }

    public abstract double etkiHesapla();

    public double durumGuncelle() {
        return 0;
    }
    
    

}
