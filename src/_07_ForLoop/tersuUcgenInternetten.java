package _07_ForLoop;

public class tersuUcgenInternetten {

	public static void main(String[] args) {
	int satir, bosluk, yildiz;// Değişkenlerimizi tanımladık.
	for (satir = 5; 0 < satir; satir--) {// Döngümüzün ne kadar döneceğini belirtir.
	for (bosluk = satir; bosluk < 5; bosluk++) {// Üçgenimizi yaparken ekran çıktısının 
		// sol tarafındaki boşluğu belirtir.
	System.out.print(" ");// Boşluğumuzu belirtiyoruz.
		}
	for (yildiz = 1; yildiz <= satir; yildiz++) {// Yıldız sembolümüzün yazılmasını sağlar.
	System.out.print("*");// Sembolümüzü belirledik ve çıktısını sağladık.
	System.out.print(" ");// Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
	}
	System.out.println(" ");// Döngüden sonra diğer satıra atlamamızı sağlar.
		}
	}

}
