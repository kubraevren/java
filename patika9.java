import java.util.Scanner;

public class patika9 {

	public static void main(String[] args) {
		/*
		 * ava döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran
		 * programı yazıyoruz.
		 * 
		 * Ödev Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini
		 * ekrana yazdıran programı yazıyoruz.
		 */
		
		Scanner in =new Scanner(System.in);
         System.out.println("sayi : ");
		int sayi=in.nextInt();

		int i;
		for(i=0;i<=sayi;i++) {
			if(Math.pow(2, i)<sayi) {
				System.out.println(Math.pow(2, i));
			}
		}
		System.out.println();
		for(i=1;i<=sayi;i*=2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		int a;
		for(a=0;a<=sayi;a++) {
			if(Math.pow(4, a)<sayi&&Math.pow(5, a)<sayi) {
				System.out.println(Math.pow(4, a) +" - "+ Math.pow(5, a));
			}
		}
		
	}

}
