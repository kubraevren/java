import java.util.Scanner;

public class patika7 {

	public static void main(String[] args) {
		/*
		 * 1- Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan
		 * programı yazıyoruz.
		 * 
		 *2-  Ödev Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
		 * tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.print("ilk soru icin 1. sayiyi girin: ");
		int birinciSayi=in.nextInt();
		
		for(int i=0;i<=birinciSayi;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.print("ikinci soru icin 2. sayiyi girin: ");
		int ikinciSayi=in.nextInt();
		int toplam=0; int i;int d=0;
		for(i=0;i<=ikinciSayi;i++) {
			if(i%3==0 && i%4==0) {
				toplam+=i;
				System.out.println("3 ve 4'e tam bolunen sayilar: " + i);
				d++;
			}
		}
		System.out.println("toplam : "+toplam);
		System.out.println("dongu bu kadar calisti : "+i);
		System.out.println("sayilarin ortalamasi : " + (toplam/d));
	}

}
