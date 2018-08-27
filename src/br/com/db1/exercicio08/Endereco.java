package br.com.db1.exercicio08;

public class Endereco {

	@SuppressWarnings("unused")
	private String logradouro;
	private Integer cep;

	public String exibirCepFormatado() {

		return cep.toString();
	}
}
