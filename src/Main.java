import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, minNear = 0, maxNear = 0;
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
//        System.out.println("Dizi : "+ Arrays.toString(dizi));
        System.out.println(Arrays.toString(dizi));
        Arrays.sort(dizi);
        System.out.print("Bir sayi giriniz : ");
        number = inp.nextInt();
        for (int i = 0; i < dizi.length; i++) {
            if (number < dizi[i]) {
                maxNear = dizi[i];
                break;
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            if (number > dizi[i]) {
                minNear = dizi[i];
            }
        }

        System.out.println("Girilen sayıdan kücük en yakın sayı : " + minNear);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxNear);

    }
}