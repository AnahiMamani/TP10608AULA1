package exercicio1;

public class objetosProduto {
	public static void main(String[] args) {
		Produto p=new Produto();
		p.nome="Caderno";
		p.valor=10.90;
		//System.out.println(" Nome: "+p.nome+"\n Preço: R$"+p.valor);
		System.out.println(p.mostrarDados());
		System.out.println(" Total R$ "+ p.calcularTotal(10));
	}
}
