package exercicio5;

public class funcionario {
	//atributos
	public int codfunc;
	public String nome;
	public String cargo;
	public double salarioBruto;
	//metodos
	public String mostrarDados() {
		return ("\n-----Ficha de Funcionario----- \nNome: "+this.nome+"\nCargo:"+this.cargo+"\nSalario Bruto: "+this.salarioBruto+"\n------------------------------");
	}               
	public double calcularSalarioLiquido(double desconto) {
		return this.salarioBruto-(this.salarioBruto*desconto);
	}
}
