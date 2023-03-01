package br.senai.sp.model;

public class Triangulo {

	public double base;
	public double ladob;
	public double ladoc;
	public double altura;
	public String nome;
	
	//criando metodos da classe
	public void mostrarDimensoes() {
		
		System.out.println("-----------------------------------");
		System.out.println(nome);
		System.out.println("-----------------------------------");
		System.out.println("Base-----> " + base);
		System.out.println("Lado B-----> " + ladob);
		System.out.println("Lado C-----> " + ladoc);
		System.out.println("Altura-----> " + altura);
		calcularArea();
		calcularPerimetro();

	}
		
		public void calcularArea( ) {
		
		double area =(base * altura) / 2;
		System.out.println("Área = " + area);
		
	}
		
		public void calcularPerimetro() {
			
			double perimetro = (altura + base + ladoc);
			System.out.println("Perimetro = " + perimetro);
			
		}
		
	
	
	}