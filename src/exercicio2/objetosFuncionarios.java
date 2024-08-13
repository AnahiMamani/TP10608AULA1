package exercicio2;

public class objetosFuncionarios {
	public static void main (String[] args) {
		funcionario f = new funcionario(); //por que o primeiro "funcionario"?
		f.cargo="Estagiario";
		f.nome="Maria Antonia";
		f.salarioBruto=333.40;
		
		System.out.println(f.mostrarDados());
		System.out.println("Salario Liquido: "+f.calcularSalarioLiquido(0.11));
	}
}
