
public class CharCounter {

	public static void main(String[] args) {

		char[] a = new char[] { 'a', 'a', 'b', 'c', 'd', 'e', 'a'};
		System.out.println(count(a, 'd'));
		
	}
	
	public static int count(char[] chars, char ch) {
		return count(chars, ch, chars.length - 1);
	}
	
	private static int count(char[] chars, char ch, int high) {
		if (high < 0)
			return 0;
		else {
			if (ch == chars[high])
				return 1 + count(chars, ch, high - 1);
			else
				return count(chars, ch, high - 1);
		}
	}

}
