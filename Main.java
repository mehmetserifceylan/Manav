import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        Scanner input=new Scanner(System.in);
        System.out.print("Armut kaç kilo? :");
        int armutKilo=input.nextInt();
        System.out.print("Elma kaç kilo? :");
        int elmaKilo=input.nextInt();
        System.out.print("Domates kaç kilo? :");
        int domatesKilo=input.nextInt();
        System.out.print("Muz kaç kilo? :");
        int muzKilo=input.nextInt();
        System.out.print("Patlıcan kaç kilo? :");
        int patlicanKilo=input.nextInt();

        double toplam=armut*armutKilo+elma*elmaKilo+domates*domatesKilo+muz*muzKilo+patlican*patlicanKilo;
        System.out.println("Toplam tutar:"+toplam);
    }
}