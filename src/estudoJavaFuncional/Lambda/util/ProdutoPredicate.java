package estudoJavaFuncional.Lambda.util;

import java.util.function.Predicate;

import estudoJavaFuncional.Lambda.entidade.Produto;

public class ProdutoPredicate implements Predicate<Produto> {

	@Override
	public boolean test(Produto p) {
		return p.getPreco() < 3000.0;
	}

}
