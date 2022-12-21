
public class Ders9 {
 public static void main(String[] args) {
    int sayi1=100;
    int sayi2=200;
    int sayi3=500;
    if(sayi1>sayi2){
        if(sayi1>sayi3){
            System.out.println("en büyük sayı "+sayi1);
        }else{
            System.out.println("en büyük sayı "+sayi3);
        }
    }else if(sayi2>sayi3){
        System.out.println("en büyük sayı "+sayi2);
    }else{
        System.out.println("en büyük sayı "+sayi3);
    }
 }
}
