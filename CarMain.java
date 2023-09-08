
public class CarMain {

	public static void main(String[] args) {

		System.out.println("---------------------");
		Car audi = new Car();
		audi.model = "audi a3";
		audi.hiz = 10;
		System.out.println(audi.model);
		audi.HizYazdirma();
		audi.HizArtirma(30);
		audi.HizYazdirma();
		audi.HizAzaltma(20);
		audi.HizYazdirma();

		System.out.println();

		System.out.println("-----------------------------");
		Car bmw = new Car();
		bmw.model = "bmw2";
		bmw.hiz = 20;
		System.out.println(bmw.model);
		bmw.HizYazdirma();

		System.out.println();

		System.out.println("---------------------");
		Car mercedes = new Car();
		mercedes.model = "mercedes3";
		mercedes.hiz = 30;
		System.out.println(mercedes.model);
		mercedes.HizYazdirma();

		System.out.println();

		System.out.println("----------------------------");
		Car honda = new Car("honda 2", 45, "mavi", "araba");
		// String model,int hiz,String renk,String tip

		// yapici metot parametre aldigi icin
		// "yapici metot calisti"
		// yazmaz cunku o parametresiz metot cagrildiginda calisir.

		System.out.println("parametreli yapici metot" + " calisti \n");
		System.out.println(honda.model);
		honda.HizYazdirma();

		System.out.println();

		honda.print();

	}

}
