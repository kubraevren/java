import java.util.Scanner;

public class RecursiveSayiPatika24 {

	public static void main(String[] args) {
		// Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5
		// rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
		// Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme
		// işleminde sayının son değerini ekrana yazdırın. DONGUSUZ
		

		Scanner inScanner = new Scanner(System.in);
		System.out.print("sayi: ");
		int a = inScanner.nextInt();
		int temp = a;

		boolean durum = true;
		dondur(a, temp, durum);

	}

	static void dondur(int a, int temp, boolean durum) {
		if (a >= -5 && durum == true) {
			System.out.println(a);
			dondur(a - 5, temp, durum);
			return;
		}
		if (a < 0) {
			a += 10;
		}
		if (a <= temp) {
			durum = false;
			System.out.println(a);
			dondur(a + 5, temp, durum);
			return;
		}
		if (a > temp) {
			return;
		}
	}
}
