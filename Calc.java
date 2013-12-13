
public class Calc {
	
	public static final String DEFAULT_DELIMITER = "[,\n]";
	public static final String CHANGE_DELIMITER = "//";
	public static final String BASIC_EXCEPTION_MESSAGE = "negatives not allowed ";

	public int add (String numbers) throws Exception {
		
		//the string is empty => return 0
		if (numbers.isEmpty())
			return 0;
		
		int sum = 0, num = 0;	//sum is the final sum, num will hold each number
		
		String delimiter = DEFAULT_DELIMITER;				//default value = ',' and/or '\n'
		String exceptionMessage = BASIC_EXCEPTION_MESSAGE;	//default value = "negatives not allowed "
		
		//if the user choose another delimiter:
		if (numbers.startsWith(CHANGE_DELIMITER)) {
			delimiter = numbers.substring (CHANGE_DELIMITER.length(), CHANGE_DELIMITER.length() + 1);	//delimiter = user's choice
			numbers = numbers.substring(numbers.indexOf('\n') + 1);										//start computing numbers from next line
		}
		
		String nums[] = numbers.split (delimiter);	//nums holds all the strings between the delimiters
		
		for (int i=0; i<nums.length; i++) {
				num = Integer.parseInt(nums[i]);	//num is the current number
			//num < 0 => add it to the exception message
			if (num < 0) {
				if (!exceptionMessage.equals(BASIC_EXCEPTION_MESSAGE))
					exceptionMessage += ",";
				exceptionMessage += num;
			}
			//num >= 0 => add it to the final sum
			else
				sum += num;
		}
		
		//there were one or more negative numbers => throw exception
		if (!exceptionMessage.equals(BASIC_EXCEPTION_MESSAGE))
				throw new Exception(exceptionMessage);

		return sum;
	}
	
}
