package test.tdd.model.bean;

public class Validador {

	public static boolean validarCPF(String cpf) {

		if (!cpf.matches("\\d{11}") || cpf.equals("00000000000")
				|| cpf.equals("11111111111") || cpf.equals("22222222222")
				|| cpf.equals("33333333333") || cpf.equals("44444444444")
				|| cpf.equals("55555555555") || cpf.equals("66666666666")
				|| cpf.equals("77777777777") || cpf.equals("88888888888")
				|| cpf.equals("99999999999")) {
			return false;
		}
		return true;
	}

	public static boolean validarIntervaloNunmeroMatricula(Integer numero) {
		if (numero >= 190000 && numero <= 210000) {
			return true;
		}
		return false;
	}

	public static boolean validarNome(String nome) {
		for (char a : nome.toCharArray()) {
			if (a != ' ') {
				if (a < 65 || a > 90 && a < 97 || a > 122) {
					return false;
				}
			}
		}
		if (nome.isEmpty())
			return false;
		return true;
	}

	public static boolean validarEmail(String email) {
		if (!email.isEmpty() && email.matches("\\w+@\\w+\\.\\w{2,3}\\.\\w{2}"))
			return true;
		return false;
	}
}
