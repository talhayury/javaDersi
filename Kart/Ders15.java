public class Ders15 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double[] myList = { 1.2, 2.2, 3.8, 4.9, 7.7, 4 };
        for (double number : myList) {
            System.out.println(number);

        }
        System.out.println("------------------------------------");
        double a = 0;
        for (double sayi : myList) {
            a = a + sayi;

        }
        System.out.println(a);
        System.out.println("--------------------------------------");
        double max = myList[0];
        for (double sayi1 : myList) {//dizinin elemanlarını tek tek dolaşmak için kullanılır
            if (max < sayi1) {
                max = sayi1;

            }
        }
        System.out.println("en büyük sayı= " + max);

    }

}
