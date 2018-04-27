package p1.prova.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import p1.prova.tools.Menu;

public class Cliente {

	private String nomeCliente = "";
	private long cpfCliente = 0;
	private long cnhCliente = 0;
	
	public Cliente(String nome, long cpf, long cnh) {
		nomeCliente = nome;
		cpfCliente = cpf;
		cnhCliente = cnh;		
	}
	
	public Cliente() {

		Scanner scan = Menu.scan;

		System.out.println("Informe o nome do cliente: ");
		nomeCliente = scan.nextLine();

		try {
			System.out.println("Informe o CPF do cliente: ");
			cpfCliente = scan.nextLong();
			scan.nextLine();

			System.out.println("Informe a CNH do cliente: ");
			cnhCliente = scan.nextLong();
			scan.nextLine();

		} catch (InputMismatchException	 e) {
			cpfCliente = 0;
			System.out.println("Dados inválidos! Verifique.");
			scan.nextLine();
		}
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public long getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(long cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public long getCnhCliente() {
		return cnhCliente;
	}

	public void setCnhCliente(long cnhCliente) {
		this.cnhCliente = cnhCliente;
	}

	public void mostraDados() {
		System.out.println("Nome: " + nomeCliente + "\nCPF: " + cpfCliente + "\nCNH " + cnhCliente);
	}
}
