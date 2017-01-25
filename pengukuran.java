import app.rumus;
import app.pria;
import app.wanita;
import java.util.Scanner;

class pengukuran{

	public static void main(String[] args) {
		
		Scanner ketik = new Scanner(System.in);
		double tinggi, berat;
		int jenis;

		System.out.print("Masukan tinggi anda(meter) : ");
		tinggi = ketik.nextDouble();
		System.out.print("Masukan berat anda(kg) : ");
		berat =  ketik.nextDouble();
		System.out.print("Jenis kelamin (1)pria (2)wanita : ");
		jenis = ketik.nextInt();

		rumus hitung = new rumus();
		double hasil = hitung.pengukuran(tinggi, berat);

		if (jenis == 1) {
			pria.keterangan(hasil);

		}else if(jenis == 2){
			wanita.keterangan(hasil);

		}else{
			System.out.print("KAMU PULANG AJA");
		}

	}
}