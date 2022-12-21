import java.util.Scanner;

public class Ders23 {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,8,9,} ;
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int aranacak = scan.nextInt();
        int sayac=0;
        for (int i = 0; i < sayilar.length; i++) {
            if(sayilar[i]==aranacak){
               System.out.println("sayıyı buldunuz.Yazdığınız sayı "+(i+1)+". sırada");
               sayac++;
               break;
            }
        }
        if(sayac<1){
            System.out.println("girilen sayı dizi içerisinde yok");
        }
    }
}
