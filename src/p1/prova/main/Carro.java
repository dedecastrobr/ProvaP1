package p1.prova.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import p1.prova.tools.Menu;

public class Carro extends Veiculo {

	private int numeroPortas = 0;

	public Carro(String placas, String renavam, int portas) {
		super(placas, renavam, "C");
		numeroPortas = portas;
	}

	public Carro() {

		super();

		Scanner scan = Menu.scan;

		try {
			System.out.println("Informe o número de portas do carro: ");
			numeroPortas = scan.nextInt();
			scan.nextLine();

			this.setTipoVeiculo("C");

		} catch (InputMismatchException e) {
			this.setPlacasVeiculo("");
			this.setRenavamVeiculo("");
			System.out.println("Dados inválidos! Verifique.");
			scan.nextLine();
		}

	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public void mostraDados() {
		super.mostraDados();
		System.out.println("TIPO: CARRO - Número de Portas: " + numeroPortas);
	}
	
	public boolean save() {
		MyCar.listaVeiculos.add(this);
		return true;
	}

}
