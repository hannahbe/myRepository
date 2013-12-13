
public class Calc {
	
	public static final char COMA = ',';

	public int add (String numbers) {
		int coma=numbers.indexOf(COMA);
		if (numbers.isEmpty())
			return 0;
		if (coma == -1)
			return Integer.parseInt(numbers);
		int from = 0;
		int sum = Integer.parseInt(numbers.substring(from, coma));
		from = coma+1;
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
