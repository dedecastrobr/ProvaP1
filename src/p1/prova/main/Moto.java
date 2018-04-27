package p1.prova.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import p1.prova.tools.Menu;

public class Moto extends Veiculo {

	private int cilindradasMoto = 0;

	public Moto(String placas, String renavam, int cilindradas) {
		super(placas, renavam, "M");
		cilindradasMoto = cilindradas;
	}

	public Moto() {

		super();

		Scanner scan = Menu.scan;

		try {
			System.out.println("Informe as cilindradas da moto: ");
			cilindradasMoto = scan.nextInt();
			scan.nextLine();
			this.setTipoVeiculo("M");

		} catch (InputMismatchException e) {
			this.setPlacasVeiculo("");
			this.setRenavamVeiculo("");
			System.out.println("Dados inválidos! Verifique.");
			scan.nextLine();
		}

	}

	public int getCilindradasMoto() {
		return cilindradasMoto;
	}

	public void setCilindradasMoto(int cilindradasMoto) {
		this.cilindradasMoto = cilindradasMoto;
	}

	public void mostraDados() {
		super.mostraDados();
		System.out.println("TIPO: MOTO - Cilindradas: " + cilindradasMoto);
	}
	
	public boolean save() {
		MyCar.listaVeiculos.add(this);
		return true;
	}
}
