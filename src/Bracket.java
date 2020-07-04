package com.desafio.api;

import java.util.Scanner;
import java.util.Stack;

import org.springframework.util.StringUtils;

public class Bracket {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
					System.out.println("Entre com algum dos elementos \"(){()}{}\"");
			        System.out.println("Resultado: " + balanciado(sc.next()));
                    sc.close();
		}

		 static boolean balanciado(String valor) {
			Stack<String> pilha = new Stack<>();
			String[] vetor = valor.split("");
			
			if(StringUtils.isEmpty(valor)) {
				return false;
			}
			
			for (int i = 0; i < vetor.length; i++) {
				String elemento = vetor[i];
				if(elemento.equals("(") || elemento.equals("{") || elemento.equals("[")) {
					pilha.push(elemento);
					continue;
				}
				
				String ultimoElemento = null;
				switch (elemento) {
				case ")":
					ultimoElemento = (!pilha.isEmpty() ? pilha.pop() : null);
					if(StringUtils.isEmpty(ultimoElemento) || ultimoElemento.equals("{") || ultimoElemento.equals("[")) {
						return false;
					}
					break;
				
				case "}":
					ultimoElemento = (!pilha.isEmpty() ? pilha.pop() : null);
					if(StringUtils.isEmpty(ultimoElemento) || ultimoElemento.equals("(") || ultimoElemento.equals("[")) {
						return false;
					}
					break;
					
				case "]":
					ultimoElemento = (!pilha.isEmpty() ? pilha.pop() : null);
					if(StringUtils.isEmpty(ultimoElemento) || ultimoElemento.equals("{") || ultimoElemento.equals("(")) {
						return false;
					}
					break;
				}
			}
			
			return pilha.isEmpty();

	}

}
