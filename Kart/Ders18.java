public class Ders18 {
    public static void main(String[] args) {
        String mesaj = "    Bugün hava çok güzel     .";
        System.out.println(mesaj);
        //replace=değiştrimek
        System.out.println(mesaj.replace(' ','-'));//girilen karakteri istediğimiz karakterle değiştirir
        System.out.println(mesaj.substring(5, 9));//mesajı nerden itibaren alayım?(girilen sayıdan itibaren)

        for(String kelime:mesaj.split(" ")){
            System.out.println(kelime);

        }//split girilen stringe geldiğinde cümleyi ayırır

        System.out.println(mesaj.toLowerCase());//cümlenin tamamını küçük harflerle tekrar yazar
        System.out.println(mesaj.toUpperCase());//cümlenin tamamını büyük harflerle tekrar yazar

        System.out.println(mesaj.trim());//başında ve sonundaki boşlukları alır
    
}
}