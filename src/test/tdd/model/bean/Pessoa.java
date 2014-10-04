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
		if (Validador.validarNome(nome)) {
			this.nome = nome;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) throws Exception {
		if (Validador.validarCPF(cpf)) {
			this.cpf = cpf;
		}
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		if (Validador.validarIntervaloNunmeroMatricula(matricula))
			this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (Validador.validarEmail(email))
			this.email = email;
	}

}
