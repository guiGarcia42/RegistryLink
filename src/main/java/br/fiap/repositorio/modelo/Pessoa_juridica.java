package br.fiap.repositorio.modelo;

import java.time.LocalDate;

public class Pessoa_juridica extends Cliente {

	private String cnpj, razao_social, porte;
	private LocalDate dt_abertura_emp;

	// Construtor para Cadastrar Cliente Pessoa Júridica
	public Pessoa_juridica(String telefone01, String telefone02, String tp_cliente, String email, String senha,
			String cnpj, String razao_social, String porte, LocalDate dt_abertura_emp) {
		super(telefone01, telefone02, tp_cliente, email, senha);
		this.cnpj = cnpj;
		this.razao_social = razao_social;
		this.porte = porte;
		this.dt_abertura_emp = dt_abertura_emp;
	}

	// Construtor para buscar Cliente Pessoa Júridica
	public Pessoa_juridica(Integer id_cliente, String telefone01, String telefone02, String tp_cliente, String email,
			String ind_cliente_novo, String cnpj, String razao_social, String porte,
			LocalDate dt_abertura_emp) {
		super(id_cliente, telefone01, telefone02, tp_cliente, email, ind_cliente_novo);
		this.cnpj = cnpj;
		this.razao_social = razao_social;
		this.porte = porte;
		this.dt_abertura_emp = dt_abertura_emp;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public LocalDate getDt_abertura_emp() {
		return dt_abertura_emp;
	}

	public void setDt_abertura_emp(LocalDate dt_abertura_emp) {
		this.dt_abertura_emp = dt_abertura_emp;
	}
	
}
