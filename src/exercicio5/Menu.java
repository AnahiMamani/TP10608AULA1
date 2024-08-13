package exercicio5;
import java.util.Scanner;

public class Menu {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	Produto p = new Produto();
	funcionario f = new funcionario();
	int fim,opcao;
	do {
		System.out.println("\n---------------Menu---------------\n Escolha a opção desejada:\n 1.- Cadastrar Funcionario\n 2.- Cadastrar Produto\n 3.- Ficha de Funcionario\n 4.- Ficha de Produto\n 5.- Total da Compra\n 6.- Salario Líquido do Funcionario\n----------------------------------");
		opcao=sc.nextInt();
		switch(opcao){
			case 1:
				System.out.print("\n----Cadastro de funcionario----\nNome:");
				f.nome=sc.nextLine();
				System.out.print("\nCargo:");
				f.cargo=sc.next();
				System.out.print("\nSalario Bruto(use , ):");
				f.salarioBruto=sc.nextDouble();
				System.out.print("-------------------------------");
			break;
			case 2:
				System.out.print("\n----Cadastro de Produto----\n Nome:");
				p.nome=sc.nextLine();
				System.out.print(" Preço:");
				p.valor=sc.nextDouble();
				System.out.print("---------------------------\n");
			break;
			case 3:
				System.out.print(f.mostrarDados());
			break;
			case 4:
				System.out.print(p.mostrarDados());
			break;
			case 5:
				System.out.print("Quantos produtos foram comprados?");
				int quant = sc.nextInt();
				System.out.print(p.calcularTotal(quant));
			break;
			case 6:
				System.out.print("\nInstira porcentagem do INSS (EX: 0,11):");
				double desconto = sc.nextDouble();
				System.out.print("Salario Liquido: "+f.calcularSalarioLiquido(desconto));
			break;
		}
		System.out.print("Finalizar sessao?sim(1)|voltar ao menu prncipal(2)");
		fim=sc.nextInt();
	}while(fim==2);
		
	}
}
