package br.fiap.repositorio.modelo;

import java.time.LocalDate;

public class Pessoa_fisica extends Cliente {

	private String cpf, nm_cliente, sexo, estado_civil;
	private LocalDate dt_nascimento;

	// Construtor para cadastrar Cliente Pessoa Física
	public Pessoa_fisica(String telefone01, String telefone02, String tp_cliente, String email, String senha,
			String cpf, String nm_cliente, LocalDate dt_nascimento, String sexo, String estado_civil) {
		super(telefone01, telefone02, tp_cliente, email, senha);
		this.cpf = cpf;
		this.nm_cliente = nm_cliente;
		this.dt_nascimento = dt_nascimento;
		this.sexo = sexo;
		this.estado_civil = estado_civil;
	}

	// Construtor para buscar Cliente Pessoa Física
	public Pessoa_fisica(Integer id_cliente, String telefone01, String telefone02, String tp_cliente, String email,
			String ind_cliente_novo, String cpf, String nm_cliente, LocalDate dt_nascimento, String sexo,
			String estado_civil) {
		super(id_cliente, telefone01, telefone02, tp_cliente, email, ind_cliente_novo);
		this.cpf = cpf;
		this.nm_cliente = nm_cliente;
		this.dt_nascimento = dt_nascimento;
		this.sexo = sexo;
		this.estado_civil = estado_civil;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNm_cliente() {
		return nm_cliente;
	}

	public void setNm_cliente(String nm_cliente) {
		this.nm_cliente = nm_cliente;
	}

	public LocalDate getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(LocalDate localDate) {
		this.dt_nascimento = localDate;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

}
