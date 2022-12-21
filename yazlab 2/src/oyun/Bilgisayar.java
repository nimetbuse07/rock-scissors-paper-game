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
public class Bilgisayar extends Oyuncu{
    
    public int bilgisayar;
    public Bilgisayar(){}
    
    public Bilgisayar(int oyuncuID,String oyuncuAdi,String skor){
    
        super(oyuncuID,oyuncuAdi,skor);
                  
    }
    
    @Override
    public void nesneSec() {
        
        bilgisayar = (int) (Math.random() * 3);
        
        
    }

    
}
