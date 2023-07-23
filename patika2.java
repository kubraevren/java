import java.util.Scanner;

public class patika2 {

	public static void main(String[] args) {
		/*
		 * KDV Tutarı Hesaplayan Program
		 *  Java ile kullanıcıdan alınan para değerinin
		 * KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
		 * (Not : KDV tutarını 18% olarak alın) 
		 * KDV'siz Fiyat = 10;
		 * KDV'li Fiyat = 11.8;
		 * KDV tutarı = 1.8;
		 * Ödev Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000
		 * TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı
		 * yazınız.
		 * 
		 */
		

		Scanner in = new Scanner(System.in);
		System.out.print("para degeriniz:");
		double para=in.nextDouble();
		double kdv;
		if(para>=0 && para<=1000) {
			kdv=(para*18)/100;
			para+=kdv;
			System.out.println("yeni paraniz:" + para + " \nkdv tutari : " + kdv);
		} 
		else if(para>1000) {
			kdv=(para*8)/100;
			para+=kdv;
			System.out.println("yeni paraniz:" + para + " \nkdv tutari : " + kdv);
		}
		else {
			System.out.println("paraniz eksi olamaz!");
		}
		
		
	}

}
