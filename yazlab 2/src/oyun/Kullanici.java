package oyun;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import yazlab.GUI;
/**
 *
 * @author alica
 */
public class Kullanici extends Oyuncu{
   
    public int kullaniciSecim;
    public int kullanici;
    public Kullanici(){}
   
    
    public Kullanici(int oyuncuID,String oyuncuAdi,String skor){
    
        super(oyuncuID,oyuncuAdi,skor);
                  
    }

    @Override
    public void nesneSec() {
         if(kullaniciSecim == 0){
            kullanici =0;
        }
         else if(kullaniciSecim == 1){
             kullanici =1;
         }
         else if(kullaniciSecim == 2){
             kullanici =2;
         }
    }


    
    
}
