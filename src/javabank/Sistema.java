package javabank;

import java.util.Scanner;

public class Sistema {
	private Usuario usuariologado;
	public Usuario getusuariologado() {
		return usuariologado;
	}
	public void setusuariologado(Usuario usuariologado) {
		this.usuariologado = usuariologado;
	}
	public void logar() {
		Scanner sc = new Scanner(System.in);
		String nome;
		String senha;
		
        do {
        	System.out.println("\n--- TELA DE LOGIN ---");
            System.out.print("Digite o nome de usuário: ");
            nome = sc.nextLine();
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();
            System.out.println("\nLogin falhou! Nome de usuário e/ou senha incorretos.");
        }
        while (nome.equals("admin") && senha.equals("1234")); {
        	
        }
        System.out.println("\\nLogin realizado com sucesso!\"");
        	sc.close();
}

    public void menu() { 
    	int menu = 0;
    	Scanner sc = new Scanner(System.in);
    	String opcao;
    	System.out.println("\n--- TELA DE MENU ---");
        System.out.print("Digite 1 para deposito! ");
        System.out.print("Digite 2 PARA saque! ");
        System.out.print("Digite 3 para ver seu extrato! ");
        System.out.print("Digite 4 para ver seu extrato! ");
        opcao = sc.nextLine();
    	switch (menu) {
        case 1:
            opcao = "DEPOSITO!" ;
            break;
            
        case 2:
        	opcao = "SAQUE! " ;
        	break;
        case 3:
        	opcao = "VEJA SEU EXTRATO!" ;
        	break;
        case 4:
        	opcao = "SAIR!" ;
        	break;
        default: 
        	opcao = "numero invalido";
    	}
    	sc.close();
            }
    	
  public void deslogar() { 
    	
    }
	
}
