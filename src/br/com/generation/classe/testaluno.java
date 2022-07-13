package br.com.generation.classe;

public class testaluno {

	public static void main(String[] args) {
		// estanciar o objeto--> criar objeto
		
		aluno xuxu=new aluno();
		xuxu.nome="Ingrid";
		xuxu.idade=22;
		xuxu.curso="java";
		
		
		System.out.println(xuxu.nome);
		System.out.println(xuxu.idade);
		System.out.println(xuxu.curso);
		xuxu.estudar();
		System.out.println();
		
	}

}
