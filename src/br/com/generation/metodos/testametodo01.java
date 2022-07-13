package br.com.generation.metodos;

import java.util.Scanner;

public class testametodo01 {
	//declara variaveis globais
	static int numero3=20,numero4=10,subtracao;

	public static void main(String[] args) { // método principal
		// TODO Auto-generated method stub
		
		System.out.println("Digite os valores:");
		Scanner entrada= new Scanner(System.in);
		int numero7=entrada.nextInt();
		int numero8=entrada.nextInt();
		
		metodo01();
		metodo02();
		metodo03();
		metodo04();
		metodo05(2,8);//-->argumentos
		//System.out.println(metodofora.metodo06(1,10));
		System.out.println(metodofora.metodo06(numero7,numero8));
	}
	public static void metodo01() {
		System.out.println("Eu sou o método 01");
	}
	public static void metodo02() {
		int soma,numero1=10,numero2=20;
		soma=numero1+numero2;
		System.out.println("Soma do método02: "+soma);
	}
	public static void metodo03() {
		subtracao=numero3-numero4;
		
	}
	public static void metodo04() {
		System.out.println("Resultado do método03: "+subtracao);
	}
	public static void metodo05(int numero05,int numero06) {//parametros --> recebem valores
		int multiplicacao=numero05*numero06;
		System.out.println("Resultado multiplicação: "+multiplicacao);
	}
}
