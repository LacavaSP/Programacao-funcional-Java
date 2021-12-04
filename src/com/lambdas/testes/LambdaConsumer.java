package com.lambdas.testes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumer {

	public static void main(String[] args) {
		
	// Aqui a interface Consumer ser� utilizada como uma fun��o de alta ordem|
		
		 ClasseExemplo fefa = new ClasseExemplo();
		 fefa.setCPF(924482824);
		 fefa.setIdade(13);
		 fefa.setNome("fefa");
		ClasseExemplo edu = new ClasseExemplo();
	 edu.setCPF(924482824);
	 edu.setIdade(17);
	 edu.setNome("Edu");
	 
	// Instanciamos um objeto do tipo array list|	
	List<ClasseExemplo> list = Arrays.asList(edu,fefa);
	
	// Chamamos o m�todo foreach que receber� como argumentos a lista list e a lambda Consumer do tipo integer
	forEach(list, (ClasseExemplo x) -> System.out.println(x.toString()));
	 	
	}
	 
	static <T> void forEach(List<T> list, Consumer<T> consumer) {
	        for (T t : list) {
	        	
	        	// aqui o consumer ir� executar o m�todo sout contido no consumer 
	            consumer.accept(t);
	        }
}
}