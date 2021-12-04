package com.streams.exercicios;

public class Movies {

	
	private String diretor;
	private double duracao;
	private String nome;
	private int ano;

	public Movies() {
	 
	}
	public Movies(String diretor, double duracao, String nome, int ano) {
 
		this.diretor = diretor;
		this.duracao = duracao;
		this.nome = nome;
		this.ano = ano;
	}
	
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "Filme [Nome=" + nome + ", duracao=" + duracao + ", diretor=" + diretor + ", ano=" + ano + "] " + "\n";
	}
	
	
	
	
}
