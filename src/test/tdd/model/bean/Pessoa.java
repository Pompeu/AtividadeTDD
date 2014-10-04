package test.tdd.model.bean;

public class Pessoa {

	private String nome;
	private String cpf;
	private Integer matricula;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		for (char a : nome.toCharArray()) {
			if (a < 65 || a > 122) {
				throw new Exception("Nome não pode Conter Numeros");
			}
		}
		if (nome.isEmpty()) {
			this.nome = null;
		} else {
			this.nome = nome;
		}

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) throws Exception {
		if(ValidarCPF.validarCPF(cpf)){
			this.cpf = cpf;
		}
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) throws Exception {
		if (matricula > 190000 || matricula <= 210000) {
			throw new Exception("Matricula Fora do Intervalo");
		}
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (!email.isEmpty() && email.matches("\\w+@\\w+\\.\\w{2,3}\\.\\w{2}"))
			this.email = email;
	}

}
