package oyun;


import oyun.Nesne;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alica
 */
public class Makas extends Nesne{
    public double keskinlik = 2;
    public double makas_etkisi_tas,makas_etkisi_agirtas,makas_etkisi_kagit,
            makas_etkisi_ozelkagit,makas_etkisi_makas,makas_etkisi_ustamakas,
            tasvsmakas,agirtasvsmakas,kagitvsmakas,ozelkagitvsmakas,ustamakasvsmakas;
    
    public Makas(){}
    
    public Makas(double dayaniklilik,double seviyePuani,double keskinlik){
    
        super(dayaniklilik,seviyePuani);
        this.keskinlik = keskinlik;          
    }

    @Override
    public void nesnePuaniGoster() {
         if(oyuncu==2 && bilgisayar==1 && seviyePuaniKagitBilgisayar<30 ){
             DSPGoster0 = ("Dayaniklilik Makas:" + dayaniklilikMakasOyuncu + "S.P.Makas:"+seviyePuaniMakasOyuncu);
             DSPGoster1 = ("Dayaniklilik Kagit:"+ dayaniklilikKagitBilgisayar + "S.P.Kagit:"+seviyePuaniKagitBilgisayar);         
        }
        else if(oyuncu==2 && bilgisayar==0  && seviyePuaniTasBilgisayar<30){
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
        else if(oyuncu==2 && bilgisayar==2  && seviyePuaniMakasBilgisayar<30){
             DSPGoster0 = ("Dayaniklilik Makas:"+ dayaniklilikMakasOyuncu + "S.P.Makas:"+seviyePuaniMakasOyuncu);                    
             DSPGoster1 = ("Dayaniklilik Makas:" + dayaniklilikMakasBilgisayar + "S.P.Makas:"+seviyePuaniMakasBilgisayar);
        }
         else if(oyuncu==2 && bilgisayar==2  && seviyePuaniMakasBilgisayar>30){
             DSPGoster0 = ("Dayaniklilik Makas:"+ dayaniklilikMakasOyuncu + "S.P.Makas:"+seviyePuaniMakasOyuncu);                    
             DSPGoster1 = ("Dayaniklilik Makas:" + dayaniklilikMakasBilgisayar + "S.P.Makas:"+seviyePuaniMakasBilgisayar);
        } 
    }

    @Override
    public void etkiHesapla() {
        makas_etkisi_tas=keskinlik/1.6;
        makas_etkisi_agirtas=keskinlik/3.2;
        makas_etkisi_kagit=keskinlik/0.4;
        makas_etkisi_ozelkagit=keskinlik/0.8;
        makas_etkisi_makas = 0;
        makas_etkisi_ustamakas = 1;
        tasvsmakas=5;
        agirtasvsmakas=10;
        kagitvsmakas=1.25;
        ozelkagitvsmakas=2.5;
        ustamakasvsmakas=2;
    }

    @Override
    public void durumGuncelle() {
        if(oyuncu==2 && bilgisayar==1 && seviyePuaniKagitBilgisayar<30 ){
             dayaniklilikKagitBilgisayar=dayaniklilikKagitBilgisayar-makas_etkisi_kagit;
             seviyePuaniKagitBilgisayar=seviyePuaniKagitBilgisayar + 0;  
             dayaniklilikMakasOyuncu=dayaniklilikMakasOyuncu-kagitvsmakas;
             seviyePuaniMakasOyuncu =seviyePuaniMakasOyuncu + 20;
        }
        else if(oyuncu==2 && bilgisayar==0 && seviyePuaniTasBilgisayar<30 ){
             dayaniklilikTasBilgisayar=dayaniklilikTasBilgisayar-makas_etkisi_tas;
             seviyePuaniTasBilgisayar =seviyePuaniTasBilgisayar + 20;
             dayaniklilikMakasOyuncu=dayaniklilikMakasOyuncu-tasvsmakas;
             seviyePuaniMakasOyuncu =seviyePuaniMakasOyuncu + 0;
        }
        else if(oyuncu==2 && bilgisayar==1 && seviyePuaniKagitBilgisayar>30 ){
             dayaniklilikKagitBilgisayar=dayaniklilikKagitBilgisayar-makas_etkisi_ozelkagit;
             seviyePuaniKagitBilgisayar=seviyePuaniKagitBilgisayar+ 0;
             dayaniklilikMakasOyuncu=dayaniklilikMakasOyuncu-ozelkagitvsmakas;
             seviyePuaniMakasOyuncu =seviyePuaniMakasOyuncu + 0;
        }
        else if(oyuncu==2 && bilgisayar==0 && seviyePuaniTasBilgisayar>30 ){
             dayaniklilikTasBilgisayar=dayaniklilikTasBilgisayar-makas_etkisi_agirtas;
             seviyePuaniTasBilgisayar=seviyePuaniTasBilgisayar + 20;
             dayaniklilikMakasOyuncu=dayaniklilikMakasOyuncu-agirtasvsmakas;
             seviyePuaniMakasOyuncu =seviyePuaniMakasOyuncu + 0;
        }
        else if(oyuncu==2 && bilgisayar==2 && seviyePuaniMakasBilgisayar<30 ){
             dayaniklilikMakasBilgisayar=dayaniklilikMakasBilgisayar-makas_etkisi_makas;
             seviyePuaniMakasBilgisayar =seviyePuaniMakasBilgisayar + 0;
             dayaniklilikMakasOyuncu=dayaniklilikMakasOyuncu-makas_etkisi_makas;
             seviyePuaniMakasOyuncu =seviyePuaniMakasOyuncu + 0;
        }
        else if(oyuncu==2 && bilgisayar==2 && seviyePuaniMakasBilgisayar>30 ){
             dayaniklilikMakasBilgisayar=dayaniklilikMakasBilgisayar-makas_etkisi_ustamakas;
             seviyePuaniMakasBilgisayar =seviyePuaniMakasBilgisayar + 20;
             dayaniklilikMakasOyuncu=dayaniklilikMakasOyuncu-ustamakasvsmakas;
             seviyePuaniMakasOyuncu =seviyePuaniMakasOyuncu + 0;
        }
    }
    
}
