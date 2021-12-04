package com.lambdas.testes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class LambdaSupplier {

	public static void main(String[] args) {
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

	ClasseExemplo edu = new ClasseExemplo();
	 edu.setCPF(924482824);
	 edu.setIdade(17);
	 edu.setNome("Edu");
	 
    Supplier<String> nome = () -> edu.getNome();
    
    
    
	}
 
}
