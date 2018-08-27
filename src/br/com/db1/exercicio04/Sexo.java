package br.com.db1.exercicio04;

public enum Sexo {
	MASCULINO("M"), FEMININO("F");

	private String siglaSexo;

	Sexo(String sigla) {
		sigla = siglaSexo;

	}

	public String getSiglaSexo() {
		return siglaSexo;
	}
}
