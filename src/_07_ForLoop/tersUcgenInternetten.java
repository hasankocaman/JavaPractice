package _07_ForLoop;

public class tersUcgenInternetten {

	public static void main(String[] args) {
	int sutun, satir;// Değişkenlerimizi tanımladık.
		int sembol = 5;// Yıldız sembolümüzün program başlangıçında, 9 tane yıldız yazdıracağını
						// belirtiriz.
		for (satir = 0; satir < 5; satir++) {// Döngümüzün kaç kere döneceğini ve kaça kadar yıldız yazdıracağını
												// belirtir.
	for (int bosluk = 0; bosluk <=satir; bosluk++) {
	System.out.print(" ");			}
	for (sutun = 0; sutun < sembol; sutun++) {// Yıldızımızın satırlarda kaçar kaçar basılacağını belirttik.
	System.out.print("* ");// Sembolümüzü belirttik.			}
	System.out.println("");// Yıldızlarımız basıldıktan sonra alt satıra geçilmesini sağlıyoruz.
	sembol--;// Yıldızımızın birer birer azalmasını sağlarız.
	}

	}
}
}
