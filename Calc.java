
public class Calc {
	
	public static final char COMA = ',';

	public int add (String numbers) {
		if (numbers.isEmpty())
			return 0;
		int sum = 0, from = 0, coma;
		do {
			if ((coma=numbers.indexOf(COMA, from)) != -1) {
				sum += Integer.parseInt(numbers.substring(from, coma));
				from = coma+1;
			}
			else 
				sum += Integer.parseInt(numbers.substring(from, numbers.length()));
		} while (coma != -1);
		return sum;
	}
	
}
