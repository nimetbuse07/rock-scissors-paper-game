package oyun;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alica
 */
public class UstaMakas extends Makas{
    public double direnc = 2;
    public double ustamakas_etkisi_tas,ustamakas_etkisi_agirtas,ustamakas_etkisi_kagit,
            ustamakas_etkisi_ozelkagit,ustamakas_etkisi_makas,
            ustamakas_etkisi_ustamakas,
            tasvsustamakas,agirtasvsustamakas,kagitvsustamakas,ozelkagitvsustamakas,makasvsustamakas;
    
    public UstaMakas(){}
    
    public UstaMakas(double dayaniklilik,double seviyePuani,double keskinlik,double direnc){
    
        super(dayaniklilik,seviyePuani,keskinlik);
        this.direnc = direnc;
    }

    @Override
    public void durumGuncelle() {
        if(oyuncu==2 && bilgisayar==1 && seviyePuaniKagitBilgisayar<30 ){
             dayaniklilikKagitBilgisayar=dayaniklilikKagitBilgisayar-ustamakas_etkisi_kagit;
             seviyePuaniKagitBilgisayar=seviyePuaniKagitBilgisayar + 0;   
             dayaniklilikMakasOyuncu=dayaniklilikMakasOyuncu-kagitvsustamakas;
             seviyePuaniMakasOyuncu =seviyePuaniMakasOyuncu + 20;
        }
        else if(oyuncu==2 && bilgisayar==0 && seviyePuaniTasBilgisayar<30 ){
             dayaniklilikTasBilgisayar=dayaniklilikTasBilgisayar-ustamakas_etkisi_tas;
             seviyePuaniTasBilgisayar =seviyePuaniTasBilgisayar + 0;
             dayaniklilikMakasOyuncu=dayaniklilikMakasOyuncu-tasvsustamakas;
             seviyePuaniMakasOyuncu =seviyePuaniMakasOyuncu + 0;
        }
        else if(oyuncu==2 && bilgisayar==1 && seviyePuaniKagitBilgisayar>30 ){
             dayaniklilikKagitBilgisayar=dayaniklilikKagitBilgisayar-ustamakas_etkisi_ozelkagit;
             seviyePuaniKagitBilgisayar=seviyePuaniKagitBilgisayar+ 0;
             dayaniklilikMakasOyuncu=dayaniklilikMakasOyuncu-ozelkagitvsustamakas;
             seviyePuaniMakasOyuncu =seviyePuaniMakasOyuncu + 20;
        }
        else if(oyuncu==2 && bilgisayar==0 && seviyePuaniTasBilgisayar>30 ){
             dayaniklilikTasBilgisayar=dayaniklilikTasBilgisayar-ustamakas_etkisi_agirtas;
             seviyePuaniTasBilgisayar=seviyePuaniTasBilgisayar + 20;
             dayaniklilikMakasOyuncu=dayaniklilikMakasOyuncu-agirtasvsustamakas;
             seviyePuaniMakasOyuncu =seviyePuaniMakasOyuncu + 0;
        } 
        else if(oyuncu==2 && bilgisayar==2 && seviyePuaniMakasBilgisayar<30 ){
             dayaniklilikMakasBilgisayar=dayaniklilikMakasBilgisayar-ustamakas_etkisi_makas;
             seviyePuaniMakasBilgisayar =seviyePuaniMakasBilgisayar + 0;
             dayaniklilikMakasOyuncu=dayaniklilikMakasOyuncu-makasvsustamakas;
             seviyePuaniMakasOyuncu =seviyePuaniMakasOyuncu + 20;
        }
        else if(oyuncu==2 && bilgisayar==2 && seviyePuaniMakasBilgisayar>30 ){
             dayaniklilikMakasBilgisayar=dayaniklilikMakasBilgisayar-ustamakas_etkisi_makas;
             seviyePuaniMakasBilgisayar =seviyePuaniMakasBilgisayar + 0;
             dayaniklilikMakasOyuncu=dayaniklilikMakasOyuncu-ustamakas_etkisi_ustamakas;
             seviyePuaniMakasOyuncu =seviyePuaniMakasOyuncu + 0;
        }
    }

    @Override
    public void etkiHesapla() {
        ustamakas_etkisi_tas=(keskinlik*direnc)/1.6;
        ustamakas_etkisi_agirtas=(keskinlik*direnc)/3.2;    
        ustamakas_etkisi_kagit=(keskinlik*direnc)/0.4;
        ustamakas_etkisi_ozelkagit=(keskinlik*direnc)/0.8;
        ustamakas_etkisi_makas = 2;
        ustamakas_etkisi_ustamakas = 0;
        tasvsustamakas=2.5;
        agirtasvsustamakas=5;
        kagitvsustamakas=0.625;
        ozelkagitvsustamakas=1.25;
        makasvsustamakas = 1;      
    }

    @Override
    public void nesnePuaniGoster() {
        if(oyuncu==2 && bilgisayar==1 && seviyePuaniKagitBilgisayar<30 ){
             DSPGoster0 = ("Dayaniklilik Makas:" + dayaniklilikMakasOyuncu + "S.P.Makas:"+seviyePuaniMakasOyuncu);
             DSPGoster1 = ("Dayaniklilik Kagit:"+ dayaniklilikKagitBilgisayar + "S.P.Kagit:"+seviyePuaniKagitBilgisayar);         
        }
        else if(oyuncu==2 && bilgisayar==0 && seviyePuaniTasBilgisayar<30){
             DSPGoster0 = ("Dayaniklilik Makas:"+ dayaniklilikMakasOyuncu + "S.P.Makas:"+seviyePuaniMakasOyuncu);      
             DSPGoster1 = ("Dayaniklilik Tas:" + dayaniklilikTasBilgisayar + "S.P.Tas:"+seviyePuaniTasBilgisayar);
        }
        else if(oyuncu==2 && bilgisayar==1 && seviyePuaniKagitBilgisayar>30 ){
             DSPGoster0 = ("Dayaniklilik Makas:" + dayaniklilikMakasOyuncu + "S.P.Makas:"+seviyePuaniMakasOyuncu);
             DSPGoster1 = ("Dayaniklilik Kagit:"+ dayaniklilikKagitBilgisayar + "S.P.Kagit:"+seviyePuaniKagitBilgisayar);
        }
        else if(oyuncu==2 && bilgisayar==0  && seviyePuaniTasBilgisayar>30){
             DSPGoster0 = ("Dayaniklilik Makas:"+ dayaniklilikMakasOyuncu + "S.P.Makas:"+seviyePuaniMakasOyuncu);              
             DSPGoster1 = ("Dayaniklilik Tas:" + dayaniklilikTasBilgisayar + "S.P.Tas:"+seviyePuaniTasBilgisayar);
        } 
        else if(oyuncu==2 && bilgisayar==2 && seviyePuaniMakasBilgisayar<30){
             DSPGoster0 = ("Dayaniklilik Makas:"+ dayaniklilikMakasOyuncu + "S.P.Makas:"+seviyePuaniMakasOyuncu);      
             DSPGoster1 = ("Dayaniklilik Makas:" + dayaniklilikMakasBilgisayar + "S.P.Makas:"+seviyePuaniMakasBilgisayar);
        }
        else if(oyuncu==2 && bilgisayar==2  && seviyePuaniMakasBilgisayar>30){
             DSPGoster0 = ("Dayaniklilik Makas:"+ dayaniklilikMakasOyuncu + "S.P.Makas:"+seviyePuaniMakasOyuncu);      
             DSPGoster1 = ("Dayaniklilik Makas:" + dayaniklilikMakasBilgisayar + "S.P.Makas:"+seviyePuaniMakasBilgisayar);
        }
    }
    
    
}
