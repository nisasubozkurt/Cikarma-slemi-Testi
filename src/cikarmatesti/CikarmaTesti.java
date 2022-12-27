/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cikarmatesti;
import java.util.Scanner;
/**
 *
 * @author Su 
 */
public class CikarmaTesti {

    public static void main(String[] args) {
        
  // İki tane random tam sayı üret
  int sayi1 = (int)(Math.random()*10);
  int sayi2 = (int)(Math.random()*10);
  
 // sayi1<sayi2 ise sayi1 ve sayi2'yi yer değiştir
 if (sayi1<sayi2){
     int temp = sayi1;
     sayi1 =sayi2;
     sayi2 = temp;
 }
  
 // Kullanıcıya sor "sayi1-sayi2 sonucu nedir ?"
 System.out.print(sayi1 + " - " + sayi2 + " nedir? ");
 
 Scanner giris = new Scanner(System.in);
 int cevap = giris.nextInt();
 
 //Cevabı değerlendir ve sonucu göster
 if (sayi1 - sayi2 == cevap)
     System.out.println("Sonuc dogru  , tebrikler!");
 else{
     System.out.println("Cevabin yanlis!");
     System.out.println(sayi1 + " - " + sayi2 + " sonucu " + (sayi1 - sayi2) + " olmali... ");
     
 }
    }
    
}
