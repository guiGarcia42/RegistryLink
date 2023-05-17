package br.fiap.repositorio.controle.dao;

import java.sql.Date;
import java.sql.SQLException;

import br.fiap.repositorio.controle.conexao.Conexao;
import br.fiap.repositorio.modelo.Conta_cliente;

public class Conta_clienteDAO extends DAO {

	// método para INSERT de conta na tabela
	public void inserir(Conta_cliente conta) {
		connection = new Conexao().conectar();
		sql = "insert into CONTA_CLIENTE(" + "nr_agencia," // 1
				+ "nr_conta," // 2
				+ "nr_verificador," // 3
				+ "id_produto," // 4
				+ "dt_abertura," // 5
				+ "tp_conta)" // 6
				+ "values(?, ?, ?, ?, ?, ?)";

		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, conta.getNr_agencia());
			ps.setInt(2, conta.getNr_conta());
			ps.setInt(3, conta.getNr_verificador());
			ps.setString(4, String.valueOf(conta.getId_produto()));
			ps.setDate(3, Date.valueOf((conta.getDt_abertura())));
			ps.setString(6, conta.getTp_conta());
			ps.execute();
		} catch (SQLException e) {
			System.out.println("Erro ao conectar com o banco\n" + e);
		}
	}

	// método para SELECT os dados da conta cadastrados na base de dados
	public Conta_cliente pesquisarID(Integer nr_agencia, Integer nr_conta, Integer nr_verificador) {
		connection = new Conexao().conectar();
		sql = "select * from CONTA_CLIENTE where (nr_agencia, nr_conta, nr_verificador) IN ((?,?,?))";
		Conta_cliente conta = null;

		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, nr_agencia);
			ps.setInt(2, nr_conta);
			ps.setInt(3, nr_verificador);
			rs = ps.executeQuery();
			if (rs.next()) {
				conta = new Conta_cliente(rs.getInt("nr_agencia"), rs.getInt("nr_conta"), rs.getInt("nr_verificador"),
						rs.getString("tp_conta"));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao pesquisar conta pelo NR_agencia+conta+verificador\n" + e);
		}

		return conta;
	}

}

/*
 * método para UPDATE o tipo de cliente na conta public void
 * alterarTpCliente(String tp_cliente, String cpf_cnpj, int nr_agencia, int
 * nr_conta, int nr_verificador) { connection = new Conexao().conectar(); sql =
 * "update CONTA_CLIENTE set tp_cliente = ?, cpf_cnpj = ?  where (nr_agencia, nr_conta, nr_verificador) IN ((?,?,?))"
 * ;
 * 
 * try { ps = connection.prepareStatement(sql); ps.setString(1, tp_cliente);
 * ps.setString(2, cpf_cnpj); ps.setInt(3, nr_agencia); ps.setInt(4, nr_conta);
 * ps.setInt(5, nr_verificador); ps.execute();
 * 
 * } catch (SQLException e) {
 * System.out.println("Erro ao alterar o tipo de cliente na conta\n" + e); } }
 */