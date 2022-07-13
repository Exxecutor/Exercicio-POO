package br.com.generation.exercicios;

public class ex2 {
	/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
	 */

	//Caracterisiticas... variaveis... atributos de classe
		private int passageiros;
		private String voo;
		private String destino;	
		
		//getters e setters --> servi�os que me auxilia no acesso e na modifica��o dos daods
		public int getPassa() {
			return passageiros;
		}

		public void setPassa(int passageiros) {
			this.passageiros = passageiros;
		}

		public String getVoo() {
			return voo;
		}

		public void setVoo(String voo) {
			this.voo = voo;
		}

		public String getDest() {
			return destino;
		}

		public void setDest(String destino) {
			this.destino = destino;
		}
		
		//A��es... m�todos... fun��es
		void status() {
			System.out.println("Desembarque....");
		}
}
