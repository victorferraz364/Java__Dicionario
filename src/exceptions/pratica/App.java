package exceptions.pratica;

import java.util.Scanner;

public class App {

	public static void main (String[] args) {

		Produto p1 = new Produto("Tv", 20);
		comprar(p1);
	}

	public static void comprar(Produto produto) {
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Digite a quantidade: ");
				int qtd = sc.nextInt();

				baixaEstoque(produto, qtd);
				System.out.println("compra realizada");

				break;
			}
			catch(IllegalArgumentException e) {
				System.out.println("erro na compra" + e.getMessage());
			}
			catch(IllegalStateException e) {
				System.out.println("erro na compra" + e.getMessage());
				System.out.println("Deseja ativar o produto?");
				

				if (sc.nextBoolean()) {
					produto.ativar();
				}
				else {
					System.out.println("compra não pode ser realizada");
					break;
				}
			}
		}
		while (true); 


	}

	public static void baixaEstoque(Produto produto, int quantidade) {

		produto.removeQtd(quantidade);
		System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
				quantidade, produto.getQtd());;

	}
}
