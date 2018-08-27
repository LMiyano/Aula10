package br.com.db1.exercicio06;

import java.util.Date;

public class Restaurante {

	private String nome;
	private Boolean ServeAlmoco;
	private Boolean ServeJantar;
	private Boolean ServeCafeDaManha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getServeAlmoco() {
		return ServeAlmoco;
	}

	public void setServeAlmoco(Boolean serveAlmoco) {
		ServeAlmoco = serveAlmoco;
	}

	public Boolean getServeJantar() {
		return ServeJantar;
	}

	public void setServeJantar(Boolean serveJantar) {
		ServeJantar = serveJantar;
	}

	public Boolean getServeCafeDaManha() {
		return ServeCafeDaManha;
	}

	public void setServeCafeDaManha(Boolean serveCafeDaManha) {
		ServeCafeDaManha = serveCafeDaManha;
	}

	public void gerarRelatorioFaturamento(Date dataInicial, Date dataFinal) {
	}
}
