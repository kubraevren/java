import java.util.Scanner;

public class patika8 {

	public static void main(String[] args) {
		/*
		 * Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri
		 * kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı
		 * yazıyoruz.
		 * 
		 * Ödev Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
		 * kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp
		 * ekrana basan programı yazıyoruz.
		 */

		Scanner in = new Scanner(System.in);
		int sayi, toplam = 0;

	/*	do {
			System.out.print("sayi: ");
			sayi = in.nextInt();

			if (sayi % 2 == 1) {
				toplam += sayi;
				System.out.println("dongudeki teklerin toplami : " + toplam);
			}
		} while (sayi > 0);

		System.out.println();
		System.out.println("teklerin toplami: " + toplam);
		*/
		
		do {
			System.out.print("sayi: ");
			sayi = in.nextInt();

			if (sayi % 2 == 0 && sayi%4== 0 ) {
				toplam += sayi;
				System.out.println("dongudeki ciftlerin toplami : " + toplam);
			}
		} while (sayi %2== 0);
		
		System.out.println("ciftlerin toplami: " + toplam);


	}

}
