package br.com.generation.exercicios;

public class ex2aviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex2 voo1= new ex2();
		
		voo1.setPassa(200);
		voo1.setDest("Buenos Aires");
		voo1.setVoo("TAM");
		
		System.out.println("Empresa= "+voo1.getVoo());
		System.out.println("Destino= "+voo1.getDest());
		System.out.println("Passageiros= "+voo1.getPassa());
		voo1.status();
		
		System.out.println();
	}

}
