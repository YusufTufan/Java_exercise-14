public class GaripSayi {
    public static void main(String[] args) {
        int sayi = 371;
        if(garipMi(sayi)){
            System.out.println(sayi + " garip sayıdır.");
        }else{
            System.out.println(sayi + "  garip sayı değildir");
        }
    }
    public static boolean garipMi(int sayi){
        if(sayi<100 || sayi>999){
            System.out.println("3 basamaklı sayı girmedin.");
            return false;
        }
        int birler = sayi%10;
        int onlar = (sayi/10)%10;
        int yuzler = sayi/100;
        int sum = (birler*birler*birler)+(onlar*onlar*onlar)+(yuzler*yuzler*yuzler);
        return sum ==sayi;
    }
}