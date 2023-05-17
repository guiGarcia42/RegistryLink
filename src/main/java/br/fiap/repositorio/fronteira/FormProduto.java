package br.fiap.repositorio.fronteira;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

import java.util.List;

import br.fiap.repositorio.controle.ProdutoDAO;
import br.fiap.repositorio.modelo.Produto;


public class FormProduto {

	
	
	public void menuProduto() {
		int opcao = 0;
		
		do {
			try {
				opcao = parseInt(showInputDialog(gerarMenu()));
				switch(opcao) {
					case 1:
						inserir();
						break;
					case 2:
						consultarProdutos();
						break;
				}
			}catch (NumberFormatException e) {
				showMessageDialog(null, "A opção deve ser um número entre 1 e 3\n" + e);
			}
		}while (opcao != 3);
	}
	
	private void inserir() {
		ProdutoDAO dao = new ProdutoDAO();
		
		int id_cliente = parseInt(showInputDialog("ID do cliente"));
		String ind_produto_cont = opcaoProdutoContratado();
		dao.inserir(new Produto(ind_produto_cont, id_cliente));
		
	}

	private void consultarProdutos() {
		
		ProdutoDAO dao = new ProdutoDAO();
		String id = showInputDialog("ID do cliente");
		
		List<Produto> lista = dao.listarProdutos(id);
		if(lista.isEmpty()) {
			showMessageDialog(null, "Nenhum produto cadastrado.");
		}else {
			String aux = "";
		
			for(Produto produto : lista) {
				aux += produto + "\n";
			}
			showMessageDialog(null, aux);
		}
	}

	// Método que gera o menu
	private String gerarMenu() {
		String menu = "Escolha a operação desejada:\n";
		menu += "1. Inserir\n";
		menu += "2. Pesquisar produtos por cliente\n";
		menu += "3. Voltar";
		return menu;
	}
	
	// Método que indica as opções de produtos a serem contratados
	private String opcaoProdutoContratado() {
		String[] opcao_indicador = {"Empréstimo", "Cartão", "Consignado", "Seguro", "Veículo, Conta bancária"};
		
		String produto_contratado = (String) showInputDialog(null, "Tipo de produto contratado", "Tipo de produto contratado", 3, null, opcao_indicador, opcao_indicador[0]);
		
		if(produto_contratado.equals("Empréstimo")) {
			produto_contratado = "EM";
		} else if (produto_contratado.equals("Cartão")) {
			produto_contratado = "CA";
		} else if (produto_contratado.equals("Consignado")) {
			produto_contratado = "CO";
		} else if (produto_contratado.equals("Seguro")) {
			produto_contratado = "SE";
		} else if (produto_contratado.equals("Veículo")) {
			produto_contratado = "VE";
		} else if (produto_contratado.equals("Conta bancária")) {
			produto_contratado = "CB";
		}
		return produto_contratado;
	}
}
