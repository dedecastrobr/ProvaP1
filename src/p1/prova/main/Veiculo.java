package p1.prova.main;

import java.util.Scanner;

import p1.prova.tools.Menu;

public class Veiculo {

	String placasVeiculo;
	private String renavamVeiculo;
	private String tipoVeiculo;
	private int indice;

	public Veiculo(String placas, String renavam, String tipo) {
		placasVeiculo = placas;
		renavamVeiculo = renavam;
		tipoVeiculo = tipo;
	}

	public Veiculo() {

		Scanner scan = Menu.scan;

		System.out.println("Informe o RENAVAM do veículo: ");
		renavamVeiculo = scan.nextLine();

		System.out.println("Informe as placas do veículo: ");
		placasVeiculo = scan.nextLine();
		


	}

	public String getPlacasVeiculo() {
		return placasVeiculo;
	}

	public void setPlacasVeiculo(String placasVeiculo) {
		this.placasVeiculo = placasVeiculo;
	}

	public String getRenavamVeiculo() {
		return renavamVeiculo;
	}

	public void setRenavamVeiculo(String renavamVeiculo) {
		this.renavamVeiculo = renavamVeiculo;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public void mostraDados() {
		System.out.println("------------------------------------------");
		System.out.println("Placas: " + placasVeiculo + " RENAVAM: " + renavamVeiculo);
	}
    public int getIndice() {
		return indice;
    }
    public void setIndice(int indice) {
		this.indice = indice;
    }
	

}
