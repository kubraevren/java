
import java.util.Scanner;

public class patika16 {

	public static void main(String args[]) {

		
		Scanner inScanner=new Scanner(System.in);
		System.out.print("kac sayi gireceksiniz? ");
		int n=inScanner.nextInt();
		int degsiken=0;
		int enbuyuk=2147483647;
		for(int i=0;i<n;i++) {
			int sayi=inScanner.nextInt();
			if(sayi>degsiken)
			degsiken=sayi;
			if(sayi<enbuyuk)
				enbuyuk=sayi;
		}
		
		System.out.print("aralarindaki en buyuk sayi :"+ degsiken+"\n");
		System.out.print("en kucuk sayi : " + enbuyuk);
		
		
	}

}
