package Roupas;

import java.util.Scanner;

public class dados extends loja{
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		cadastro pessoa = new cadastro();
		
		System.out.println("Informe seu nome: ");
		pessoa.Nome = leitura.nextLine();
		System.out.println("Informe seu Email: ");
		pessoa.Email = leitura.nextLine();
		System.out.println("informe seu CPF: ");
		pessoa.CPF = leitura.nextLine();
		System.out.println("informe seu Telefone: ");
		pessoa.Telefone = leitura.nextLine();
		
		loja Quantidade = new loja();
		
		System.out.println("Informe a quantidade de calças que você quer comprar: ");
		Quantidade.Calça = leitura.nextInt();
		System.out.println("Informe a quantidade de camisas que você quer comprar: ");
		Quantidade.Camisa = leitura.nextInt();
		System.out.println("informe a quantidade de casacos que você quer comprar: ");
		Quantidade.Casaco = leitura.nextInt();
		
		Quantidade.qtdCalça = Quantidade.Calça * 99;
		Quantidade.qtdCamisa = Quantidade.Camisa * 69;
		Quantidade.qtdCasaco = Quantidade.Casaco * 169;
		
		System.out.println("Nome: "+pessoa.Nome);
		System.out.println("Email: "+pessoa.Email);
		System.out.println("CPF: "+pessoa.CPF);
		System.out.println("telefone: "+pessoa.Telefone);
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Preço total das Calças: " +Quantidade.qtdCalça);
		System.out.println("Preço toral das Camisas: " +Quantidade.qtdCamisa);
		System.out.println("Preço toral das Casacos: " +Quantidade.qtdCasaco);
		
		Quantidade.Total = Quantidade.qtdCalça + Quantidade.qtdCamisa + Quantidade.qtdCasaco;
		
		System.out.println("O total da compra é: " +Quantidade.Total);
		
		
		
		
	}
}
