
public class Calc {
	
	public static final char COMA = ',';

	public int add (String numbers) {
		int coma=numbers.indexOf(COMA);
		if (numbers.isEmpty())
			return 0;
		if (coma == -1)
			return Integer.parseInt(numbers);
		else {
			int n1 = Integer.parseInt(numbers.substring(0, coma));
			int n2 = Integer.parseInt(numbers.substring(coma+1, numbers.length()));
			return n1+n2;
		}
	}
	
}
