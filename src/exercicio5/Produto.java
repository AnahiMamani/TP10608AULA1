package exercicio5;

public class Produto {
	//atibutos
	public int codigo;
	public double valor;
	public String nome;
	//metodos
	public String mostrarDados() {
		return (" \n-----Ficha de Produto-----\n Produto: "+this.nome+"\n Valor: R$"+this.valor+"\n--------------------------");
	}
	public double calcularTotal(int quant) {
		return this.valor*quant;
	}
}
