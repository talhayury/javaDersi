public class Ders10 {
    public static void main(String[] args) {
        char grade = 'E';

        switch (grade) {
            case 'A':
                System.out.println("mükemmel:geçtiniz");
                break;
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("güzel:geçtiniz");
                break;
            case 'F':
                System.out.println("maalesef:kaldınız");
                break;
            default:
                System.out.println("geçersiz not girdiniz");

        }

    }
}
