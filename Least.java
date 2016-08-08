import java.util.Arrays;

public class Least {

	public static void main(String[] args) {
		String a=args[0];
		String s = "";
		char[] charArray = String.valueOf(a).toCharArray();
		Arrays.sort(charArray);
		for (int i = 0; i < (charArray.length); i++) {
		s += charArray[i];
		}

		System.out.println(s);
		}

	}
