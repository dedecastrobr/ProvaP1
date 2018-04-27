package p1.prova.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import p1.prova.tools.Menu;

public class MyCar {

	public static String tipov = "";
	
	public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	public static ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

	public static List<String> opsMenuPrincipal = Arrays.asList("Clientes", "Veículos", "Gerar Dados");
	public static List<String> opsMenuClientes = Arrays.asList("Cadastrar Clientes", "Listar Clientes");
	public static List<String> opsMenuVeiculos = Arrays.asList("Lista Veículos", "Cadastrar Veículo", "Buscar Veículo");
	public static List<String> opsMenuTipoV = Arrays.asList("Carros", "Motos");

	
	public static List<String> opsMenuTipo = Arrays.asList("Carros", "Motos", "Todos");

	public static void main(String[] args) {

		System.out.println("Bem vindo à MyCar");

		Menu menu = new Menu("Menu Principal", opsMenuPrincipal);
		menu.show();
		int op = menu.getOption();
		do {
			switch (op) {
			case 0:
				Menu menuClientes = new Menu("Clientes", opsMenuClientes);
				menuClientes.show();

				int opClientes = menuClientes.getOption();
				do {
					switch (opClientes) {
					case 0:
						cadastrarCliente();
						break;
					case 1:
						listaClientes();
						break;
					default:
						break;
					}
					opClientes = menuClientes.getOption();
				} while (opClientes != 99);

				break;
			case 1:
				Menu menuVeiculos = new Menu("Veículos", opsMenuVeiculos);
				menuVeiculos.show();

				int opVeiculos = menuVeiculos.getOption();
				do {
					switch (opVeiculos) {
					case 0:
						Menu tipoVeiculos = new Menu("Listar quais veículos?", opsMenuTipo);
						tipoVeiculos.show();
						listarVeiculos(tipoVeiculos.getOption());
						break;
					case 1:
						cadastraVeiculo();
						break;
					case 2:
						buscaCarros();
						break;
					case 3:
						buscaMotos();
						break;
					default:
						break;
					}
					opVeiculos = menuVeiculos.getOption();
				} while (opVeiculos != 99);
				break;
			case 2:
				gerarDados();
				break;
			case 99:
				System.out.println("Tchau!");
				System.exit(0);
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
			op = menu.getOption();
		} while (op != 99);

	}
	private static Veiculo buscaMotos() {
		System.out.println("Placa do Veiculo: ");
		String busca = "";
		busca = Menu.scan.nextLine();
		System.out.println("Veiculo encontrado!");
    	for (Veiculo mt  : listaVeiculos) {
    		if (mt.placasVeiculo == busca) {
    			mt.setIndice(listaVeiculos.indexOf(mt));
    			return mt;
    		}
    	}
    	return null;    	
	}

	private static Carro buscaCarros() {
		System.out.println("Placa do Veiculo: ");
		String busca = "";
		busca = Menu.scan.nextLine();
		System.out.println("Veiculo encontrado!");
    	for (Veiculo cr : listaVeiculos) {
    		if (cr.placasVeiculo == busca) {
    			cr.setIndice(listaVeiculos.indexOf(cr));
    			return (Carro) cr;
    		}
    	}
    	return null;    	
	}
		
	

	private static void gerarDados() {
		
		listaVeiculos.add(new Carro("ASW4567", "UOIU3OI1U23O2I1U3U", 4));
		listaVeiculos.add(new Carro("ASD455", "7S76D7DS7D6SD76D7S", 5));
		listaVeiculos.add(new Carro("CFD2323", "OIO21IOI1OI2O1I2O1", 2));
		listaVeiculos.add(new Carro("ERW4343", "JQJQJ1JQJ1JQJ1JQJ1", 3));
		listaVeiculos.add(new Carro("GGT5555", "KQAK1KAKAL1KA1LAK2", 2));
		listaClientes.add(new Cliente("Gabriel",902139123,21312412));
		listaVeiculos.add(new Veiculo("123ABC","23141231","M"));
		
	}

	private static void cadastraVeiculo() {
		System.out.println("CADASTRO DE VEICULOS");
		Menu menuv = new Menu("Menu de Cadasto de Veiculos(1 Para carro 2 para moto)",opsMenuTipoV) ;
		int opv = menuv.getOption();
		switch (opv) {
		case 1:
			Carro cr = new Carro();
			listaVeiculos.add(cr);
			System.out.println("CARRO CADASTRADO COM SUCESSO");
			break;
		case 2:
			Moto mt = new Moto();
			listaVeiculos.add(mt);
			System.out.println("MOTO CADASTRADA COM SUCESSO");
			break;
			
		}
	}
			
		
		
	

	private static void listarVeiculos(int option) {
		String show = "";
		switch (option) {
		case 0:
			show = "C";
			break;
		case 1:
			show = "M";
			break;
		default:
			show = "T";
			break;
		}
		for (Veiculo v : listaVeiculos) {
			if (show.equalsIgnoreCase("T")) {
				v.mostraDados();
			} else {
				if (show.equalsIgnoreCase(v.getTipoVeiculo())) {
					v.mostraDados();
				}
			}

		}
	}


	private static void cadastrarCliente() {

		System.out.println("CADASTRO DE NOVO CLIENTE: ");

		Cliente cli = new Cliente();

		if (cli.getCpfCliente() != 0) {
			System.out.println("Cliente cadastrado com sucesso!");
			listaClientes.add(cli);
		} else {
			System.out.println("Erro cadastrando cliente!");
		}
	}
	public static void listaClientes() {
		System.out.println("Dados dos Clientes:");
		System.out.println("-------------------------------------------");
		int i = 0;
		for (Cliente cliente : listaClientes) {
			i = i+1;
			System.out.println("Número do cliente : "+ i);
			cliente.mostraDados();
			System.out.println("-------------------------------------------");
			
			}
		}

	}

