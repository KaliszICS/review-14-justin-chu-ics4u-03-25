public class PracticeProblem {

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
		return -1;
    }

	final static int MAXIMUM = 10;

	public static boolean totalWordsChecker(String str) {

		String[] words = str.trim().split("[^A-Za-z'_]+");
		return words.length <= MAXIMUM;
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
