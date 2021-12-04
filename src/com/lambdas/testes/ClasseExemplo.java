package com.lambdas.testes;

public class ClasseExemplo {

	private int idade;
	private String nome;
	private int CPF;
	
	
	
	
	public ClasseExemplo() {
 
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int i) {
		CPF = i;
	}
	@Override
	
	
	public String toString() {
		return "ClasseExemplo [idade=" + idade + ", nome=" + nome + ", CPF=" + CPF + "]";
	}

	
	
	
}
