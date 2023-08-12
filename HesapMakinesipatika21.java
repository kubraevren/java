import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class HesapMakinesipatika21 {

	public static void main(String[] args) {
		/*
		 * 1- Toplama İşlemi
		 *  2- Çıkarma İşlemi 
		 *  3- Çarpma İşlemi 
		 *  4- Bölme işlemi 
		 *  5- Üslü Sayı Hesaplama 
		 *  6- Faktoriyel Hesaplama 
		 *  7- Mod Alma 
		 *  8- Dikdörtgen Alan ve Çevre Hesabı
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Hangi islemi yapmak istersiniz? \n 1- Toplama \n 2- Cikarma \n 3- Carpma"
		+ "\n 4- Bolme \n 5- Us alma \n 6- Faktoriyel \n 7- Mod Alma"
		+ "\n 8- Dikdortgen alan ve cevre hesabi");
		int secim;
		do {
			System.out.print("\nhangi islemi yapmak istersiniz? \n");
			secim=in.nextInt();
		switch (secim) {
		case 1: {
			System.out.println("toplama islemi");
			System.out.print("kac sayi gireceksiniz?  \n");
			int a=in.nextInt();int toplam=0;
			for(int i=1;i<=a;i++) {
				int b=in.nextInt();
				toplam+=b;
			}
			System.out.print("\n sonuc: " + toplam);
			break;
		}
		case 2:{
			System.out.println("cikarma islemi");
			System.out.print("ilk sayi: ");
			int a=in.nextInt();
			System.out.print("\n ikinci sayi: ");
			int b=in.nextInt();
			System.out.print("\n sonuc: " + (a-b));
			break;
		}
		case 3:{
			System.out.println("carpma islemi");
			System.out.print("ilk sayi: ");
			int a=in.nextInt();
			System.out.print("\n ikinci sayi: ");
			int b=in.nextInt();
			System.out.print("\n sonuc: " + (a*b));
			break;
		}
		case 4:{
			System.out.println("bolme islemi");
			System.out.print("ilk sayi: ");
			int a=in.nextInt();
			System.out.print("\n ikinci sayi: ");
			int b=in.nextInt();
			if(b==0) {
				System.out.println("sayi 0'a bolunmez!");
				System.out.print("\n ikinci sayi: ");
				int c=in.nextInt();
				System.out.print("\n sonuc: " + (a/c));
			}else {
			System.out.print("\n sonuc: " + (a/b));}
			break;
		}
		case 5:{
			System.out.println("us alma");
			System.out.print("ilk sayi: ");
			int a=in.nextInt();
			System.out.print("\n ikinci sayi: ");
			int b=in.nextInt();
			System.out.print("\n sonuc: " + (Math.pow(a, b)));
			break;
		}
		case 6:{
			System.out.println("faktoriyel alma");
			System.out.print("sayi: ");
			int a=in.nextInt();
			int faktoriyel=1;
			for(int i=1;i<=a;i++) {
				faktoriyel=faktoriyel*i;
			}
			System.out.print("\n sonuc: " +faktoriyel);
			break;
		}
		case 7:{
			System.out.println("mod alma");
			System.out.print("ilk sayi: ");
			int a=in.nextInt();
			System.out.print("\n ikinci sayi: ");
			int b=in.nextInt();
			System.out.print("\n sonuc: " + (a%b));
			break;
		}
		case 8:{
			System.out.println("dikdortgen alan ve cevre");
			System.out.print("ilk sayi: ");
			int a=in.nextInt();
			System.out.print("\n ikinci sayi: ");
			int b=in.nextInt();
			System.out.print("\n alan: " + (a*b));
			System.out.print("\n cevre: " + (2*a+2*b));
			break;
		}

		default: 
			System.out.println("yanlis deger!");
		}
		} while (secim!=0);
		
	}

}
