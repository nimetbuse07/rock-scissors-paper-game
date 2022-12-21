package oyun;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alica
 */
public class AğırTaş extends Taş{
    
    public double sicaklik = 2;
    public double agirtas_etkisi_makas,agirtas_etkisi_ustamakas,agirtas_etkisi_kagit,
            agirtas_etkisi_ozelkagit,agirtas_etkisi_tas,agirtas_etkisi_agirtas,
            tasvsagirtas,kagitvsagirtas,ozelkagitvsagirtas,makasvsagirtas,ustamakasvsagirtas;
    
    public AğırTaş(){}
    
    public AğırTaş(double dayaniklilik,double seviyePuani,double katilik,double sicaklik){
    
        super(dayaniklilik, seviyePuani, katilik);
        this.sicaklik = sicaklik;       
    }
//tas sınıfındaki metodlar isine yaramıyorsa super metodlarını sil
    @Override
    public void durumGuncelle() {
        if(oyuncu==0 && bilgisayar==1 && seviyePuaniKagitBilgisayar<30 ){
             dayaniklilikKagitBilgisayar=dayaniklilikKagitBilgisayar-agirtas_etkisi_kagit;
             seviyePuaniKagitBilgisayar=seviyePuaniKagitBilgisayar + 0; 
             dayaniklilikTasOyuncu=dayaniklilikTasOyuncu-kagitvsagirtas;
             seviyePuaniTasOyuncu =seviyePuaniTasOyuncu + 0;
        }
        else if(oyuncu==0 && bilgisayar==2 && seviyePuaniMakasBilgisayar<30 ){
             dayaniklilikMakasBilgisayar=dayaniklilikMakasBilgisayar-agirtas_etkisi_makas;
             seviyePuaniMakasBilgisayar =seviyePuaniMakasBilgisayar + 0;
             dayaniklilikTasOyuncu=dayaniklilikTasOyuncu-makasvsagirtas;
             seviyePuaniTasOyuncu =seviyePuaniTasOyuncu + 20;
        }
        else if(oyuncu==0 && bilgisayar==1 && seviyePuaniKagitBilgisayar>30 ){
             dayaniklilikKagitBilgisayar=dayaniklilikKagitBilgisayar-agirtas_etkisi_ozelkagit;
             seviyePuaniKagitBilgisayar=seviyePuaniKagitBilgisayar+20;
             dayaniklilikTasOyuncu=dayaniklilikTasOyuncu-ozelkagitvsagirtas;
             seviyePuaniTasOyuncu =seviyePuaniTasOyuncu + 0;
        }
        else if(oyuncu==0 && bilgisayar==2 && seviyePuaniMakasBilgisayar>30 ){
             dayaniklilikMakasBilgisayar=dayaniklilikMakasBilgisayar-agirtas_etkisi_ustamakas;
             seviyePuaniMakasBilgisayar=seviyePuaniMakasBilgisayar + 0;
             dayaniklilikTasOyuncu=dayaniklilikTasOyuncu-ustamakasvsagirtas;
             seviyePuaniTasOyuncu =seviyePuaniTasOyuncu + 20;
        }
        else if(oyuncu==0 && bilgisayar==0 && seviyePuaniTasBilgisayar<30 ){
             dayaniklilikTasBilgisayar=dayaniklilikTasBilgisayar-agirtas_etkisi_tas;
             seviyePuaniTasBilgisayar =seviyePuaniTasBilgisayar + 0;
             dayaniklilikTasOyuncu=dayaniklilikTasOyuncu-tasvsagirtas;
             seviyePuaniTasOyuncu =seviyePuaniTasOyuncu + 20;
        }
        else if(oyuncu==0 && bilgisayar==0 && seviyePuaniTasBilgisayar>30 ){
             dayaniklilikTasBilgisayar=dayaniklilikTasBilgisayar-agirtas_etkisi_agirtas;
             seviyePuaniTasBilgisayar =seviyePuaniTasBilgisayar + 0;
             dayaniklilikTasOyuncu=dayaniklilikTasOyuncu-agirtas_etkisi_agirtas;
             seviyePuaniTasOyuncu =seviyePuaniTasOyuncu + 0;
        }
    }

    @Override
    public void etkiHesapla() {
        agirtas_etkisi_makas = (katilik*sicaklik)/0.4;
        agirtas_etkisi_ustamakas = (katilik*sicaklik)/0.8;
        agirtas_etkisi_kagit = (katilik*sicaklik)/1.6;
        agirtas_etkisi_ozelkagit = (katilik*sicaklik)/3.2;
        agirtas_etkisi_tas = 2;
        agirtas_etkisi_agirtas = 0;
        tasvsagirtas=1;
        kagitvsagirtas=2.5;
        ozelkagitvsagirtas=5;
        makasvsagirtas=0.625;
        ustamakasvsagirtas=1.25;
        
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
        else if(oyuncu==0 && bilgisayar==0  && seviyePuaniTasBilgisayar>30){
             DSPGoster0 = ("Dayaniklilik Tas:" + dayaniklilikTasOyuncu + "S.P.Tas:"+seviyePuaniTasOyuncu);
             DSPGoster1 = ("Dayaniklilik Tas:"+ dayaniklilikTasBilgisayar + "S.P.Tas:"+seviyePuaniTasBilgisayar);
        }
    }
    
}
