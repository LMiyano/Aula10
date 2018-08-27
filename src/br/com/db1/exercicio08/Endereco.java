package br.com.db1.exercicio08;

public class Endereco {

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	private String logradouro;
	private Integer cep;

	public String exibirCepFormatado() {

		return cep.toString();
	}
}
