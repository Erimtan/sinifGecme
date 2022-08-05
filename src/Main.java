import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik;

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.print("Turkce notunuz: ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.print("Muzik notunuz: ");
        muzik = input.nextInt();

        if (mat < 0 || mat > 100){
            mat = 0;
        }
        if (fizik < 0 || fizik > 100){
            fizik = 0;
        }
        if (kimya < 0 || kimya > 100){
            kimya = 0;
        }
        if (turkce < 0 || turkce > 100){
            turkce = 0;
        }
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
        }

        double ortalama = (mat + fizik + turkce + kimya + muzik) / 5;

        if(ortalama<=55){
            System.out.println("Sinifta kaldiniz!");
        }else {
            System.out.println("Sinifi gectiniz!");
        }
        System.out.println("Average: " + ortalama);
    }
}