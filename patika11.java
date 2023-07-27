import java.util.Scanner;

public class patika11 {

	public static void main(String[] args) {
		/*
		 * Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı
		 * yazıyoruz.
		 * 
		 * Armstrong Sayı Nedir ? N haneli bir sayının basamaklarının n’inci üstlerinin
		 * toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
		 * ------- Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
		 * Örnek : 1643 = 1 + 6 + 4 + 3 = 14
		 */

		Scanner in = new Scanner(System.in);
		System.out.print("sayi : ");
		int sayi = in.nextInt();
		int sayiYedek = sayi;
		int sayac = 0;
		int sayi2;
		int toplam = 0;
		while (sayi > 0) {
			sayi /= 10;
			sayac++;
		}
		System.out.println("Girdiginiz sayinin basamak sayisi = " + sayac);

		sayi = sayiYedek;
		while (sayi != 0) {
			sayi2 = sayi % 10;
			toplam += Math.pow(sayi2, sayac);
			sayi /= 10;
		}

		System.out.println(toplam);
		
		if(sayiYedek==toplam)
			System.out.println("sayi armstrongtur." );
		else {
			System.out.println("armstrong degildir.");
		}
		
		System.out.println("---");
		
		System.out.println("sayinin basamak toplami : "+basamakToplam(sayiYedek));

	}

	public static int basamakToplam(int sayi) {
		int toplam = 0, sayi2 = 0;
		while (sayi != 0) {
			sayi2 = sayi % 10;
			sayi /= 10;
			toplam += sayi2;
		}

		return toplam;
	}

}
