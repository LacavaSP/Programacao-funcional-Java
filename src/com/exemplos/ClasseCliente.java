package com.exemplos;

public class ClasseCliente {
	   private String nome;
	   private String cidade;
	   private String estado;

	   public ClasseCliente(String nome, String cidade, String estado) {
	      this.nome = nome;
	      this.cidade = cidade;
	      this.estado = estado;
	   }

	   public String getNome() {
	      return nome;
	   }

	   public String getCidade() {
	      return cidade;
	   }
	   
	   public String getEstado() {
	      return estado;
	   }

	   @Override
	   public String toString() {
	      return nome;
	   }

	}