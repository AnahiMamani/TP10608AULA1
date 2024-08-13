package exercicio1;
import java.util.Scanner;
public class scanObjetosProduto {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto p = new Produto();
		
		System.out.print("\n----Cadastro de Produto----\n Nome:");
		p.nome=sc.nextLine();
		System.out.print(" Preço:");
		p.valor=sc.nextDouble();
		System.out.print("---------------------------\n");
		System.out.print(p.mostrarDados());
	}
}
