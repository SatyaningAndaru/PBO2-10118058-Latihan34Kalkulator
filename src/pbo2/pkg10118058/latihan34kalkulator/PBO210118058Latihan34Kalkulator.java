/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan34kalkulator;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class PBO210118058Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukan Angka Ke- 1 : ");
        double value1 = input.nextDouble();
        System.out.print("Masukan Angka Ke-2 : ");
        double value2= input.nextDouble();
        
        
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.tambahBilangan(value1,value2);
        kalkulator.kurangBilangan(value1,value2);
        kalkulator.kaliBilangan(value1,value2);
        kalkulator.bagiBilangan(value1,value2);
        kalkulator.sisaBilangan(value1,value2);
        
    }
    
}
