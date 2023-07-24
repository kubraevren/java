import java.util.Scanner;

public class patika10 {

	public static void main(String[] args) {
		/*
		 * Java ile faktöriyel hesaplayan program yazıyoruz. N elemanlı bir kümenin
		 * elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
		 * kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde
		 * gösterilir.
		 * 
		 * Java ile kombinasyon hesaplayan program yazınız.
		 * 
		 * Kombinasyon formülü C(n,r) = n! / (r! * (n-r)!)
		 */

		Scanner in = new Scanner(System.in);
		System.out.print("sayi : ");
		int sayi = in.nextInt();

		int faktoriyel = 1;
		for (int i = 1; i <= sayi; i++) {
			faktoriyel *= i;
		}

		System.out.println(sayi + " sayisinin faktoriyeli : " + faktoriyel);
		System.out.println("----------------------------");

		System.out.println("N in r li kombinasyonu C(n,r) seklindedir.");
		System.out.print("n: ");
		int n = in.nextInt();

		System.out.print("r: ");
		int r = in.nextInt();
		
	
		// Kombinasyon formülü C(n,r) = n! / (r! * (n-r)!)
		double kombinasyon= (fakt(n))/(fakt(r)*(fakt(n-r)));
		
		System.out.println("C(n,r) = " + kombinasyon);

	}
	
	public static double fakt(int sayi) {
		int faktoriyel = 1;
		for (int i = 1; i <= sayi; i++) {
			faktoriyel *= i;
		}
		return faktoriyel;
	}

}
