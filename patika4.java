import java.util.Scanner;

public class patika4 {

	public static void main(String[] args) {
		/*
		 * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
		 * Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp
		 * ekrana yazdırın.
		 * 
		 * Formül Kilo (kg) / Boy(m) * Boy(m)
		 * 
		 * 18, 5 kg/m² ‘nin altındaki sonuçlar: İdeal kilonun altında 18, 5 kg/m² ile
		 * 24, 9 kg/m² arasındaki sonuçlar: İdeal kiloda 25 kg/m² ile 29, 9 kg/m²
		 * arasındaki sonuçlar: İdeal kilonun üstünde 30 kg/m² ile 39, 9 kg/m²
		 * arasındaki sonuçlar: İdeal kilonun çok üstünde (obez) 40 kg/m² üzerindeki
		 * sonuçlar: İdeal kilonun çok üstünde (morbid obez)
		 */

		Scanner in = new Scanner(System.in);
		System.out.print("kilonuz: ");
		double kilo = in.nextDouble();
		System.out.print("boyunuz:(metre olarak) ");
		double boy = in.nextDouble();

		double indeks = kilo / (boy * boy);

		System.out.println("vucut indeksiniz: " + indeks);

		if (indeks < 18.5) {
			System.out.println("ideal kilonun alti..");
		} else if (indeks >= 18.5 && indeks <= 24.9) {
			System.out.println("idealsiniz...");
		} else if (indeks >= 25 && indeks <= 29.9) {
			System.out.println("ideal kilonun ustu..     :(");
		} else if (indeks >= 30 && indeks <= 39.9) {
			System.out.println("ideal kilonun cok ustunde... obezsin kardesim!");
		} else {
			System.out.println("ideal kilonun cokk ustunde.. morbid obez");
		}

	}
}
