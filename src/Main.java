import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat,fiz,tur,kim,muz;
        double average=0.0,sayac=0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat=input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fiz=input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        tur=input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kim=input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muz=input.nextInt();

        if(mat>0 && mat<100){
            average = mat;
            sayac++;
        }

        if(fiz>0 && fiz<100){
            average += fiz;
            sayac++;
        }

        if(tur>0 && tur<100){
            average += tur;
            sayac++;
        }

        if(kim>0 && kim<100){
            average += kim;
            sayac++;
        }

        if(muz>0 && muz<100){
            average += muz;
            sayac++;
        }

        if((average/sayac) >= 55){
            System.out.println("Tebrikler Geçtiniz");
        }
        else {
            System.out.println("Sınıfta Kaldınız.");
        }

        System.out.println("Ortalamanız: " + (average/sayac));

    }
}
