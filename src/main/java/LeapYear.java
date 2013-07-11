class LeapYear {

	public static boolean isLeapYear(int year) {
		return divisibleBy4(year) && (!divisibleBy100(year) || divisibleBy400(year));
	}

	private static boolean divisibleBy400(int year) {
		int n = 400;
		return divisibleByN(year, n);
	}

	private static boolean divisibleBy100(int year) {
		return divisibleByN(year, 100);
	}

	private static boolean divisibleBy4(int year) {
		return divisibleByN(year, 4);
	}

	private static boolean divisibleByN(int year, int n) {
		return year % n == 0;
	}
}
