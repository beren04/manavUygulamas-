package first;

import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        System.out.println("Armut : 2,14 TL \nElma : 3,67 TL \nDomates : 1,11 TL \nMuz: 0,95 TL \nPatlıcan : 5,00 TL");
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kilo armut almak istiyorsunuz?");
        byte armut = input.nextByte();
        System.out.println("Kaç kilo elma almak istiyorsunuz?");
        byte elma = input.nextByte();
        System.out.println("Kaç kilo domates almak istiyorsunuz?");
        byte domates = input.nextByte();
        System.out.println("Kaç kilo muz almak istiyorsunuz?");
        byte muz = input.nextByte();
        System.out.println("Kaç kilo patlıcan almak istiyorsunuz?");
        byte patlican = input.nextByte();
        System.out.print("Ödeyeceğiniz tutar:"+(armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5));
    }
}
