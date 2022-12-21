public class Ders14 {
    public static void main(String[] args) {
        // arrays(diziler)
        // [] array diye okunur
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "ayşe";
        ogrenciler[1] = "fatma";
        ogrenciler[2] = "ali";
        ogrenciler[3] = "talha";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

    }
}
