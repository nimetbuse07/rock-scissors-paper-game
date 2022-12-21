package oyun;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alica
 */
public abstract class Oyuncu {
    
    public int oyuncuID,oyuncuSkor = 0,bilgisayarSkor = 0;
    public String oyuncuAdi,skor;
    
    public Oyuncu(){}
    
    public Oyuncu(int oyuncuID,String oyuncuAdi,String skor){
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }
       
    public List nesneListesi(){
    
        List<String> nesneListesi = new ArrayList<>();
        nesneListesi.add("TAŞ");
        nesneListesi.add("KAĞIT");
        nesneListesi.add("MAKAS");
        System.out.println(nesneListesi);
        return nesneListesi;
    }  
    
    public void skorGoster(int oyuncuSkor,int bilgisayarSkor){
     this.oyuncuSkor = oyuncuSkor;
     this.bilgisayarSkor = bilgisayarSkor;
        skor = (oyuncuSkor + "-" + bilgisayarSkor);
        
        
    }
    
  
    abstract void nesneSec();
}
