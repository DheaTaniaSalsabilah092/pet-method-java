import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Bilangan Bulat: ");
        int bilangan = scanner.nextInt();


        boolean isGanjil = !(bilangan % 2 == 0);

       if (isGanjil) {
           System.out.println("Bilangan " + bilangan + " adalah Ganjil");
       }else{
           System.out.println("Bilangan "+ bilangan + " adalah Genap");
       }

        scanner.close();


    }
}
