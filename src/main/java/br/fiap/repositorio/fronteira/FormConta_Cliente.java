package br.fiap.repositorio.fronteira;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import br.fiap.repositorio.controle.Conta_clienteDAO;
import br.fiap.repositorio.modelo.Conta_cliente;

public class FormConta_Cliente {
	
	public void menuConta() {
		int opcao = 0;
		
		do {
			try {
				opcao = parseInt(showInputDialog(gerarMenu()));
				switch(opcao) {
					case 1:
						consultar();
						break;
				}
			} catch (NumberFormatException e) {
				showMessageDialog(null, "A op��o deve ser um n�mero entre 1 e 4\n" + e);
			}
		}while(opcao != 4);
	}

	private void consultar() {
		
		Conta_clienteDAO dao = new Conta_clienteDAO();
		int nr_agencia = parseInt(showInputDialog("N�mero da ag�ncia:"));
		int nr_conta = parseInt(showInputDialog("N�mero da conta"));
		int nr_verificador = parseInt(showInputDialog("N�mero verificador"));
		
		Conta_cliente conta = dao.pesquisarID(nr_agencia, nr_conta, nr_verificador);
		if(conta == null) {
			showMessageDialog(null, "Conta n�o existente");
		} else {
			showMessageDialog(null, conta);
		}
	}
	
	// m�todo que gera o menu
	private String gerarMenu() {
		String menu = "Escolha a opera��o desejada:\n";
		menu += "1. Pesquisar conta\n";
		menu += "2. Alterar tipo de conta\n";
		menu += "3. Fechar conta\n";
		menu += "4. Voltar";
		return menu;
	}
}
