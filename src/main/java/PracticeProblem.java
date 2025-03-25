public class PracticeProblem {

	private static final int MAXIMUM_VALUE = 15;

	public static void main(String args[]) {

	}

	public static int calculate(int num1, int num2, char operator) {
		switch (operator) {
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case'*':
				return num1 * num2;
			case'/':
				return num1 / num2;
			case'%':
				return num1 % num2;
			case'^':
				return (int) Math.pow(num1, num2);
		}
        return num1; //random return lol
    }

	public static boolean totalWordsChecker(String str) {
		if (str == null || str.trim().isEmpty()) {
			return true;
		}

		String[] words = str.trim().split("\\s+");
		return words.length <= MAXIMUM_VALUE;
    }

	public static String minString(String str1, String str2, String str3) {
		String min = str1;

		if(str2.compareToIgnoreCase(min) < 0) {
			min = str2;
		}

		if(str3.compareToIgnoreCase(min) < 0) {
			min = str3;
		}

		return min;
	}

}
