
public class Patika18AsalSAyi {

	public static void main(String[] args) {
		int sayi, bolen = 0;
System.out.print("1-100 arasi ");
		for (int i = 1; i <= 100; i++) {
			for (int k = 1; k <= 100; k++) {
				sayi = i % k;
				if (sayi == 0) {
					bolen++;
				}
			}
			if(bolen==2) {
				System.out.print("asal sayilar: "+i +"\n");
			}
			bolen=0;
		}
	}
}
