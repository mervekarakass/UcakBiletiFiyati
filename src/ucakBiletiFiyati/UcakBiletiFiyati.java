package ucakBiletiFiyati;

import java.util.Scanner;

public class UcakBiletiFiyati {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Mesafe(KM): ");
		int mesafe = scanner.nextInt();
		
		System.out.print("Yasiniz: ");
		int yas = scanner.nextInt();
		
		System.out.print("Yolculuk Tippi (1: Tek Yon, 2: Gidis-Donus):  ");
		int yolculukTipi = scanner.nextInt();
		
		
		if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2) ) {
			System.out.println("Hatali veri girdiniz");
			return;
		}
		
		double birimFiyat = 0.10;
		double toplamFiyat = mesafe * birimFiyat;
		
		if (yas <= 12) {
			toplamFiyat *= 0.5;
		} else if (yas >= 12 && yas <= 24) {
			toplamFiyat *= 0.9;
		} else if (yas >= 65) {
			toplamFiyat *= 0.7;
			
		}
		
		if (yolculukTipi == 2) {
			toplamFiyat *= 0.8;
		}
		
		System.out.println("Toplam bilet fiyati: " +toplamFiyat);
		

	}

}
