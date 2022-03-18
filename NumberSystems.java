
public class NumberSystems {
	public static void main(String[] args) {	
        System.out.println(hexadecimal2decimal("A1"));
        System.out.println(decimal2binary(10));
        System.out.println(decimal2hex(161));
        System.out.println(binary2decimal("1010"));
	}

    public static int baseX2decimal(int base, String s) {
		int output = 0;
		int place = 0;
		for (int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				output += Math.pow(place, base) * Integer.parseInt(s.charAt(i) + "");
			} else {
				int val = s.charAt(i) - 55;
				output += Math.pow(base, place) * val;
			}
			place++;
		}
    	return output;
    }

    public static String decimal2BaseX(int base, int dec){
    	String output = "";
    	int remainder;
    	while (dec > 0) {
    		remainder = dec % base;
    		if (remainder > 9) {
    			output = (char)(remainder + 55) + output;
    		}
    		else {
    			output = remainder + output;
    		}
    		dec /= base;
    	}
        return output;
    }
    
    public static int hexadecimal2decimal(String hex){
		return baseX2decimal(16, hex);
    }
    public static String decimal2binary(int n){
		return decimal2BaseX(16, n);
        
    }
    public static String decimal2hex(int n){
		return decimal2BaseX(16, n);
               
    }
    public static int binary2decimal(String b){
		return baseX2decimal(16, b);
    }    

}