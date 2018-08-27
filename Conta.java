package br.com.db1.exercicio08;

public class Conta {

	private Integer numero;
	private Integer digitoVerificador;
	private Pessoa pessoa;
	private Banco banco;
	private Agencia agencia;

	public Conta(Pessoa pessoa, Agencia agencia) {
		this.pessoa = pessoa;
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(Integer digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public void calcularDigitoVerificador() {
	}

	public Boolean validarDigitoVerificador() {
		return null;
	}
}
