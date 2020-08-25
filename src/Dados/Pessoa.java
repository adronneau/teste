package Dados;

public abstract class Pessoa {
	
	//Decalaração de variaveis
	protected String nome;
	protected String documento;
	
	//Funçao Set
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	//Função Get
	public String getNome() {
		return this.nome;
	}
	public String getDocumento() {
		return this.documento;
	}
	
	//Tipos de entradas
	public Pessoa() {
		this("","");
	}
	
	public Pessoa(String nome, String documento) {
		this.setNome(nome);
		this.setDocumento(documento);
	}
	
	public Pessoa(Pessoa nova) {
		this(nova.getNome(),nova.getDocumento());
	}
	
	
	//Exibir Dados
	public String exibeDados() {
		String retorno = "Nome: " + nome + " Documento: "  + documento;
		return retorno;
	}
}
