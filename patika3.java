import java.util.Scanner;

public class patika3 {

	public static void main(String[] args) {
		// Taksimetre Programı
		/*
		 * Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran
		 * programı yazın.
		 * 
		 * Taksimetre KM başına 2.20 TL tutmaktadır. Minimum ödenecek tutar 20 TL'dir.
		 * 20 TL altında ki ücretlerde yine 20 TL alınacaktır. Taksimetre açılış ücreti
		 * 10 TL'dir.
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.print("kac km gittiniz? ");
		double km = in.nextDouble();
		
		double acilis = 10;
		double ucret=acilis+(km*2.20);
				
		if(ucret<=20) {
			System.out.println("normal ucretiniz " + ucret + " tl idi");
			ucret=20;
			System.out.println("ancak kural geregi artik " +ucret + " tl oldu...");
		}else {
			System.out.println("taksimetreniz " + ucret+ " tl tutmustur.");
		}
	}

}
