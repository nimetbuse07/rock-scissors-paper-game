package oyun;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alica
 */
public abstract class Nesne {
    public double dayaniklilik = 20, seviyePuani = 0;
    public double dayaniklilikTasOyuncu = 20,seviyePuaniTasOyuncu = 0;
    public double dayaniklilikTasBilgisayar = 20,seviyePuaniTasBilgisayar = 0;
    public double dayaniklilikKagitOyuncu = 20,seviyePuaniKagitOyuncu=0;
    public double dayaniklilikKagitBilgisayar = 20,seviyePuaniKagitBilgisayar=0;
    public double dayaniklilikMakasOyuncu = 20, seviyePuaniMakasOyuncu=0;
    public double dayaniklilikMakasBilgisayar = 20, seviyePuaniMakasBilgisayar=0;
    public int oyuncu,bilgisayar;
    public String DSPGoster0,DSPGoster1;

    public Nesne() {}
    
    public Nesne(double dayaniklilik,double seviyePuani) {
        this.dayaniklilik = dayaniklilik;
        this.seviyePuani = seviyePuani;
    }
    
    abstract public void nesnePuaniGoster();
    abstract public void etkiHesapla();
    abstract public void durumGuncelle();
    
    
    
}
