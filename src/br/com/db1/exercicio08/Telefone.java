package br.com.db1.exercicio08;

public class Telefone {

	private Integer ddd;
	private Integer numero;

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String exibirTelefoneFormatado(Integer numero) {
		return numero.toString();

	}

}
