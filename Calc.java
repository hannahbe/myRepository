
public class Calc {
	
	public static final String DEFAULT_DELIMITER = "[,\n]";
	public static final String CHANGE_DELIMITER = "//";
	public static final String BASIC_EXCEPTION_MESSAGE = "negatives not allowed ";

	public int add (String numbers) throws Exception {
		if (numbers.isEmpty())
			return 0;
		int sum = 0, num = 0;
		String delimiter = DEFAULT_DELIMITER;
		String exceptionMessage = BASIC_EXCEPTION_MESSAGE;
		if (numbers.startsWith(CHANGE_DELIMITER)) {
			delimiter = numbers.substring (CHANGE_DELIMITER.length(), CHANGE_DELIMITER.length() + 1);
			numbers = numbers.substring(CHANGE_DELIMITER.length()+2);
		}
		String nums[] = numbers.split (delimiter);
		for (int i=0; i<nums.length; i++) {
			num = Integer.parseInt(nums[i]);
			if (num < 0) {
				if (!exceptionMessage.equals(BASIC_EXCEPTION_MESSAGE))
					exceptionMessage += ",";
				exceptionMessage += num;
			}
			else
				sum += num;
		}
		if (!exceptionMessage.equals(BASIC_EXCEPTION_MESSAGE))
				throw new Exception(exceptionMessage);

		return sum;
	}
	
}
