package exercicio3e4;

public class Conta {
	//atributos
	public String proprietario;
	public String conta;
	public int agencia;
	public double saldo;
	//metodos
	public double sacar(int valorSaque) {
		return this.saldo=this.saldo-valorSaque;
	}
	public double depositar(int valorDeposito) {
		return this.saldo=this.saldo+valorDeposito;
	}
	public double transferir(double valorTransferir) {
		return this.saldo=this.saldo-valorTransferir;
	}
}
