package app;

public class wanita{

	public static void keterangan(double hasil){
		if(hasil < 18) {
			System.out.println("Anda kurang berat badan/kurus");
		}else if(hasil < 25){
			System.out.println("Berat badan normal atau ideal");
		}else if(hasil < 27){
			System.out.println("Anda kelebihan berat badan");
		}else{
			System.out.println("Obesitas, Sebaiknya segera lakukan program obesitas");
		}
	}
}