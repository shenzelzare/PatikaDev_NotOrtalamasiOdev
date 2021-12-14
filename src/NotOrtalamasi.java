import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int matematik, fizik, kimya, turkce, tarih, muzik, toplam ;
        double ortalama;
        System.out.print("matematik notunuz :");
        matematik = scanner.nextInt();
        System.out.print("fizik notunuz : ");
        fizik = scanner.nextInt();
        System.out.print("kimya notunuz :");
        kimya = scanner.nextInt();
        System.out.print("turkce notunuz : ");
        turkce = scanner.nextInt();
        System.out.print("tarih notunuz :");
        tarih = scanner.nextInt();
        System.out.print("muzik notunuz : ");
        muzik = scanner.nextInt();
         toplam = matematik+fizik+kimya+turkce+tarih+muzik;
         ortalama =(toplam/6.0);
        System.out.println("not ortalamasi : "+ ortalama);
        System.out.println(ortalama > 60 ? "sinifi gecti" : "Sinifta kaldi");

    }
}
