package controle;
import java.util.ArrayList;

import modelo.IPessoaDAO;
import modelo.Pessoa;

public class PessoaDAO implements IPessoaDAO {
	
		private static ArrayList<Pessoa> tabelaPessoas;
		private static PessoaDAO instancia;

		
		private PessoaDAO() {
		}

		
		public static PessoaDAO getInstancia() {

			if (instancia == null) {
				instancia = new PessoaDAO();
				tabelaPessoas = new ArrayList<>();
			}

			return instancia;
		}

		public boolean inserir(Pessoa p) {
			if (p != null) {
				tabelaPessoas.add(p);
				return true;
			}
			return false;
		}

		public boolean alterar(Pessoa p, long cpf) {
			for (Pessoa pessoa : tabelaPessoas) {

				if (pessoa.getCpf() == cpf) {
					pessoa.setNome(p.getNome());
					return true;
				}
			}
			return false;
		}

		public boolean excluir(Pessoa p, long cpf) {
			for (Pessoa pessoa : tabelaPessoas) {
				if (pessoa.getCpf() == cpf) {
					tabelaPessoas.remove(pessoa);
					return true;
				}
			}

			return false;
		}

		public ArrayList<Pessoa> listarPessoas() {
			return tabelaPessoas;
		}

	}



