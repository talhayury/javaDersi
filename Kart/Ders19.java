public class Ders19{
    public static void main(String[] args) {
        //return; diğer döngülere girmeden o methotu bitirir
        int sayi=0;
        int bayrak=0;
        if(sayi<=1){
            System.out.println("sayı asal değildir");
            return;
        }else{
            for (int i = 2; i < sayi; i++) {
                if(sayi%i==0){
                    bayrak++;
                }
            }

        }
        if(bayrak>0){
            System.out.println("girilen sayı asal değildir");
        }else{System.out.println("girilen sayı asaldır");}
    }
}