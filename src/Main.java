import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       float kilo,boy;
       System.out.println("Lütfen kilonuzu kg cinsinden giriniz:");
       kilo = input.nextFloat();
       System.out.println("Lütfen boyunuzu metre cinsinden giriniz:");
       boy=input.nextFloat();

       double vucut_indeks= (kilo/(boy*boy));
        System.out.println("Vücut kitle endeksiniz: " + vucut_indeks);
    }
}