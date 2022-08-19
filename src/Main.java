import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi,sayi2=0;
        boolean durum = true;
        while(durum){
            System.out.print("Bir sayı giriniz (Çıkış için 99 yazın):");
            sayi = girdi.nextInt();
            if(sayi==99){
                break;
            }
            for (int i = 1;i<sayi;i++){
                if(sayi%i==0){
                    sayi2+=i;
                }
            }
            if(sayi2==sayi){
                System.out.println(sayi + " Mükemmel sayıdır.");
            }else{
                System.out.println(sayi+" Mükemmel sayı değildir.");
            }


        }

    }
}
