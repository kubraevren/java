import java.util.Scanner;

public class EbobEkokPatika15 {

	public static void main(String[] args) {
		/*
		 * Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.
		 * 
		 * EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu
		 * sayıların en büyük ortak böleni, kısaca EBOB‘u denir. EKOK : İki ya da daha
		 * fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak
		 * katı, kısaca EKOK‘u denir.
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("n1: ");
		int n1 = input.nextInt();
		System.out.print("n2: ");
		int n2 = input.nextInt();

		System.out.println("\nEBOB : " + ebob(n1, n2));
		System.out.println();

		System.out.print("n3: ");
		int n3 = input.nextInt();
		System.out.print("n4: ");
		int n4 = input.nextInt();

		int ekok = (n3 * n4) / ebob(n3, n4);

		System.out.println("\nEKOK :" + ekok);
	}

	public static int ebob(int n1, int n2) {
		int i;
		int max = 0;
		System.out.print("ortak bolenler: ");
		for (i = 1; (i <= n1) && (i <= n2); i++) {
			if ((n1 % i == 0) && (n2 % i == 0)) {
				System.out.print(i + " ");
				max = i;
			}
		}
		return max;
	}

}
