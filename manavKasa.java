import java.util.Scanner;
public class manavKasa {
    public static void main(String[]args){
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        double armutKilo, elmaKilo, domatesKilo, muzKilo,  patlicanKilo;
        Scanner inp=new Scanner(System.in);
        System.out.println("Armut Kaç Kg?:");
        armutKilo= inp.nextDouble();

        System.out.println("Elma Kaç Kg?:");
        elmaKilo= inp.nextDouble();

        System.out.println("Domates Kaç Kg?:");
        domatesKilo= inp.nextDouble();

        System.out.println("Muz Kaç Kg?:");
        muzKilo= inp.nextDouble();

        System.out.println("Patlıcan Kaç kg?:");
        patlicanKilo= inp.nextDouble();

        double toplam;
        toplam=((armutKilo*armut)+(elmaKilo*elma)+(domatesKilo*domates)+(muzKilo*muz)+(patlicanKilo*patlican));
        System.out.println("Toplam alışveriş tutarı:"+toplam);

    }

}
