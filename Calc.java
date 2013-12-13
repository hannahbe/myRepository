
public class Calc {

	public int add (String numbers) {
		int coma=numbers.indexOf(",");
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
