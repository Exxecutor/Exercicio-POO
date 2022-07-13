package br.com.generation.exercicios;

public class ex1cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex1 cli=new ex1();
		cli.nome="João";
		cli.mesa=10;
		cli.pedido="Pizza de Frango com Catupiry";
		
		System.out.println("Cliente="+cli.nome);
		System.out.println("Mesa="+cli.mesa);
		System.out.println("Pedido="+cli.pedido);
		cli.stauts();
		System.out.println();
		
	}

}
