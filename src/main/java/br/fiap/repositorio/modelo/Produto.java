package br.fiap.repositorio.modelo;

public class Produto {
	
	private Integer id_produto, id_cliente;
	private String ind_produto_cont;

	// Construtor para cadastrar produto
	public Produto(String ind_produto_cont, Integer id_cliente) {
		super();
		this.id_produto = null;
		this.ind_produto_cont = ind_produto_cont;
		this.id_cliente = id_cliente;
	}

	// Construtor para buscar produto
	public Produto(Integer id_produto, String ind_produto_cont, Integer id_cliente) {
		super();
		this.id_produto = id_produto;
		this.ind_produto_cont = ind_produto_cont;
		this.id_cliente = id_cliente;
	}

	@Override
	public String toString() {
		return "ID do produto= " + id_produto + " // Produto contratado = " + ind_produto_cont;
	}

	public Integer getId_produto() {
		return id_produto;
	}

	public void setId_produto(Integer id_produto) {
		this.id_produto = id_produto;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getInd_produto_cont() {
		return ind_produto_cont;
	}

	public void setInd_produto_cont(String ind_produto_cont) {
		this.ind_produto_cont = ind_produto_cont;
	}

}
