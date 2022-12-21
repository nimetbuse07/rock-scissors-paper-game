package oyun;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alica
 */
public class Taş extends Nesne{
    double katilik = 2;
    
    
    double tas_etkisi_makas,tas_etkisi_ustamakas,tas_etkisi_kagit,
            tas_etkisi_ozelkagit,tas_etkisi_tas,tas_etkisi_agirtas,
            kagitvstas,ozelkagitvstas,makasvstas,ustamakasvstas,agirtasvstas;
    
    public Taş(){}
    
    public Taş(double dayaniklilik,double seviyePuani,double katilik){
        super(dayaniklilik,seviyePuani);
        this.katilik = katilik;
    }

    @Override
    public void nesnePuaniGoster() {
         if(oyuncu==0 && bilgisayar==1 && seviyePuaniKagitBilgisayar<30 ){
             DSPGoster0 = ("Dayaniklilik Tas:" + dayaniklilikTasOyuncu + "S.P.Tas:"+seviyePuaniTasOyuncu);
             DSPGoster1 = ("Dayaniklilik Kagit:"+ dayaniklilikKagitBilgisayar + "S.P.Kagit:"+seviyePuaniKagitBilgisayar);         
        }
        else if(oyuncu==0 && bilgisayar==2 && seviyePuaniMakasBilgisayar<30){
             DSPGoster0 = ("Dayaniklilik Tas:" + dayaniklilikTasOyuncu + "S.P.Tas:"+seviyePuaniTasOyuncu);
             DSPGoster1 = ("Dayaniklilik Makas:"+ dayaniklilikMakasBilgisayar + "S.P.Makas:"+seviyePuaniMakasBilgisayar);
        }
        else if(oyuncu==0 && bilgisayar==1 && seviyePuaniKagitBilgisayar>30 ){
             DSPGoster0 = ("Dayaniklilik Tas:" + dayaniklilikTasOyuncu + "S.P.Tas:"+seviyePuaniTasOyuncu);
             DSPGoster1 = ("Dayaniklilik Kagit:"+ dayaniklilikKagitBilgisayar + "S.P.Kagit:"+seviyePuaniKagitBilgisayar);
        }
        else if(oyuncu==0 && bilgisayar==2  && seviyePuaniMakasBilgisayar>30){
             DSPGoster0 = ("Dayaniklilik Tas:" + dayaniklilikTasOyuncu + "S.P.Tas:"+seviyePuaniTasOyuncu);
             DSPGoster1 = ("Dayaniklilik Makas:"+ dayaniklilikMakasBilgisayar + "S.P.Makas:"+seviyePuaniMakasBilgisayar);
        }
         else if(oyuncu==0 && bilgisayar==0 && seviyePuaniTasBilgisayar<30){
             DSPGoster0 = ("Dayaniklilik Tas:" + dayaniklilikTasOyuncu + "S.P.Tas:"+seviyePuaniTasOyuncu);
             DSPGoster1 = ("Dayaniklilik Tas:"+ dayaniklilikTasBilgisayar + "S.P.Tas:"+seviyePuaniTasBilgisayar);
        }
         else if(oyuncu==0 && bilgisayar==0 && seviyePuaniTasBilgisayar>30){
             DSPGoster0 = ("Dayaniklilik Tas:" + dayaniklilikTasOyuncu + "S.P.Tas:"+seviyePuaniTasOyuncu);
             DSPGoster1 = ("Dayaniklilik Tas:"+ dayaniklilikTasBilgisayar + "S.P.Tas:"+seviyePuaniTasBilgisayar);
        }
    }

    @Override
    public void etkiHesapla() {
        tas_etkisi_makas= katilik/0.4;
        tas_etkisi_ustamakas = katilik/0.8;
        tas_etkisi_kagit = katilik/1.6;
        tas_etkisi_ozelkagit = katilik/3.2;
        tas_etkisi_tas = 0;
        tas_etkisi_agirtas = 1;
        kagitvstas=5;
        ozelkagitvstas=10;
        makasvstas=1.25;
        ustamakasvstas=2.50;
        agirtasvstas=2;
        
        
    }

    @Override
    public void durumGuncelle() {
        if(oyuncu==0 && bilgisayar==1 && seviyePuaniKagitBilgisayar<30 && seviyePuaniTasOyuncu<30){
             dayaniklilikKagitBilgisayar=dayaniklilikKagitBilgisayar-tas_etkisi_kagit;
             seviyePuaniKagitBilgisayar=seviyePuaniKagitBilgisayar + 20;  
             dayaniklilikTasOyuncu=dayaniklilikTasOyuncu-kagitvstas;
             seviyePuaniTasOyuncu=seviyePuaniTasOyuncu + 0;
        }
        else if(oyuncu==0 && bilgisayar==2 && seviyePuaniMakasBilgisayar<30 && seviyePuaniTasOyuncu<30){
             dayaniklilikMakasBilgisayar=dayaniklilikMakasBilgisayar-tas_etkisi_makas;
             seviyePuaniMakasBilgisayar =seviyePuaniMakasBilgisayar + 0;
             dayaniklilikTasOyuncu=dayaniklilikTasOyuncu-makasvstas;
             seviyePuaniTasOyuncu=seviyePuaniTasOyuncu + 20;
        }
        else if(oyuncu==0 && bilgisayar==1 && seviyePuaniKagitBilgisayar>30 && seviyePuaniTasOyuncu<30){
             dayaniklilikKagitBilgisayar=dayaniklilikKagitBilgisayar-tas_etkisi_ozelkagit;
             seviyePuaniKagitBilgisayar=seviyePuaniKagitBilgisayar+20;
             dayaniklilikTasOyuncu=dayaniklilikTasOyuncu-ozelkagitvstas;
             seviyePuaniTasOyuncu=seviyePuaniTasOyuncu + 0;
        }
        else if(oyuncu==0 && bilgisayar==2 && seviyePuaniMakasBilgisayar>30 && seviyePuaniTasOyuncu<30){
             dayaniklilikMakasBilgisayar=dayaniklilikMakasBilgisayar-tas_etkisi_ustamakas;
             seviyePuaniMakasBilgisayar=seviyePuaniMakasBilgisayar + 0;
             dayaniklilikTasOyuncu=dayaniklilikTasOyuncu-ustamakasvstas;
             seviyePuaniTasOyuncu=seviyePuaniTasOyuncu + 0;
        }
        else if(oyuncu==0 && bilgisayar==0 && seviyePuaniTasOyuncu<30 && seviyePuaniTasBilgisayar<30){
             dayaniklilikTasBilgisayar=dayaniklilikTasBilgisayar-tas_etkisi_tas;
             seviyePuaniTasBilgisayar=seviyePuaniTasBilgisayar + 0;
             dayaniklilikTasOyuncu=dayaniklilikTasOyuncu-tas_etkisi_tas;
             seviyePuaniTasOyuncu=seviyePuaniTasOyuncu + 0;
    }
        else if(oyuncu==0 && bilgisayar==0 && seviyePuaniTasOyuncu<30 && seviyePuaniTasBilgisayar>30){
             dayaniklilikTasBilgisayar=dayaniklilikTasBilgisayar-tas_etkisi_agirtas;
             seviyePuaniTasBilgisayar=seviyePuaniTasBilgisayar + 20;
             dayaniklilikTasOyuncu=dayaniklilikTasOyuncu-agirtasvstas;
             seviyePuaniTasOyuncu=seviyePuaniTasOyuncu + 0;
    }
    }
}
