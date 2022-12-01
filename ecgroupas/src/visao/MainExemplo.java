package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.PessoaDAO;
import modelo.Pessoa;
import modelo.Loja;

public class MainExemplo {

	public static void main(String[] args) {

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		PessoaDAO bancoPessoa = PessoaDAO.getInstancia();
		while (opcaoSelecionada != 0) {

			System.out.println("- MENU -");
			System.out.println("0 SAIR");
			System.out.println("1 CADASTRAR");
			System.out.println("2 LISTAR");
			System.out.println("3 COMPRAR");
			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				break;
			}
			case 1: {
				Pessoa p = new Pessoa();
				System.out.println("Nome:");
				String nome = leitura.nextLine();
				System.out.println("Cpf:");
				String cpf = leitura.nextLine();
				System.out.println("email");
				String email = leitura.nextLine();
				System.out.println("telefone");
				String telefone = leitura.nextLine();
				p.setNome(nome);
				p.setEmail(email);
				p.setTelefone(telefone);

				if (!cpf.isEmpty()) {
					p.setCpf(Long.valueOf(cpf));
				} else {
					System.out.println("Erro");
				}

				if (!email.isEmpty()) {
					p.setEmail(email);
				} else {
					System.out.println("Erro");
				}

				if (!telefone.isEmpty()) {
					p.setTelefone(telefone);
				} else {
					System.out.println("Erro");
				}

				boolean valida = bancoPessoa.inserir(p);
				if (valida == true) {
					System.out.println("Sucesso");
				} else {
					System.out.println("Erro ao cadastrar");
				}

			}

			case 2: {
				ArrayList<Pessoa> lista = bancoPessoa.listarPessoas();
				for (Pessoa pessoa : lista) {
					System.out.println("Cpf: " + pessoa.getCpf());
					System.out.println("Nome: " + pessoa.getNome());
					System.out.println("email: " + pessoa.getEmail());
					System.out.println("telefone: " + pessoa.getTelefone());

				}
			}
			case 3: {
				Loja loja = new Loja();

				System.out.println("Informe a quantidade de calcas que voce quer comprar: ");
				loja.calca = leitura.nextLine();
				System.out.println("Informe a quantidade de camisas que voce quer comprar: ");
				loja.camisa = leitura.nextLine();
				System.out.println("informe a quantidade de casacos que voce quer comprar: ");
				loja.casaco = leitura.nextLine();

				loja.quantidadecalca = Integer.valueOf(loja.calca) * 99;
				loja.quantidadecamisa = Integer.valueOf(loja.camisa) * 69;
				loja.quantidadecasaco = Integer.valueOf(loja.casaco) * 169;

				System.out.println("Preço total das Calcas: " + loja.quantidadecalca);
				System.out.println("Preço toral das Camisas: " + loja.quantidadecamisa);
				System.out.println("Preço toral das Casacos: " + loja.quantidadecasaco);

				loja.total = loja.quantidadecalca + loja.quantidadecamisa + loja.quantidadecasaco;

				System.out.println("O total da compra é: " + loja.total);

			}
			}

		}

		leitura.close();

	}
}
