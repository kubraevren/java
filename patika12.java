import java.util.Scanner;

public class patika12 {

	public static void main(String[] args) {

		//harmonik sayilar
		
		Scanner in = new Scanner(System.in);
		System.out.print("sayi: ");
		int sayi=in.nextInt();
		
		double harmonik=0;
		for(double i=1;i<=sayi;i++) {
			harmonik+=(1/i);
		}
		
		System.out.println(harmonik);
	}

}
