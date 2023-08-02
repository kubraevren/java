import java.util.Scanner;

public class FibonacciPatika19 {

	public static void main(String[] args) {
		 //9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34

		Scanner inScanner=new Scanner(System.in);
		System.out.print("n: ");
		int n=inScanner.nextInt();
		
		int[]dizi=new int[n];
		
		dizi[0]=0;
		dizi[1]=1;
		
		for(int i=2;i<dizi.length;i++) {
			dizi[i]+=(dizi[i-1]+dizi[i-2]);
		}
		
		for(Integer asd:dizi) {
			System.out.print(asd + " ");
		}

	}

}
