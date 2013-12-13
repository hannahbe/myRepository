
public class Calc {
	
	public static final char COMA = ',';
	public static final char NEW_LINE = '\n';

	public int add (String numbers) {
		if (numbers.isEmpty())
			return 0;
		int sum = 0, from = 0, coma, newLine, delimiter;
		char delimiterChar = 0;
		boolean userChooseDelimiter = false;
		if (numbers.indexOf("//") == 0) {
			userChooseDelimiter = true;
			delimiterChar = numbers.charAt(2);
			from = 4;
		}
		do {
			if (!userChooseDelimiter) {
				coma = numbers.indexOf(COMA, from);
				newLine = numbers.indexOf(NEW_LINE, from);
				if (coma == -1 && newLine == -1) {
					delimiter = coma;
					sum += Integer.parseInt(numbers.substring(from, numbers.length()));
					break;
				}
				else if ((coma < newLine && coma != -1) || newLine == -1 && coma != -1)
					delimiter = coma;
				else
					delimiter = newLine;
				sum += Integer.parseInt(numbers.substring(from, delimiter));
				from = delimiter+1;
			}
			else {
				delimiter = numbers.indexOf(delimiterChar, from);
				if (delimiter != -1) {
					sum += Integer.parseInt(numbers.substring(from, delimiter));
					from = delimiter+1;
				}
				else
					sum += Integer.parseInt(numbers.substring(from, numbers.length()));
			}
		} while (delimiter != -1);
		return sum;
	}
	
}
