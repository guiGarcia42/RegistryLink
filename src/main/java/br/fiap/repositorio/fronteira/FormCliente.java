package br.fiap.repositorio.fronteira;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import br.fiap.repositorio.controle.ClienteDAO;
import br.fiap.repositorio.controle.Conta_clienteDAO;
import br.fiap.repositorio.modelo.Cliente;
import br.fiap.repositorio.modelo.Conta_cliente;

public class FormCliente {

	public void menuCliente() {
		int opcao = 0;

		do {
			try {
				opcao = parseInt(showInputDialog(gerarMenu()));
				switch (opcao) {
				case 1:
					inserir();
					break;
				case 2:
					consultar();
					break;
				}
			} catch (NumberFormatException e) {
				showMessageDialog(null, "A opção deve ser um número entre 1 e 3\n" + e);
			}
		} while (opcao != 3);

	}

	// método para inserir clientes e contas
	private void inserir() {
		ClienteDAO clienteDao = new ClienteDAO();
		Conta_clienteDAO contaDao = new Conta_clienteDAO();
		int nr_conta, nr_agencia, nr_verificador;
		String id_cidade, nm_cliente, cep, uf, celular, cpf, cnpj, tp_conta, tp_cliente;
		String dt_nascimento;
		String[]opcao_cliente = {"Pessoa Física", "Pessoa Jurídica"}, opcao_conta = {"Conta corrente", "Conta poupança"};
		
			nm_cliente = showInputDialog("Nome do cliente");
			dt_nascimento = showInputDialog("Data de nascimento (AAAA-MM-DD)");
			celular = showInputDialog("Celular (** *****-****)");
			id_cidade = showInputDialog("ID da cidade\nObs: Campo simbólico, será implementado com o projeto completo.");
			cep = showInputDialog("CEP (******-***)");
			uf = showInputDialog("UF");
			nr_agencia = parseInt(showInputDialog("Número da agencia (****)" ));
			nr_conta = parseInt(showInputDialog("Número da conta (*******)"));
			nr_verificador = parseInt(showInputDialog("Número verificador (**)"));
			tp_conta = (String) showInputDialog(null, "Tipo de Conta", "Tipo de Conta", 3, null, opcao_conta, opcao_conta[0]);
			if(tp_conta.equals("Conta corrente") ) {
				tp_conta = "C";
			} else {
				tp_conta = "P";
			}
			tp_cliente = (String) showInputDialog(null, "Tipo de Cliente", "Tipo de Cliente", 3, null, opcao_cliente, opcao_cliente[0]);
			
			if(tp_cliente.equals("Pessoa Física")) {
				cpf = showInputDialog("CPF (***.***.***-**)");
				tp_cliente = "F";
				/*contaDao.inserir(new Conta_cliente( // Insert na tabela CONTA_CLIENTE com CPF
						nr_agencia, 
						nr_conta, 
						nr_verificador, 
						tp_cliente, 
						tp_conta, 
						cpf));*/
			} else {
				cnpj = showInputDialog("CNPJ (**.***.***/****-**)");
				tp_cliente = "J";
				/*contaDao.inserir(new Conta_cliente( // Insert na tabela CONTA_CLIENTE com CNPJ
						nr_agencia, 
						nr_conta, 
						nr_verificador, 
						tp_cliente, 
						tp_conta, 
						cnpj));*/
			}
			//clienteDao.inserir(new Cliente(nm_cliente, dt_nascimento, cep, id_cidade, uf, nr_agencia, nr_conta, nr_verificador, celular)); // insert na tabela CLIENTE
	}

	// método para consultar clientes
	private void consultar() {

		ClienteDAO dao = new ClienteDAO();
		int id = parseInt(showInputDialog("ID do cliente"));
		String tp_cliente = showInputDialog("Tipo de cliente");

		Cliente cliente = dao.pesquisar(id, tp_cliente);
		if (cliente == null) {
			showMessageDialog(null, "Cliente não cadastrado");
		} else {
			showMessageDialog(null, cliente);
		}
	}

	// método para gerar o menu
	private String gerarMenu() {
		String menu = "Escolha a operação desejada:\n";
		menu += "1. Inserir\n";
		menu += "2. Consultar\n";
		menu += "3. Voltar";
		return menu;
	}
}
