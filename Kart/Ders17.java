public class Ders17 {
    public static void main(String[] args) {
        //.concat() birleştirme işine yarar
        String mesaj="bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("eleman sayısı = "+mesaj.length());//mesajın uzunluğunu verir
        System.out.println("5. eleman = "+mesaj.charAt(4));//5. elemanında ne olduğunu söyler
        System.out.println(mesaj.concat(" yaşasın!"));//stringleri birleştirir
        System.out.println(mesaj.startsWith("b"));//girilen string ile başlayıp başlamadığını kont eder(true or false)
        System.out.println(mesaj.endsWith("a"));//girilen string ile bitip bitmediğini kontrol eder

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);//mesaj stringin ilk 5 harfini alır
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("ş"));//kaçıncı elemanı olduğunu bulur
        System.out.println(mesaj.lastIndexOf("ü"));//sondan aramaya başlar baştan kaçıncı sırada olduğunu verir

    }
}
