/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */

import java.util.Scanner;
public class Main {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam =0;
        double ort;
        int sayac =0;
        System.out.println("Kaça kadar gitmek istiyorsunuz: ");
        int sayi = scanner.nextInt();
        for(int i =0;i<sayi;i++){
            if(i%3==0 && i%4 ==0){
                toplam +=i;
                sayac++;
            }
      }
     ort = (double)toplam /sayac;
     
        System.out.println(sayi + " ya kadar olan 3 ve 4 ile tam bölünen sayıların ortalaması:  " + ort);
        
    }
}
