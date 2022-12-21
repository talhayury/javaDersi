import java.util.Scanner;

public class Ders21 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (// kendisi hariç pozitif tam bölenlerinin toplamı kendine eşit olan sayılara mükemmel sayılar denir
        Scanner scan = new Scanner(System.in)) {
            System.out.println("lütfen bir sayı giriniz");
            int sayi=scan.nextInt();
            int toplam=0;
            for (int i = 1; i < sayi; i++) {
                if(sayi%i==0){
                    toplam=toplam+i;
                }
            }
            if(toplam==sayi){
                System.out.println("girilen sayı mükemmel sayıdır");
            }else{
                System.out.println("girilen sayı mükemmel sayı değildir");
            }
        }
    }

}
