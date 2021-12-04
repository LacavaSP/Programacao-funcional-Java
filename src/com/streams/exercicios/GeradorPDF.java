package com.streams.exercicios;

public class GeradorPDF extends Thread {
 
	    @Override
	    public void run() {
	        try {
	          
	            Thread.sleep(5000);
	            System.out.println("Iniciar geração de PDF");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("PDF Gerado");
	  
	}
}
