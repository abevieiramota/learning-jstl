package br.com.abevieiramota.jstl.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Produto {

	private static final List<Produto> DB = new ArrayList<Produto>();

	static {
		DB.add(new Produto("Abelardo", 10, true));
		DB.add(new Produto("Vieira", 100, true));
		DB.add(new Produto("Mota", 1000, false));
	}

	private String nome;
	private int preco;
	private boolean valido;
	private Date dataAdicao;

	public static List<Produto> all() {
		return Collections.unmodifiableList(DB);
	}

	public Produto(String nome, int preco, boolean valido) {
		this.nome = nome;
		this.preco = preco;
		this.valido = valido;
		this.dataAdicao = new Date();
	}

	public String getNome() {
		return this.nome;
	}

	public int getPreco() {
		return this.preco;
	}

	public boolean isValido() {
		return this.valido;
	}

	public Date getDataAdicao() {
		return this.dataAdicao;
	}
}
