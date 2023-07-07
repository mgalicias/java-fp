package Assesments;

public class FPAssesment1 {

	public String invertCase(String str) {
		String nStr = "";
		char a;
		for (int i = 0; i < str.length(); i++) {

			a = str.charAt(i);

			if (a == Character.toUpperCase(a)) { // Compares if a character is upper
				a = Character.toLowerCase(a);
			} else if (a == Character.toLowerCase(a)) { // Compares if a character is upper
				a = Character.toUpperCase(a);
			}
			nStr += a;
		}
		return nStr;
	}

	public String reverseString(String str) {
		StringBuilder nStr = new StringBuilder(str);
		return nStr.reverse().toString();
	}

	public String spaceReplacement(String str) {
		String nStr = "";
		char a = ' ';
		for (int i = 0; i < str.length(); i++) {
			a = str.charAt(i);
			if (a == ' ') {
				a = '*';
			}
			nStr += a;
		}
		return nStr;
	}

	public String charToASCII(String str) {
		String nStr = "";
		int even;

		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				even = (int) str.charAt(i);
				nStr += even;
			} else {
				nStr += str.charAt(i);
			}
		}
		return nStr;
	}

	public String ciphering(String normal) {
		String nNormal = invertCase(normal);
		nNormal = reverseString(nNormal);
		nNormal = spaceReplacement(nNormal);
		nNormal = charToASCII(nNormal);
		nNormal += 3;

		return nNormal;
	}

	public String deciphering(String cipher) {

		char decipher[] = new char[cipher.length()];
		String nNormal = "";
		String tmp = "";
		for (int i = 0; i < cipher.length(); i++) { // assigning
			decipher[i] = cipher.charAt(i);
		}
		System.out.println(decipher);
		decipher[cipher.length() - 1] = ' '; // Deleting the number 3 at the end of the string
		System.out.println(decipher);

		for (int i = 0; i < decipher.length; i++) {

			int ch;
			int j = 0;
			tmp = "";
			char digit;

			if (i % 2 == 0) {

				while (Character.isDigit(decipher[j])) {
					tmp += decipher[j];
					j++;
				}
				ch = Integer.parseInt(tmp);
				digit = (char)ch;
				System.out.println(tmp + " " + j+" "+digit);
			}

		}

//		if( Character.isDigit(decipher[0]) && Character.isDigit(decipher[1]) ) {
//			
//		}

		return nNormal;
	}

	public static void main(String[] args) {
		FPAssesment1 assesment1 = new FPAssesment1();

		String str = "This Is A Test";
		String cipher = assesment1.ciphering(str);
		System.out.println(cipher);
		System.out.println(assesment1.deciphering(cipher));

	}

}
