import java.util.Scanner;

public class RecursiveAsalPatika23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("sayi: ");
		int sayi = in.nextInt();

		int a = Asal(sayi);
		if (a == 0) {
			System.out.println("asal degil.");

		} else {
			System.out.println("ASAL!");
		}

	}

	public static int Asal(int sayi) {
		int a = sayi, sayac = 0;
		while (a != 0) {
			int cevap = sayi % a;
			a--;
			if (cevap == 0) {
				sayac++;
			}
		}
		if (sayac == 2) {
			return 1;
		} else {
			return 0;
		}
	}

}
