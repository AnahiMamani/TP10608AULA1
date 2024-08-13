package exercicio2;
import java.util.Scanner;

public class scanObjetoFuncionario {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		funcionario f = new funcionario();
		
		System.out.print("\n----Cadastro de funcionario----\nNome:");
		f.nome=sc.nextLine();
		System.out.print("Cargo:");
		f.cargo=sc.next();
		System.out.print("Salario Bruto(use , ):");
		f.salarioBruto=sc.nextDouble();
		System.out.print("-------------------------------");
		System.out.print(f.mostrarDados());
		System.out.print("\nInstira porcentagem do INSS (EX: 0,11):");
		double desconto = sc.nextDouble();
		System.out.print("Salario Liquido: "+f.calcularSalarioLiquido(desconto));
		}
}