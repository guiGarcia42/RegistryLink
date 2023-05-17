package br.fiap.repositorio.controle.dao;

import java.sql.*;
import java.util.*;

import br.fiap.repositorio.controle.conexao.Conexao;
import br.fiap.repositorio.modelo.Produto;

public class ProdutoDAO extends DAO {

	// método para INSERT de produtos na tabela
	public void inserir(Produto produto) {
		connection = new Conexao().conectar();
		sql = "insert into PRODUTO(" + "id_produto," // 1
				+ "ind_produto_cont," // 2
				+ "id_cliente)" // 3
				+ "values(?, ?, ?)";

		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, produto.getId_produto());
			ps.setString(2, produto.getInd_produto_cont());
			ps.setInt(3, produto.getId_cliente());
			ps.execute();
		} catch (SQLException e) {
			System.out.println("Erro ao conectar com o banco\n" + e);
		}
	}

	// método para SELECT se já existe o ID_produto
	public boolean verifProduto(int id_produto) {
		connection = new Conexao().conectar();
		boolean aux = false;
		sql = "select * from PRODUTO where id_produto = ?";

		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id_produto);
			rs = ps.executeQuery();
			aux = rs.next();
		} catch (SQLException e) {
			System.out.println("Erro ao pesquisar produto\n" + e);
		}
		return aux;
	}

	// método para SELECT os dados do produto
	public Produto pesquisar(int id_produto) {
		connection = new Conexao().conectar();
		sql = "select * from PRODUTO where id_produto = ?";
		Produto produto = null;

		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id_produto);
			rs = ps.executeQuery();
			if (rs.next()) {
				produto = new Produto(rs.getInt("id_produto"), rs.getString("ind_produto_cont"),
						rs.getInt("id_cliente"));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar dados do produto pelo ID\n" + e);
		}

		return produto;
	}

	// método para SELECT e LISTAR os produtosXcliente
	public List<Produto> listarProdutos(String id_cliente) {
		List<Produto> lista = new ArrayList<Produto>();
		connection = new Conexao().conectar();
		sql = "select * from PRODUTO where id_cliente = ?";

		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, id_cliente);
			rs = ps.executeQuery();
			while (rs.next()) {
				lista.add(new Produto(rs.getInt("id_produto"), rs.getString("ind_produto_cont"),
						rs.getInt("id_cliente")));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar produtos do cliente\n" + e);
		}

		return lista;
	}

}

/*
 * método para UPDATE o indicador do produto public void alterarIndicador(int
 * id_produto, String indicador_produto_contratado) { connection = new
 * Conexao().conectar(); sql =
 * "update PRODUTO set indicador_produto_contratado = ? where id_produto = ?";
 * 
 * try { ps = connection.prepareStatement(sql); ps.setString(1,
 * indicador_produto_contratado); ps.setInt(2, id_produto); ps.execute();
 * 
 * } catch (SQLException e) {
 * System.out.println("Erro ao alterar o indicador de produto contratado\n" +
 * e); } }
 */