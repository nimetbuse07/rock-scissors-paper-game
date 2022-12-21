package oyun;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alica
 */
public class Kağıt extends Nesne{
    
    public double nufuz = 2;
    double kagit_etkisi_tas,kagit_etkisi_agirtas,kagit_etkisi_makas,
            kagit_etkisi_ustamakas,kagit_etkisi_kagit,kagit_etkisi_ozelkagit,
            tasvskagit,agirtasvskagit,ozelkagitvskagit,makasvskagıt,ustamakasvskagit;
    
    public Kağıt(){}
    
    public Kağıt(double dayaniklilik,double seviyePuani,double nufuz){
    
        super(dayaniklilik,seviyePuani);
        this.nufuz = nufuz;   
    }

    @Override
    public void nesnePuaniGoster() {
        if(oyuncu==1 && bilgisayar==0  && seviyePuaniTasBilgisayar<30){
             DSPGoster0 = ("Dayaniklilik Kagit:" + dayaniklilikKagitOyuncu + "S.P.Kagit:"+seviyePuaniKagitOyuncu);
             DSPGoster1 = ("Dayaniklilik Tas:"+ dayaniklilikTasBilgisayar + "S.P.Tas:"+seviyePuaniTasBilgisayar);         
        }
        else if(oyuncu==1 && bilgisayar==2  && seviyePuaniMakasBilgisayar<30){
             DSPGoster0 = ("Dayaniklilik Kagit:" + dayaniklilikKagitOyuncu + "S.P.Kagit:"+seviyePuaniKagitOyuncu);
             DSPGoster1 = ("Dayaniklilik Makas:"+ dayaniklilikMakasBilgisayar + "S.P.Makas:"+seviyePuaniMakasBilgisayar);
        }
        else if(oyuncu==1 && bilgisayar==0  && seviyePuaniTasBilgisayar>30){
             DSPGoster0 = ("Dayaniklilik Kagit:" + dayaniklilikKagitOyuncu + "S.P.Kagit:"+seviyePuaniKagitOyuncu);
             DSPGoster1 = ("Dayaniklilik Tas:"+ dayaniklilikTasBilgisayar + "S.P.Tas:"+seviyePuaniTasBilgisayar);
        }
        else if(oyuncu==1 && bilgisayar==2  && seviyePuaniMakasBilgisayar>30){
             DSPGoster0 = ("Dayaniklilik Kagit:" + dayaniklilikKagitOyuncu + "S.P.Kagit:"+seviyePuaniKagitOyuncu);
             DSPGoster1 = ("Dayaniklilik Makas:"+ dayaniklilikMakasBilgisayar + "S.P.Makas:"+seviyePuaniMakasBilgisayar);
        }
        else if(oyuncu==1 && bilgisayar==1  && seviyePuaniKagitBilgisayar<30){
             DSPGoster0 = ("Dayaniklilik Kagit:" + dayaniklilikKagitOyuncu + "S.P.Kagit:"+seviyePuaniKagitOyuncu);
             DSPGoster1 = ("Dayaniklilik Kagit:"+ dayaniklilikKagitBilgisayar + "S.P.Kagit:"+seviyePuaniKagitBilgisayar);
        }
        else if(oyuncu==1 && bilgisayar==1  && seviyePuaniKagitBilgisayar>30){
             DSPGoster0 = ("Dayaniklilik Kagit:" + dayaniklilikKagitOyuncu + "S.P.Kagit:"+seviyePuaniKagitOyuncu);
             DSPGoster1 = ("Dayaniklilik Kagit:"+ dayaniklilikKagitBilgisayar + "S.P.Kagit:"+seviyePuaniKagitBilgisayar);
        }
    }

    @Override
    public void etkiHesapla() {
        kagit_etkisi_tas=nufuz/0.4;
        kagit_etkisi_agirtas=nufuz/0.8;
        kagit_etkisi_makas=nufuz/1.6;
        kagit_etkisi_ustamakas=nufuz/3.2;
        kagit_etkisi_kagit = 0;
        kagit_etkisi_ozelkagit = 1;
        tasvskagit=1.25;
        agirtasvskagit=2.5;
        ozelkagitvskagit=2;
        makasvskagıt=5;
        ustamakasvskagit=10;
        
    }

    @Override
    public void durumGuncelle() {
        if(oyuncu==1 && bilgisayar==0 && seviyePuaniTasBilgisayar<30){
             dayaniklilikTasBilgisayar=dayaniklilikTasBilgisayar-kagit_etkisi_tas;
             seviyePuaniTasBilgisayar=seviyePuaniTasBilgisayar + 0;
             dayaniklilikKagitOyuncu=dayaniklilikKagitOyuncu-tasvskagit;
             seviyePuaniKagitOyuncu =seviyePuaniKagitOyuncu+ 20;
        }
        else if(oyuncu==1 && bilgisayar==2 && seviyePuaniMakasBilgisayar<30){
             dayaniklilikMakasBilgisayar=dayaniklilikMakasBilgisayar-kagit_etkisi_makas;
             seviyePuaniMakasBilgisayar =seviyePuaniMakasBilgisayar+ 20;
             dayaniklilikKagitOyuncu=dayaniklilikKagitOyuncu-makasvskagıt;
             seviyePuaniKagitOyuncu =seviyePuaniKagitOyuncu+ 0;
        }
        else if(oyuncu==1 && bilgisayar==0 && seviyePuaniTasBilgisayar>30 ){
             dayaniklilikTasBilgisayar=dayaniklilikTasBilgisayar-kagit_etkisi_agirtas;
             seviyePuaniTasBilgisayar=seviyePuaniTasBilgisayar+0;
             dayaniklilikKagitOyuncu=dayaniklilikKagitOyuncu-agirtasvskagit;
             seviyePuaniKagitOyuncu =seviyePuaniKagitOyuncu+ 0;
        }
        else if(oyuncu==1 && bilgisayar==2 && seviyePuaniMakasBilgisayar>30 ){
            dayaniklilikMakasBilgisayar=dayaniklilikMakasBilgisayar-kagit_etkisi_ustamakas;
             seviyePuaniMakasBilgisayar=seviyePuaniMakasBilgisayar + 20;
             dayaniklilikKagitOyuncu=dayaniklilikKagitOyuncu-ustamakasvskagit;
             seviyePuaniKagitOyuncu =seviyePuaniKagitOyuncu+ 0;
        }
        else if(oyuncu==1 && bilgisayar==1 && seviyePuaniKagitBilgisayar<30 ){
             dayaniklilikKagitBilgisayar=dayaniklilikKagitBilgisayar-kagit_etkisi_kagit;
             seviyePuaniKagitBilgisayar =seviyePuaniKagitBilgisayar+ 0;
             dayaniklilikKagitOyuncu=dayaniklilikKagitOyuncu-kagit_etkisi_kagit;
             seviyePuaniKagitOyuncu =seviyePuaniKagitOyuncu+ 0;
        }
        else if(oyuncu==1 && bilgisayar==1 && seviyePuaniKagitBilgisayar>30 ){
             dayaniklilikKagitBilgisayar=dayaniklilikKagitBilgisayar-kagit_etkisi_ozelkagit;
             seviyePuaniKagitBilgisayar =seviyePuaniKagitBilgisayar+ 20;
             dayaniklilikKagitOyuncu=dayaniklilikKagitOyuncu-ozelkagitvskagit;
             seviyePuaniKagitOyuncu =seviyePuaniKagitOyuncu+ 0;
             
        }
        
    }
    
}
