
public class RecursiveUsPatika22 {

	public static void main(String[] args) {

		int bd = UsAlma(2, 3);
		System.out.println("cevap:" + bd);
	}

	public static int UsAlma(int a,int b) {
		if(b==1) {
			return a*b;
		}
		return 2*UsAlma(a, b-1);
	}

}
