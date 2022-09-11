import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      int n1,n2,select;

      Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz");
        n2 = input.nextInt();
        System.out.println("1- Toplama \n 2- Çıkartma \n 3- Çarpma \n 4- Bölme");
        System.out.println("İşlem seçimiz: ");
        select = input.nextInt();

        switch(select){
            case 1:
                System.out.println("Sonuç: " + (n1+n2));
                break;
            case 2:
                System.out.println("Sonuç: " + (n1-n2));
                break;
            case 3:
                System.out.println("Sonuç: " + (n1*n2));
                break;
            case 4:
                    switch (n2){
                        case 0:
                            System.out.println("Bir Sayı 0 a bölünemez !!! ");
                        default:
                            System.out.print("Sonuç: " + (n1/n2));
                    }
                break;
            default:
                System.out.print("Geçersiz bir değer girdiniz");
        }


    }
}