package br.fiap.repositorio.fronteira;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class FormPrincipal {

	
	public void menuPrincipal() {
		int opcao = 0;
		
		do {
			try {
				opcao = parseInt(showInputDialog(gerarMenu()));
				switch(opcao) {
					case 1:
						new FormCliente().menuCliente();
						break;
					case 2:
						new FormConta_Cliente().menuConta();
						break;
					case 3:
						new FormProduto().menuProduto();
						break;
				}	
			} catch(NumberFormatException e) {
					showMessageDialog(null, "A opção deve ser um número entre 1 e 4\n" + e);}
		} while(opcao != 4);		
	}
	

	private String gerarMenu() {
		String menu = "Escolha uma tabela:\n";
		menu += "1. Cliente\n";
		menu += "2. Conta_Cliente\n";
		menu += "3. Produto\n";
		menu += "4. Sair";
		return menu;
				
	}
}
