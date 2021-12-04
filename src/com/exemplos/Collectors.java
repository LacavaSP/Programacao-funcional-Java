package com.exemplos;

 

import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Collectors {
	
	
   public static Map<String, List<ClasseCliente>> agrupaPorEstado(List<ClasseCliente> clientes) {
      
      return clientes.stream()
            .collect(groupingBy(ClasseCliente::getEstado));
   }

   public static void main(String[] args) {
      List<ClasseCliente> clientes = new ArrayList<>();
      
      clientes.add(new ClasseCliente("José", "Campinas", "SP"));
      clientes.add(new ClasseCliente("Pedro", "Campinas", "SP"));
      clientes.add(new ClasseCliente("João", "São Paulo", "SP"));
      clientes.add(new ClasseCliente("Ana", "Recife", "PE"));
      clientes.add(new ClasseCliente("Fabiana", "Campo Grande", "MS"));
      clientes.add(new ClasseCliente("Cristiane", "Rio de Janeiro", "RJ"));
      clientes.add(new ClasseCliente("Fabricio", "Campinas", "SP"));
      clientes.add(new ClasseCliente("Julia", "Campo Grande", "MS"));
      clientes.add(new ClasseCliente("Fábio", "São Paulo", "SP"));

      Map<String, List<ClasseCliente>> clientesPorEstado = agrupaPorEstado(clientes);
      
      for (String estado : clientesPorEstado.keySet()) {
         System.out.println(estado + ": " + clientesPorEstado.get(estado));
      }
   }
}
 
