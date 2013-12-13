
public class Calc {
	
	public static final String DEFAULT_DELIMITER = "[,\n]";
	public static final String CHANGE_DELIMITER = "//";

	public int add (String numbers) {
		if (numbers.isEmpty())
			return 0;
		int sum = 0;
		String delimiter = DEFAULT_DELIMITER;
		if (numbers.startsWith(CHANGE_DELIMITER)) {
			delimiter = numbers.substring (CHANGE_DELIMITER.length(), CHANGE_DELIMITER.length() + 1);
			numbers = numbers.substring(CHANGE_DELIMITER.length()+2);
		}
		String nums[] = numbers.split (delimiter);
		for (int i=0; i<nums.length; i++) {
			sum += Integer.parseInt(nums[i]);
		}
		return sum;
	}
	
}
