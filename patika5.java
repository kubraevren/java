import java.util.Scanner;

public class patika5 {

	public static void main(String[] args) {
		/*
		 * Ödev Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını
		 * sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
		 * ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı
		 * ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa
		 * "Şifre oluşturuldu" yazan programı yazınız.
		 */
		
		String kullaniciAdi="mehmet";
		int sifre=1234;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("kullanici adi giriniz: ");
		String kullaniciAd=in.next();
		
		System.out.print("sifre giriniz: ");
		int sifresi = in.nextInt();
		
		if(kullaniciAdi.equals(kullaniciAd)) {
			if(sifre == sifresi) {
				System.out.println("giris basarili..");
			}
			else {
				System.out.print("Sifreniz yanlis. Yeni sifre olusturmak isterseniz"
						+ " 1 , olusturmak istemezseniz 2 yaziniz: ");
				int tercih=in.nextInt();
				if(tercih==1) {
					System.out.print("yeni sifrenizi girin lutfen: ");
					int yeniSifre=in.nextInt();
					if(sifre!=yeniSifre) {
						System.out.println("sifre olusturuldu efenim..");
					}
					else {
						System.out.println("yeni sifreniz ve eski sifreniz ayni. HATA!");
					}
				}else {
					System.out.println("iyi gunler...");
				}
			}
		}else {
			System.out.println("girdiginiz kullanici adi yanlis!");
		}
	}

}
