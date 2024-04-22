package exceptions.pratica;

import collections.ExceotionCustom.ProdutoInativoExceptio;
import collections.ExceotionCustom.ProdutoSemEstoqueException;

public class Produto {

	private String name;
	private int qtd;
	private boolean ativo;

	public Produto(String name) {
		this.name = name;
		
	}
	
	public Produto(String name, int qtd) {
		this.name = name;
		this.qtd = qtd;
	}
	
	public Produto(String name, int qtd, boolean ativo) {
		this.name = name;
		this.qtd = qtd;
		this.ativo = ativo;
	}

	public String getName() {
		return name;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public void removeQtd(int qtd) throws ProdutoSemEstoqueException {
		
		if (qtd < 0 || qtd > this.qtd) {
			throw new ProdutoSemEstoqueException("Estoque insuficiente: ", this.qtd, qtd);
		}
		else if (!getAtivo()) {
			throw new ProdutoInativoExceptio("Produto inativo, retirada invalida");
		}
		this.qtd -= qtd;
	}

	public boolean isAtivo() {
		
		return ativo;
	}

	public boolean getAtivo() {
		return ativo;
	}
	
	public void ativar() {
		this.ativo = true;
	}

	@Override
	public String toString() {
		
		if (isAtivo() == false)  {
			return "[Inativo] Produto name= " + name + ", qtd=" + qtd;
		}
		else {
			return "Produto name= " + name + ", qtd=" + qtd;
		}
	}



}
