import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, turkce, muzik, fizik, kimya, dersSayisi = 5;
        double ort ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();
        if (mat<0 || mat>100 ){
            mat = 0;
            dersSayisi--;
            System.out.println("Hatalı not, bu ders ortalamaya girmeyecek.");
        }
        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();
        if (turkce<0 || turkce>100){
            turkce = 0;
            dersSayisi--;
            System.out.println("Hatalı not, bu ders ortalamaya girmeyecek.");
        }
        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();
        if (muzik<0 || muzik>100){
            muzik = 0;
            dersSayisi--;
            System.out.println("Hatalı not, bu ders ortalamaya girmeyecek.");
        }
        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();
        if (fizik<0 || fizik>100){
            fizik = 0;
            dersSayisi--;
            System.out.println("Hatalı not, bu ders ortalamaya girmeyecek.");
        }
        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();
        if (kimya<0 || kimya>100){
            kimya = 0;
            dersSayisi--;
            System.out.println("Hatalı not, bu ders ortalamaya girmeyecek.");
        }
        if (dersSayisi>0) {
            ort = (mat + turkce + muzik + fizik + kimya) / dersSayisi;
            System.out.println("Ortalamanız : " + ort);
            if (ort >= 55) {
                System.out.println("Sınıfı Geçtiniz...");
            } else {
                System.out.println("Sınıfı Geçemediniz...");
            }
        }else{
            System.out.println("Hiç geçerli not girilmedi.");

        }
    }
}