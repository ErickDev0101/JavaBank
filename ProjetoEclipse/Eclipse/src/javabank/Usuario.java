package javabank;

public class Usuario {
	private String nome;
	private String senha;
	private Conta Nconta;
		public String getnome() {
			return nome;	
		}
		public String getsenha() { 
			return senha;
		}
		public Conta getNconta() {
			return Nconta;
		}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setconta(Conta Nconta) {
		
	}
}
