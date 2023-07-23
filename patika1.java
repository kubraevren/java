import java.util.Scanner;

public class patika1 {

	public static void main(String[] args) {
		// Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav
		// puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan
		// programı yazın.

		// Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının
		// ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı"
		// yazsın.

		// If ve Else kullanılmayacak...

		Scanner inputScanner = new Scanner(System.in);
		System.out.print("matematik notunuzu girin:");
		int mat = inputScanner.nextInt();
		System.out.print("fizik notunuzu girin:");
		int fizik = inputScanner.nextInt();
		System.out.print("kimya notunuzu girin:");
		int kimya = inputScanner.nextInt();
		System.out.print("turkce notunuzu girin:");
		int turkce = inputScanner.nextInt();
		System.out.print("tarih notunuzu girin:");
		int tarih = inputScanner.nextInt();
		System.out.print("muzik notunuzu girin:");
		int muzik = inputScanner.nextInt();

		int ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

		System.out.println(ortalama < 60 ? "gecemediniz" : "gectiniz");
		System.out.println("ortalamaniz: " + ortalama);

	}

}
