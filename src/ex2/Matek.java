package ex2;

public class Matek {
	private double _eredmeny=0;
	public String name;
	static private Matek matek;
	
	public Matek(String n) {
		name = n;
	}
	
    public double osszead(double[] szamok,String ember){
        int[] tomb1 = {2,5,8};
        try {
            int i=1;
            while(i<=szamok.length) {
                if (i % 2 != 0) {
                    i++;
                    continue;
                }
                _eredmeny = _eredmeny + szamok[i-1];
                i++;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        return _eredmeny;
    }
    
    public void setName(String n) {
    	name= n;
    }
    
    public int bintodec(String kettes){ //11011
        int result =0;
        char[] szamjegyek = kettes.toCharArray();
        int i=0;
        int j= szamjegyek.length-1;
        for( ; i<szamjegyek.length ; i++, j-- ){
            if( szamjegyek[i] == '1'){
                result =result + (int)Math.pow(2,j);
            }
        }
        return result;
    }
    
//    public static Matek createInstance() {
//    	if( matek == null) {
//    		matek = new Matek();
//    		return matek;
//    	} else {
//    		return matek;
//    	}   	
//    }
    
}
