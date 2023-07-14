package estudoJavaFuncional.Lambda.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import estudoJavaFuncional.Lambda.entidade.Produto;
import estudoJavaFuncional.Lambda.util.ProdutoPredicate;

public class Programa {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto(1, "TV", 1900.13));
		lista.add(new Produto(2, "PC", 5000.00));
		lista.add(new Produto(3, "CELULAR", 1500.00));
		lista.add(new Produto(4, "NOTBOOK", 3000.00));
		lista.add(new Produto(5, "CARREGADOR", 30.00));

		//lista.removeIf(p -> p.getPreco() < 3000);
		
		//Primeira forma
		lista.removeIf(new ProdutoPredicate());
		
		for(Produto produto : lista) {
			System.out.println(produto);
		}
		System.out.println();
		
		//Segunda Forma
		lista.removeIf(Produto::staticProdutoPredicate);
		
		for(Produto produto : lista) {
			System.out.println(produto);
		}
		System.out.println();
		
		//Terceira Forma
		lista.removeIf(Produto::naoStaticProdutoPredicate);
		
		for(Produto produto : lista) {
			System.out.println(produto);
		}
		System.out.println();
		
		//Quarta Forma
		Predicate<Produto> pred = p -> p.getPreco() < 3000;
		lista.removeIf(pred);
		
		for(Produto produto : lista) {
			System.out.println(produto);
		}
		System.out.println();
		
		//Quinta Forma
		lista.removeIf(p -> p.getPreco() < 3000);
		
		for(Produto produto : lista) {
			System.out.println(produto);
		}
		System.out.println();
		
		
	/*
		lista.sort((pid1, pid2) -> pid1.getCodigo().compareTo(pid2.getCodigo()));
		for(Produto produto : lista) {
			System.out.println(produto);
		}
		System.out.println();
		
		lista.sort((pr1, pr2) -> pr1.getPreco().compareTo(pr2.getPreco()));
		
		for(Produto produto : lista) {
			System.out.println(produto);
		}
		
		System.out.println();

		lista.sort((p1, p2) ->  p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
	
		for(Produto produto : lista) {			
			System.out.println(produto);
		}
	*/
	}

}
