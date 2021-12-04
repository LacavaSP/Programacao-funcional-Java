package com.streams.exercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppMovies {


	public static Map<String, List<Movies>> filmesPorDiretor(List<Movies> filmesPorDiretor) {

		return filmesPorDiretor.stream()
				.collect(Collectors.groupingBy(Movies::getDiretor));
	}
	public static List<Movies> convertStream(Stream<Movies> stream){

		List<Movies> list = stream.collect(Collectors.toList());

		return list;
	}

	public static void main(String[] args) throws InterruptedException {


		Movies taxiDriver = new Movies("Stanley Kubrick", 120, "Taxi Driver", 1983);
		Movies monoBola = new Movies("Stanley Kubrick", 90, "monoBola", 2021);
		Movies osViados = new Movies("Tarantino", 60, "osVidados", 2050);
		Movies monster = new Movies("Armando Pinto", 100, "monster", 1992);
		Movies howtizer = new Movies("Gauss Muller", 110, "howtizer", 2005);

		GeradorPDF gera = new GeradorPDF();
		List<Movies> filmes = Arrays.asList(taxiDriver,monoBola,osViados,monster,howtizer);

		String diretor = "Stanley Kubrick";

		long qtdFilmes = filmes.stream().count();
		long qtdFilmesPDiretor = filmes.stream().filter(filme -> filme.getDiretor().equals(diretor)).count();
		long qtdFilmesDurMenorQue100 = filmes.stream().filter(filme -> filme.getDuracao()<100).count();

		Stream filmesD = filmes.stream().sorted(Comparator.comparing(Movies::getDuracao));
		Stream filmesO = filmes.stream().sorted(Comparator.comparing(Movies::getAno));

		gera.start();
		Thread.sleep(1000);
		System.out.println("\"Filmes sortidos por diretor: \n" + filmesPorDiretor(filmes) + " \n");
		Thread.sleep(1000);
		System.out.println("Quantidade de filmes: "+qtdFilmes+ " \n");
		Thread.sleep(1000);
		System.out.println("Quantidade de filmes produzidos pelo diretor "+diretor+": "+qtdFilmesPDiretor+ " \n");
		Thread.sleep(1000);
		System.out.println("Quantidade de filmes com menos de 100 min: "+qtdFilmesDurMenorQue100+ " \n");
		Thread.sleep(1000);
		System.out.println("Filmes sortidos por duração: \n" + convertStream(filmesD).stream().collect(Collectors.groupingBy(Movies::getDuracao)) + " \n");
		Thread.sleep(1000);
		System.out.println("Filmes sortidos por ano: \n"+ convertStream(filmesO).stream().collect(Collectors.groupingBy(Movies::getAno)) + " \n");
	}



}
