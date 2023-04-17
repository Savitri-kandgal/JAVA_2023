package com.xworkz.address.util;

public class AddressUtil {

	public AddressUtil() {
	}

	public static boolean ValidString(String value) {

		if (value != null && !value.isEmpty() && value.length() > 2 && value.length() < 30) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validInt(int value) {

		if (value > 0) { // and wt and other check we can do for this
			return true;
		} else {
			return false;
		}
	}

	public static boolean validFlags(boolean... flags) {

		for (int index = 0; index < flags.length; index++) {
			boolean temp = flags[index];
			if (!temp) {
				return false;
			}
		}
		return true;
	}

}
