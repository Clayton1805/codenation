package challenge;

public class CriptografiaCesariana implements Criptografia {

	@Override
	public String criptografar(String texto) {
		String textLowerCase = texto.toLowerCase();
		String textIncript = "";
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

		for (int i = 0; i < textLowerCase.length(); i++) {
			String caracter = textLowerCase.charAt(i) + "";
			boolean isletter = true;
			
	 		for (int iAlphabet = 0; iAlphabet < alphabet.length; iAlphabet++) {
				if (alphabet[iAlphabet].equals(caracter)) {
					int ola = (iAlphabet + 3) % 26;
					textIncript += alphabet[ola];
					isletter = false;
					break;
				}				
        	}
	 		
	 		if (isletter) {
				textIncript += caracter;
			}
    }
		return textIncript;
  }

	@Override
	public String descriptografar(String texto) {
		String textLowerCase = texto.toLowerCase();
    String textDecript = "";
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

		for (int i = 0; i < textLowerCase.length(); i++) {
			String caracter = textLowerCase.charAt(i) + "";
			boolean isletter = true;
			
			for (int iAlphabet = 0; iAlphabet < alphabet.length; iAlphabet++) {
				if (alphabet[iAlphabet].equals(caracter)) {
					int v = iAlphabet - 3;
					if (v < 0) {
						textDecript += alphabet[v + 26];						
					} else {
						textDecript += alphabet[v];										
					}
					isletter = false;
					break;
				}
      }	
			if (isletter) {
				textDecript += caracter;
			}
    }		
		
		return textDecript;
  }

	// public static void main(String[] args) {
	// 	System.out.println(criptografar("ola"));
	// }
}
