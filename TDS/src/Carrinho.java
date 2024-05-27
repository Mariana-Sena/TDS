import java.util.Date;

public class Carrinho {
	
	private Date criacao;
	private Produto[] itens;
	
	
	public Carrinho (Date criacao, Produto[] itens) {
		this.criacao = criacao;
		this.itens =itens;
	}

	public Date getCriacao() {
		return criacao;
	}

	public void setCriacao(Date criacao) {
		this.criacao = criacao;
	}

	public Produto[] getItens() {
		return itens;
	}

	public void setItens(Produto[] itens) {
		this.itens = itens;
	}
}
