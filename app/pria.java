package app;

public class pria{

	public static void keterangan(double hasil){
		if(hasil < 17) {
			System.out.println("Anda kurang berat badan/kurus");
		}else if(hasil < 23){
			System.out.println("Berat badan normal atau ideal");
		}else if(hasil < 27){
			System.out.println("Anda kelebihan berat badan");
		}else{
			System.out.println("Obesitas, Sebaiknya segera lakukan program obesitas");
		}
	}
}