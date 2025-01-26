import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner latf=new Scanner(System.in);
        System.out.println("Öğrenci sayısı kaçtır ?");
        int sayi=latf.nextInt();
        int sayi1=1;
        double toplam=0;
        do {
            System.out.println(sayi1+". öğrenci vize notu giriniz");
            int vize=latf.nextInt();
            System.out.println(sayi1+". öğrenci final notu giriniz");
            int ffinal=latf.nextInt();
            double sinav=(vize*0.4)+(ffinal*0.6);
            toplam=toplam+sinav;
            sayi1++;}
        while (sayi==sayi1);{
            System.out.println("sınıf not ortalaması ="+toplam/sayi);
        }
    }
}