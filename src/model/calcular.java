package model;

import java.util.Random;

public class calcular {
	private int dificuldade;
	private int valor1;
	private int valor2;
	private int operacao;
	private int resultado;
	
	
	
	public calcular(int dificuldade) {
		
		Random rand = new Random();
		this.operacao = rand.nextInt(3);
		this.dificuldade = dificuldade;
		
		if(dificuldade == 1) {
			//facil
			this.valor1 = rand.nextInt(10);
			this.valor2 = rand.nextInt(10);
		} else if(dificuldade == 2) {
			//médio
			this.valor1 = rand.nextInt(100);
			this.valor2 = rand.nextInt(100);
		} else if(dificuldade == 3) {
			//dificil
			this.valor1 = rand.nextInt(1000);
			this.valor2 = rand.nextInt(1000);
		} else if(dificuldade == 4) {
			//expert
			this.valor1 = rand.nextInt(10000);
			this.valor2 = rand.nextInt(10000);
		}else {
			//ultimate
			this.valor1 = rand.nextInt(100000);
			this.valor2 = rand.nextInt(100000);
			
		}
		
	}

	public int getDificuldade() {
		return dificuldade;
	}
	
	public int getValor1() {
		return valor1;
	}
	public int getValor2() {
		return valor2;
	}
	public int getOperacao() {
		return operacao;
	}
	
	public int getResultado() {
		return resultado;
	}
	
	public String toString() {
		String op;
		if(this.getOperacao() == 0) {
			op = "Somar";
		} else if (this.getOperacao() == 1) {
			op = "Diminuir";
		}else if (this.getOperacao() == 2) {
			op = "Multiplicar";
		}else {
			op = "Operação Desconhecida";
		}
		return "Valor 1: " + this.getValor1() +
				"\nValor2: " + this.getValor2() +
				"\nDificuldade: " + this.getDificuldade() +
				"\nOperação: " + op;
	}
	
	public boolean somar(int resposta) {
		this.resultado = this.getValor1() + this.getValor2(); 
		boolean certo = false;
		
		if(resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			certo = true;
		} else {
			System.out.println("Reposta errada!");
		}
		System.out.println(this.getValor1() + " + " + this.getValor2()+ " = " + this.getResultado());
		return certo;
	}
	public boolean diminuir(int resposta) {
		this.resultado = this.getValor1() - this.getValor2(); 
		boolean certo = false;
		
		if(resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			certo = true;
		} else {
			System.out.println("Reposta errada!");
		}
		System.out.println(this.getValor1() + " - " + this.getValor2()+ " = " + this.getResultado());
		return certo;
	}
	
	public boolean multiplicar(int resposta) {
		this.resultado = this.getValor1() * this.getValor2(); 
		boolean certo = false;
		
		if(resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			certo = true;
		} else {
			System.out.println("Reposta errada!");
		}
		System.out.println(this.getValor1() + " * " + this.getValor2()+ " = " + this.getResultado());
		return certo;
	}
	
}
