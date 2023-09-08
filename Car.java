
public class Car {

	// modelleme yapiyoruz
	// 4 tane nitelik tanimladik. degiskenlerle tanimladik.

	String tip;
	String model;
	String renk;
	int hiz;	
	//constructor
	Car(){// her nesne cagrildiginda constructor da cagrilir.
		System.out.println("yapici metot calisti");
	}
	
	Car(String model,int hiz,String renk,String tip){//parametreli constructor
		this.model=model;
		this.hiz=hiz;
		this.renk=renk;
		this.tip=tip;
	}

	// arabalarin davranisini metotla tanimlicaz.

	void HizArtirma(int artirilcakDeger) {
			this.hiz += artirilcakDeger;
		
	}

	void HizAzaltma(int azaltilacakDeger) {
		if (this.hiz > 0) {
			this.hiz -= azaltilacakDeger;
		}
	}

	void HizYazdirma() {
		System.out.println("hiz: " + this.hiz);
	}
	
	void print() {
		System.out.println("model: " + this.model);
		System.out.println("renk : " + this.renk);
		System.out.println("tip: " + this.tip);
		System.out.println("hiz: " + this.hiz);

	}
}
