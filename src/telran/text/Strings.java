package telran.text;

import java.util.Arrays;

import telran.text.comparators.StringsAsDatesComparator;

public class Strings {
	public static String[] sortStringsAsDates(String[] dates) {
		String[] res = Arrays.copyOf(dates, dates.length);
		Arrays.sort(res, new StringsAsDatesComparator());
		return res;
	}
}