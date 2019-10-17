/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan34kalkulator;

/**
 *
 * @author user
 */
public class Kalkulator {

    public double tambahBilangan(double value1 ,double value2){
        
         System.out.println("Hasil Pertambahan : "+(value1+value2));
         return 0;
        
    }
    
    public double kurangBilangan(double value1, double value2){
        System.out.println("Hasil Pengurangan : " +(value1-value2));
        return 0;
    }
    
    public double kaliBilangan(double value1, double value2){
        System.out.println("Hasil Perkalian : "+(value1*value2));
        return 0;
    }
    public double bagiBilangan(double value1, double value2){
        System.out.println("Hasil Pembagian : "+(value1/value2));
        return 0;
    }
    
    public double sisaBilangan(double value1, double value2){
       System.out.println("Hasil sisa : "+(value1%value2));
        return 0;
    }
}
