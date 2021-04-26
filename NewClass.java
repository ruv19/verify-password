
package NewClass;



import java.util.Scanner;

public class NewClass {
    public static void main (String [] args)
    {
        Scanner  scan = new Scanner (System.in);
         String isim = "Esra";
         int elma_fiyat=5,port_fiyat=6;
         int elma_kilo,port_kilo;
         int toplam_tutar=0;
         
         System.out.print("Kaç kilo elma ve portakal istiyorsunuz ?");
         elma_kilo=scan.nextInt();
         port_kilo=scan.nextInt();
         
         toplam_tutar=(elma_fiyat*elma_kilo)+(port_fiyat*port_kilo);
         
         System.out.print("Merhaba"+isim+", bugün"+elma_kilo+" Kg elma"+port_kilo+" Kg portakal istediniz.Toplam borcunuz: "+toplam_tutar);
    }
         
    }
    

