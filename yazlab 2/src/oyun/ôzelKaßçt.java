package oyun;


import oyun.Kağıt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alica
 */
public class ÖzelKağıt extends Kağıt{
    public double kalinlik = 2;
    public double ozelkagit_etkisi_tas,ozelkagit_etkisi_agirtas,ozelkagit_etkisi_makas,
            ozelkagit_etkisi_ustamakas,ozelkagit_etkisi_kagit,
            ozelkagit_etkisi_ozelkagit,
            tasvsozelkagit,agirtasvsozelkagit,kagitvsozelkagit,makasvsozelkagit,ustamakasvsozelkagit;
    
    public ÖzelKağıt(){}
    
    public ÖzelKağıt(double dayaniklilik,double seviyePuani,double nufuz,double kalinlik){
    
        super(dayaniklilik,seviyePuani,nufuz);
        this.kalinlik = kalinlik;
    }

    @Override
    public void durumGuncelle() {
        if(oyuncu==1 && bilgisayar==0 && seviyePuaniTasBilgisayar<30 ){
             dayaniklilikTasBilgisayar=dayaniklilikTasBilgisayar-ozelkagit_etkisi_tas;
             seviyePuaniTasBilgisayar=seviyePuaniTasBilgisayar + 0;   
             dayaniklilikKagitOyuncu=dayaniklilikKagitOyuncu-tasvsozelkagit;
             seviyePuaniKagitOyuncu =seviyePuaniKagitOyuncu + 20;
        }
        else if(oyuncu==1 && bilgisayar==2 && seviyePuaniMakasBilgisayar<30 ){
             dayaniklilikMakasBilgisayar=dayaniklilikMakasBilgisayar-ozelkagit_etkisi_makas;
             seviyePuaniMakasBilgisayar =seviyePuaniMakasBilgisayar + 0;
             dayaniklilikKagitOyuncu=dayaniklilikKagitOyuncu-makasvsozelkagit;
             seviyePuaniKagitOyuncu =seviyePuaniKagitOyuncu + 0;
        }
        else if(oyuncu==1 && bilgisayar==0 && seviyePuaniTasBilgisayar>30 ){
             dayaniklilikTasBilgisayar=dayaniklilikTasBilgisayar-ozelkagit_etkisi_agirtas;
             seviyePuaniTasBilgisayar=seviyePuaniTasBilgisayar+ 0;
             dayaniklilikKagitOyuncu=dayaniklilikKagitOyuncu-agirtasvsozelkagit;
             seviyePuaniKagitOyuncu =seviyePuaniKagitOyuncu + 20;
        }
        else if(oyuncu==1 && bilgisayar==2 && seviyePuaniMakasBilgisayar>30){
             dayaniklilikMakasBilgisayar=dayaniklilikMakasBilgisayar-ozelkagit_etkisi_ustamakas;
             seviyePuaniMakasBilgisayar=seviyePuaniMakasBilgisayar + 20;
             dayaniklilikKagitOyuncu=dayaniklilikKagitOyuncu-ustamakasvsozelkagit;
             seviyePuaniKagitOyuncu =seviyePuaniKagitOyuncu + 0;
        }
        else if(oyuncu==1 && bilgisayar==1 && seviyePuaniKagitBilgisayar<30 ){
             dayaniklilikKagitBilgisayar=dayaniklilikKagitBilgisayar-ozelkagit_etkisi_kagit;
             seviyePuaniKagitBilgisayar =seviyePuaniKagitBilgisayar + 0;
             dayaniklilikKagitOyuncu=dayaniklilikKagitOyuncu-kagitvsozelkagit;
             seviyePuaniKagitOyuncu =seviyePuaniKagitOyuncu + 20;
        }
        else if(oyuncu==1 && bilgisayar==1 && seviyePuaniKagitBilgisayar>30 ){
             dayaniklilikKagitBilgisayar=dayaniklilikKagitBilgisayar-ozelkagit_etkisi_ozelkagit;
             seviyePuaniKagitBilgisayar =seviyePuaniKagitBilgisayar + 0;
             dayaniklilikKagitOyuncu=dayaniklilikKagitOyuncu-ozelkagit_etkisi_ozelkagit;
             seviyePuaniKagitOyuncu =seviyePuaniKagitOyuncu + 0;
        }
    }

    @Override
    public void etkiHesapla() {
        ozelkagit_etkisi_tas=(nufuz*kalinlik)/0.4;
        ozelkagit_etkisi_agirtas=(nufuz*kalinlik)/0.8;
        ozelkagit_etkisi_makas=(nufuz*kalinlik)/1.6;
        ozelkagit_etkisi_ustamakas=(nufuz*kalinlik)/3.2;
        ozelkagit_etkisi_kagit = 2;
        ozelkagit_etkisi_ozelkagit = 0;
        tasvsozelkagit=0.625;
        agirtasvsozelkagit=1.25;
        kagitvsozelkagit=1;
        makasvsozelkagit=2.5;
        ustamakasvsozelkagit=5;
        
    }

    @Override
    public void nesnePuaniGoster() {
        if(oyuncu==1 && bilgisayar==0 && seviyePuaniTasBilgisayar<30 ){
             DSPGoster0 = ("Dayaniklilik Kagit:" + dayaniklilikKagitOyuncu + "S.P.Kagit:"+seviyePuaniKagitOyuncu);
             DSPGoster1 = ("Dayaniklilik Tas:"+ dayaniklilikTasBilgisayar + "S.P.Tas:"+seviyePuaniTasBilgisayar);         
        }
        else if(oyuncu==1 && bilgisayar==2  && seviyePuaniMakasBilgisayar<30){
             DSPGoster0 = ("Dayaniklilik Kagit:" + dayaniklilikKagitOyuncu + "S.P.Kagit:"+seviyePuaniKagitOyuncu);
             DSPGoster1 = ("Dayaniklilik Makas:"+ dayaniklilikMakasBilgisayar + "S.P.Makas:"+seviyePuaniMakasBilgisayar);
        }
        else if(oyuncu==1 && bilgisayar==0 && seviyePuaniTasBilgisayar>30 ){
             DSPGoster0 = ("Dayaniklilik Kagit:"+ dayaniklilikKagitOyuncu + "S.P.Kagit:"+seviyePuaniKagitOyuncu);                     
             DSPGoster1 = ("Dayaniklilik Tas:" + dayaniklilikTasBilgisayar + "S.P.Tas:"+seviyePuaniTasBilgisayar);
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
    
    
}
