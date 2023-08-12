import java.util.Arrays;

public class PolindromPatika20 {

	public static void main(String[] args) {
		// 1, 4, 8, 99, 101, 363, 4004, 9889 polindrom

		if(polindrom(63255236)) {
			System.out.println("EVET POLINDROM");
		}else {
			System.out.println("polindrom degil");
		}
		
        System.out.println("--------------------");

		int dizi7[] = {1,2,3,4,5};
		int dizi8[] = {1,2,3,4,5};
		
		System.out.println(Arrays.equals(dizi7, dizi8));
        System.out.println(dizi7.equals(dizi8));
        System.out.println(dizi8.equals(dizi7));
        
        System.out.println("--------");
        
        System.out.println(dizi7.equals(dizi7));
        System.out.println(dizi8.equals(dizi8));
        
        System.out.println("--------");

        System.out.println(dizi7==dizi8);

        System.out.println(dizi7==dizi7);
        
        System.out.println(dizi8==dizi8);
	
		
		
	}

	public static boolean polindrom(int x) {
		int sayac = 0, y = x;
		while (x != 0) {
			x = x / 10;
			sayac++;
		}// sayi kac basamak?
		int dizi[] = new int[sayac];
		int kalan = 0;
		int a = 0;
		while (y != 0) {
			kalan = y % 10;//kalan=6 / kalan=0 / 0 / kalan=4
			y = y / 10;//400 / 40 / 4 /0
			dizi[a] = kalan;
			System.out.print(dizi[a] + " ");
			a++; //diziyi tersten yazdırdık
		}
		System.out.println();
		System.out.println("-------------");
		int dizi2[] = new int[sayac];

		for(int i=0;i<sayac;i++) {
			dizi2[i]=dizi[sayac-1-i];
			System.out.print(dizi2[i] + " ");
		}// tersten yazdirdigimiz dizinin tersini alarak aslini almis olduk
		System.out.println();
		if(Arrays.equals(dizi, dizi2)) {
			return true;
		}else {
			return false;
		}

	}

}
