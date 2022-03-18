public class BinToHex {
	
	public static String binaryToHex(String binaryValue) {
		String hex = "";
		int counter = 0;
		String tmp = "";
		for (int i = binaryValue.length() -1; i >= 0; i -= 1) {
			counter++;
			tmp += binaryValue.charAt(i);
			int subTotal = 0;
			if (counter % 4 == 0 || i == 0) {
					int pow = 0;
					for (int j = 0; j < tmp.length(); j++) {
						if (tmp.charAt(j) == '1') 
							subTotal += Math.pow(2, pow);
							pow++;
					}
						
					if (subTotal < 10) {
						hex = subTotal + hex;
					} else {
						subTotal -= 10;
						hex = (char)('A' + subTotal) + hex;
					}
					tmp = "";
				}
			}
			return hex;
		}
		
	public static void main (String[] args) {
		String hex = binaryToHex("110");
		System.out.println(hex);
	}

}
