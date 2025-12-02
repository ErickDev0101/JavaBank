package javabank;

import java.util.Scanner;

public class Sistema {
		
	}
	private Usuario usuariologado;
	public Usuario getusuariologado() {
		return usuariologado;
	}
	public void setusuariologado(Usuario usuariologado) {
		this.usuariologado = usuariologado;
	}
	public void logar() {
		String nomeString = "admin";
		String senhaString = "1234";
		System.out.println("\n--- TELA DE LOGIN ---");
        System.out.print("Digite o nome de usuário: ");
        nomeString = Scanner.nextLine();
        System.out.print("Digite a senha: ");
        senhaString = Scanner.nextLine();
        
			if ( nomeString.equals("admin") && senhaString.equals("1234")) {
				System.out.println("\\nLogin realizado com sucesso!\"");
				
			}
			else {
				System.out.println("\nLogin falhou! Nome de usuário e/ou senha incorretos.");
			}
				
		
}
    public void deslogar() { 
    	
    }
    public void menu() { 
    	
    }
    public void executaDeposito() { 
    	
    }
    public void executaSaque() { 
    	
    }
    public void executaExtrato() {
    	
    }
}
