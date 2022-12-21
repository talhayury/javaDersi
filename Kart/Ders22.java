import java.util.Scanner;

public class Ders22 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //İki sayı birbirinin kendisi hariç bölenleri toplamına eşitse bu sayılara arkadaş sayılar denir.(220/284)
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen birinci sayıyı giriniz");
        int sayi1=scan.nextInt();
        System.out.println("lütfen ikinci sayıyı giriniz");
        int sayi2=scan.nextInt();
        int toplam1=0;
        int toplam2=0;
        for (int i = 1; i < sayi1; i++) {
            if(sayi1%i==0){
                toplam1=toplam1+i;
            }
        }
        for (int j = 1; j < sayi2; j++) {
            if(sayi2%j==0){
                toplam2=toplam2+j;
            }
        }
        if(toplam1==sayi2 & toplam2==sayi1){
            System.out.println("girilen sayılar arkadaş sayıdır");
        }else{
            System.out.println("girilen sayılar arkadaş sayı değildir");
        }
    }
}
