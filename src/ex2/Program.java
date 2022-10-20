package ex2;

public class Program {

	public static void main(String[] args) {
		Citrom citrom1 = new Citrom("sarga");
//		matek1.name = "Pisti";
		Citrom citrom2 = new Citrom();
//		matek2.name = "Zsuzsi";
//		System.out.println(String.format("A 111101111 decimális értéke: %d",matek.bintodec("111101111")) );
		String nev = String.copyValueOf(new char[] {'P','e','t','i'} ,1,3 );
//		System.out.println(nev.toUpperCase());
		
//		matek2.setName("Zsuzsi");
		System.out.println("A cirom1 sulya:"+citrom1.suly);
		System.out.println("A citrom2 sulya:"+citrom2.suly);
		
	}

}
