import java.util.Scanner;

public class patika17mukemmelsayi {

	public static void main(String[] args) {
		// Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen
		// sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
		
		Scanner inScanner=new Scanner(System.in);
		System.out.print("n: ");
		int n=inScanner.nextInt();
		
		int a=1,toplam=0;
		while(n>a) {
			if(n%a==0) {
				toplam+=a;
				System.out.println(a);}
			a++;
		}
		
		if(n==toplam) 
		System.out.println("mukemmel sayidir.");
		else {
			System.out.println("mukemmel sayi degildir.");
		}

	}

}
