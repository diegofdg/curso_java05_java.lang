package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorro;

public class TestString {

	public static void main(String[] args) {
		String nombre = "Alura"; // Inmutable
		
		String nombre2 = new String("Alura"); // No utilizada en el mundo real
		
		System.out.println("Antes de metodo: " + nombre);
		nombre = nombre.replace("A", "a");
		nombre = nombre.concat(" cursos online");
		nombre = nombre.toUpperCase();
		nombre = nombre.toLowerCase();
		
		char letra = nombre.charAt(3);
		int indice = nombre.indexOf("e");
		
		System.out.println("Después de método: "+nombre);
		System.out.println("Caracter encontrado: "+letra);
		System.out.println("Indice encontrado: "+indice);		
	}
}