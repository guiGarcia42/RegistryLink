package br.fiap.repositorio.modelo;

import java.sql.Date;

public class Conta_cliente extends Produto{
	
	private Integer nr_agencia, nr_conta, nr_verificador;
	private String tp_conta;
	private String dt_abertura;

	public Conta_cliente(Integer nr_agencia, Integer nr_conta, Integer nr_verificador, String tp_conta) {
		super(tp_conta, nr_verificador);
		this.nr_agencia = nr_agencia;
		this.nr_conta = nr_conta;
		this.nr_verificador = nr_verificador;
		this.dt_abertura = String.valueOf(new Date(System.currentTimeMillis()));
		this.tp_conta = tp_conta;
	}

	public Integer getNr_agencia() {
		return nr_agencia;
	}

	public void setNr_agencia(Integer nr_agencia) {
		this.nr_agencia = nr_agencia;
	}

	public Integer getNr_conta() {
		return nr_conta;
	}

	public void setNr_conta(Integer nr_conta) {
		this.nr_conta = nr_conta;
	}

	public Integer getNr_verificador() {
		return nr_verificador;
	}

	public void setNr_verificador(Integer nr_verificador) {
		this.nr_verificador = nr_verificador;
	}

	public String getTp_conta() {
		return tp_conta;
	}

	public void setTp_conta(String tp_conta) {
		this.tp_conta = tp_conta;
	}

	public String getDt_abertura() {
		return dt_abertura;
	}

	public void setDt_abertura(String dt_abertura) {
		this.dt_abertura = dt_abertura;
	}

}
