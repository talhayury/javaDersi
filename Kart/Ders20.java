class ders20{
    /**
     * @param args
     */
    public static void main(String[] args) {
        char karakter='a';
        switch(karakter){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("girilen karakter bir kalın sesli harfdir");
            break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
            System.out.println("girilen karakter bir ince sesli harfdir");
            break;
            default:
            System.out.println("lütfen bir sesli harf giriniz");
        }

    }
}