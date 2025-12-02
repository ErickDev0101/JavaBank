package javabank;

public class Usuario {
	private String nome;
	private String senha;
	private Conta c;
	
		public String getnome() {
			return nome;	
		}
		public String getsenha() { 
			return senha;
		}
		public Conta getc() {
			return c;
		}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public void setconta(Conta c) {
		this.c = Conta;
		
	}
}
