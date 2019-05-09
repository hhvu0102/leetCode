// Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

// Super long, but it works fast. Memory-comsuming though.

class Solution {
	public int romanToInt(String s) {
		char[] letter = s.toCharArray();
		int number = 0;
		for (int i = letter.length - 1; i >= 0; i--) {
			if (letter[i] == 'I') {
				number += 1;
			} else if (letter[i] == 'V') {
				if (i == 0) {
					number += 5;
				} else {
					if (letter[i - 1] == 'I') {
						number += 4;
						i -= 1;
					} else {
						number += 5;
					}
				}
			} else if (letter[i] == 'X') {
				if (i == 0) {
					number += 10;
				} else {
					if (letter[i - 1] == 'I') {
						number += 9;
						i -= 1;
					} else {
						number += 10;
					}
				}

			} else if (letter[i] == 'L') {
				if (i == 0) {
					number += 50;
				} else {
					if (letter[i - 1] == 'X') {
						number += 40;
						i -= 1;
					} else {
						number += 50;
					}
				}

			} else if (letter[i] == 'C') {
				if (i == 0) {
					number += 100;
				} else {
					if (letter[i - 1] == 'X') {
						number += 90;
						i -= 1;
					} else {
						number += 100;
					}
				}

			} else if (letter[i] == 'D') {
				if (i == 0) {
					number += 500;
				} else {
					if (letter[i - 1] == 'C') {
						number += 400;
						i -= 1;
					} else {
						number += 500;
					}
				}

			} else if (letter[i] == 'M') {
				if (i == 0) {
					number += 1000;
				} else {
					if (letter[i - 1] == 'C') {
						number += 900;
						i -= 1;
					} else {
						number += 1000;
					}
				}

			}
		}
		return number;
	}
}
