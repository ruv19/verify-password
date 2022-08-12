package javaapplication1;

import java.util.Scanner;
 
public class JavaApplication1 {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String isim = "Ahmet",sifre= "Gedik";
        
        System.out.println("Kullanıcı ismi:");
        String kul_ad=scan.nextLine();
        System.out.println("Kullanıcı şifresi:");
        String kul_sifre=scan.nextLine();
        
        if(isim.equals(kul_ad) && !sifre.equals(kul_sifre) ) {
            System.out.println("İsim doğru , şifre yanlış!");
        }
        else if(!isim.equals(kul_ad) && sifre.equals(kul_sifre)) {
            System.out.print("İsim yanlış, şifre doğru!");
        }
        else if(isim.equals(kul_ad) && sifre.equals(kul_sifre)) {
            System.out.println("Hoşgeldiniz!");
        }
    }
}
