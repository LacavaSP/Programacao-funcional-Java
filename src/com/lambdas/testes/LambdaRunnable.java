package com.lambdas.testes;

 
 
import java.util.Scanner;
import java.util.function.Supplier;
 

public class LambdaRunnable {
static Scanner entrada = new Scanner(System.in);
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

	// A interface Runnable apenas serve para executar uma tarefa e retornar à thread na qual fora instanciada
	Runnable tarefa = () -> teste();

 
	// Nesse contexto o objeto tarefa irá executar primeiro as instruções do método teste. retornar à thread main e continuar o código
tarefa.run();
System.out.println("executado");
 

	}
	public static void teste () {
		
		String a = entrada.next();
		if(a.equals("a")) {
			System.out.println("oba porra");
		}
		
		
	}
	
}

