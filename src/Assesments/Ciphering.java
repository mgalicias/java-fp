package Assesments;

public class Ciphering {
	
	public String deciphering(String str) {
		String decipher =  changeCase(reverseString( cleanStar(str)));
		return decipher;
	}
	public String cleanStar(String str) {
		
		String nStr = ascciChar(str);
		char[] a = new char[nStr.length()];
		String cleanStr = "";
		
		for (int i = 0; i < a.length; i++) {
			if( nStr.charAt(i) == '*' ) {
				a[i] = ' ';
			}else {
				a[i] = nStr.charAt(i);
			}
			cleanStr += a[i];
		}
		return cleanStr;
	}
	
	public String ascciChar(String str) {

		char[] a = new char[str.length()];

		String nStr = "";

		for (int i = 0; i < a.length; i++) {
			a[i] = str.charAt(i);
		}

		a[str.length() - 1] = ' '; // Eliminates the last digit

		for (int i = 0; i < a.length; i++) {

			String tmp = "";
			int i2c = 0;
			if (Character.isDigit(a[i])) {

				while (Character.isDigit(a[i])) {
					tmp += a[i];
					i++;
				}
				i2c = Integer.parseInt(tmp);
				char b = (char) i2c;
				nStr += b;
			}
			if ( Character.isLetter(a[i]) || a[i]=='*') {
				nStr += a[i];
			}
			
		}
		
		return nStr;
	}

	public String eliminateLastDigit(String str) {
		char[] a = new char[str.length()];
		String tmp = "";
		for (int i = 0; i < a.length; i++) {
			tmp += a[i];
		}

		if (Character.isDigit(str.length())) {
			a[str.length()] = ' ';
		}
		for (int i = 0; i < a.length; i++) {
			tmp += a[i];
		}
		return tmp;
	}

	public String ciphering(String normal) {
		String cipher = "";

		cipher = changeCase(normal);
		cipher = reverseString(cipher);
		cipher = starComplement(cipher);
		cipher = charASCII(cipher);
		cipher += 3;

		return cipher;
	}

	public String charASCII(String str) { // Converts all the chars into ascii code

		char[] a = new char[str.length()];
		String tmp = "";
		for (int i = 0; i < a.length; i++) {
			a[i] = str.charAt(i);

			if ((i % 2) == 0) {
				int ascii = (int) a[i];
				tmp += ascii;
			} else {
				tmp += a[i];
			}
		}
		return tmp;

	}

	public String starComplement(String str) { // Complement the spaces with '*'
		char[] a = new char[str.length()];
		String tmp = "";

		for (int i = 0; i < a.length; i++) {
			a[i] = str.charAt(i);
			if (a[i] == ' ') {
				a[i] = '*';
			}
			tmp += a[i];
		}
		return tmp;
	}

	public String reverseString(String str) { // This reverse the string
		StringBuilder sbld = new StringBuilder(str);
		return sbld.reverse().toString();
	}

	public String changeCase(String str) { // This method helps to change case on each char of the string

		char[] a = new char[str.length()];
		String tmp = "";
		for (int i = 0; i < a.length; i++) {

			if (str.charAt(i) == Character.toUpperCase(str.charAt(i))) {
				a[i] = Character.toLowerCase(str.charAt(i));
			} else if (str.charAt(i) == Character.toLowerCase(str.charAt(i))) {
				a[i] = Character.toUpperCase(str.charAt(i));
			}
			tmp += a[i];
		}

		return tmp;

	}

	/*
	 *     
	 *     Examples
	 *     Welcome to hackerrank
    	   ?85O89*69R65*87O104*33I1043 // 
    	   
    	   63U79Y42E82A42W79h42!73h3
    	   Welcome to hackerrank
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ciphering cipher = new Ciphering();
		String msg = "Welcome to hackerrank";
		System.out.println("Original message => " + msg);
		System.out.println("The message cipher is => " + cipher.ciphering(msg));
		String dMsg = cipher.ciphering(msg);
		//cipher.ascciChar(dMsg);
		System.out.println(cipher.deciphering(dMsg));

	}

}
