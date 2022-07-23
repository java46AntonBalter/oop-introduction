package telran.text.comparators;

import java.util.Comparator;

public class StringsAsDatesComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int[] dateArr1 = stringToIntArr(s1);
		int[] dateArr2 = stringToIntArr(s2);
		int year1 = dateArr1[2];
		int year2 = dateArr2[2];
		int month1 = dateArr1[1];
		int month2 = dateArr2[1];
		int day1 = dateArr1[0];
		int day2 = dateArr2[0];

		if (year1 != year2) {
			return Integer.compare(year1, year2);
		} else if (month1 != month2) {
			return Integer.compare(month1, month2);
		} else {
			return Integer.compare(day1, day2);
		}
	}

	private int[] stringToIntArr(String s) {
		String[] splitStr = s.split("/");
		if(splitStr.length != 3) {
			throw new IllegalArgumentException(String.format("%s - wrong date format, " + "should be D/M/YYYY", s));
		}
		int[] res = new int[splitStr.length];
		int i = 0;
		for (String str : splitStr) {
			int strToInt = Integer.parseInt(str);
			res[i] = strToInt;
			i++;
		}
		return res;
	}

}
